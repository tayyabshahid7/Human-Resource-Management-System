/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserFunctions;

/**
 *
 * @author Tayyab
 */
public class security extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

   
      @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            /* TODO output your page here. You may use following sample code. */
            ////
            String user=request.getParameter("user");
            String code=request.getParameter("pwd");
            UserFunctions use = new UserFunctions();
           //  out.println("22222");
        try {           
            if(use.confirm(code, user))
             
            {
                
                use.changeconfirm(user);
                  //   out.println("22222");
            
              
                request.setAttribute("user", "abc");
                
                RequestDispatcher d=request.getRequestDispatcher("Login.jsp");
                d.forward(request, response);
            
            }
            else{
                
                String error="Incorrect Password. Please try again!!";
                
                //HttpSession session =request.getSession();
                
                request.setAttribute("error", error);
                
                RequestDispatcher d=request.getRequestDispatcher("Security.jsp");
                d.forward(request, response);
                
            }   
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(security.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        processRequest(request, response);
      
    }
    

    

}

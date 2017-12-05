/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HR_LOGS;
import model.UserFunctions;

/**
 *
 * @author Tayyab
 */
public class RatingsFeed extends HttpServlet {

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
    }


       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String temp=request.getParameter("call");
            String ratings=request.getParameter("rates");
            HR_LOGS hrm=new HR_LOGS();
            
            hrm.setUsername(temp);
            hrm.setRatings(ratings);
            UserFunctions user=new UserFunctions();
            user.setUsername(temp);
            
            user.GetUser();
            System.out.println(user.getEmail());
            String email=  user.getEmail();
            hrm.setEmail(email);
            
              hrm.set_user_ratings();
        

        } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
            Logger.getLogger(RatingsFeed.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
 
                  
                                 request.setAttribute("rates", "Ratings uploaded");

                    RequestDispatcher d = request.getRequestDispatcher("HRM_Home.jsp");
                    d.forward(request, response);
       // processRequest(request, response);
    }

  
}

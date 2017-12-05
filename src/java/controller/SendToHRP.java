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
import model.Email;
import model.HR_LOGS;
import model.UserFunctions;

/**
 *
 * @author Tayyab
 */
public class SendToHRP extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        
        
        
        String username=  request.getParameter("call");
         String ratings=request.getParameter("feedback");
         
         
          UserFunctions  user= new UserFunctions();
            
            user.setUsername(username);
         try {
             user.GetUser();
         } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         String email=user.getEmail();
         
            System.out.println(email);
             Email em=new Email();
           
           em.send_status(email, "Dear "+user.getName()+ ",\n\n" +"As a result of your application for the job, We had selected you for an interview. \n\n You are required to report at our office at 9 A.M."  + "\n\n" +"We look forward to seeing you.\n" +"\n" +"\nRegards SME.");
 
         
         
         
          
            HR_LOGS hr=new HR_LOGS();
            hr.setUsername(username);
            hr.setRatings(ratings);
            hr.setEmail(email);
            hr.setName(user.getName());
         
            
            
         try {
             hr.info_for_hrp();
         } catch (SQLException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        
          RequestDispatcher d = request.getRequestDispatcher("Sme_Home.jsp");
                    d.forward(request, response);
        
        
      
        }
    

    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SendToHRP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

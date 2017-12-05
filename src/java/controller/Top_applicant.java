/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Email;
import model.HR_LOGS;

/**
 *
 * @author Tayyab
 */
public class Top_applicant extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        HR_LOGS hrm=new HR_LOGS();
        try {
            ResultSet    res=hrm.get_all();
           String message="Dear user you had been Selected as our priority";
            
            while (res.next()) {
                //  String job_title = res.getString(2);
                String username = res.getString(4);
                System.out.println(username);
                Email em=new Email ();
                em.send_status(username,message);
                
                message="Dear Applicant ,\n\nWe are sorry to say that we are not much convinced by you.\n\nTry hard and see you next time.\n\n Regards HR Manager ";
              
            }
        } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
            Logger.getLogger(Top_applicant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                                 request.setAttribute("rates", "Email Sent to top Applicant and rejection email to other applicants ");

                    RequestDispatcher d = request.getRequestDispatcher("HRM_Home.jsp");
                    d.forward(request, response);
        
        
        
    }


}

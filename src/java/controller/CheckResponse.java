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
public class CheckResponse extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CheckResponse</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CheckResponse at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

   
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
   
        
     String username=request.getParameter("call");
     
      String usernames=request.getParameter("reject");
      
        if(username!=null)
     {
     System.out.println(username);
             
         int iend = username.indexOf(".");
            String subString = null;
            if (iend != -1) {
                subString = username.substring(0, iend); //this will give abc}
            }
            
            UserFunctions  user= new UserFunctions();
            
            user.setUsername(subString);
         try {
             user.GetUser();
         } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         String email=user.getEmail();
            System.out.println(email);
            HR_LOGS hr=new HR_LOGS();
            hr.setUsername(subString);
            hr.setEmail(email);
            hr.setName(user.getName());
             System.out.println(hr.getName());
            
            
         try {
             hr.info_for_sme();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
            
            
            
            Email em=new Email();
         try {
             em.send_email_to_sme(email,user.getName());
         } catch (SQLException | ClassNotFoundException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
            
         try {
             em.send_status(email, "Dear "+user.getName()+ ",\n\n" +"As a result of your application for the job, We had selected you for an interview. \n\n Timings will bw sent to you later."  + "\n\n" +"We look forward to seeing you.\n" +"\n" +"\nRegards HR Personnel.");
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
          RequestDispatcher rd = request.getRequestDispatcher("HR_Personnel.jsp");
                    rd.forward(request, response);
            
        
      
     }  
        else if(usernames!=null)
        {
     
     System.out.println(usernames);
     int iend = usernames.indexOf(".");
            String subString = null;
            if (iend != -1) {
                subString = usernames.substring(0, iend); //this will give abc}
            }
            
            UserFunctions  user= new UserFunctions();
            
            user.setUsername(subString);
         try {
             user.GetUser();
         } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         String email=user.getEmail();
            System.out.println(email);
            
            Email em=new Email();
         try {
             em.send_status(email, "Dear "+user.getName()+ ",\n\n" +"Thank you very much for your interest in our company.\n" +
"\n" +
"This message is to inform you that we have selected a candidate who is a match for the job requirements of the position.\n" +
"\n" +
"We appreciate you taking the time to apply for employment with our company and wish you the best of luck in your future endeavors.\n" +
"\n" +
"Best regards,\n" +
"\n" +
"Hiring Manager");
                     
              RequestDispatcher rd = request.getRequestDispatcher("HR_Personnel.jsp");
                    rd.forward(request, response);
             
                     
                     } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
            
        
        
        
        }
  
        
        
        
       
    }


    
    
    
    
    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
   
        
     String username=request.getParameter("call");
     
      String usernames=request.getParameter("reject");
      
        if(username!=null)
     {
     System.out.println(username);
             
         int iend = username.indexOf(".");
            String subString = null;
            if (iend != -1) {
                subString = username.substring(0, iend); //this will give abc}
            }
            
            UserFunctions  user= new UserFunctions();
            
            user.setUsername(subString);
         try {
             user.GetUser();
         } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         String email=user.getEmail();
            System.out.println(email);
            HR_LOGS hr=new HR_LOGS();
            hr.setUsername(subString);
            hr.setEmail(email);
            hr.setName(user.getName());
             System.out.println(hr.getName());
            
            
         try {
             hr.info_for_sme();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
            
            
            
            Email em=new Email();
         try {
             em.send_email_to_sme(email,user.getName());
         } catch (SQLException | ClassNotFoundException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
            
         try {
             em.send_status(email, "Dear "+user.getName()+ ",\n\n" +"As a result of your application for the job, We had selected you for an interview.\n Regards HR Personnel.");
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(CheckResponse.class.getName()).log(Level.SEVERE, null, ex);
         }
          RequestDispatcher rd = request.getRequestDispatcher("HRM_Home.jsp");
                    rd.forward(request, response);
            
        
      
     }  
       
        
        
        
       
    }
    
    
    
    
    
    
    
}

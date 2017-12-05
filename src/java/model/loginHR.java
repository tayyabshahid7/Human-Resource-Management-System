/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.HR_LOGS;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tayyab
 * 
 */

public class loginHR {
    
    
    public void log_ins(String uname,String pass,HttpServletRequest request,HttpServletResponse response)
            throws ClassNotFoundException, SQLException, InstantiationException, ServletException, IOException {
       
        HR_LOGS hrp=new HR_LOGS();
             //   out.println(uname);
             String type="hrp";
                if (hrp.LoginHR(uname, pass,type)) {

                    HR_LOGS us = new HR_LOGS();
                    
                    us.setUsername(uname);
                    
                    us.GetUser();
                  //  out.println(us.getName());
                    HttpSession sessionUser = request.getSession();

                    sessionUser.setAttribute("HR", us.getUsername());
                    sessionUser.setAttribute("HR_name",  us.getName());
                
                    
                    
                    request.setAttribute("", "");
                 //   response.sendRedirect("Register.jsp");

                         RequestDispatcher d = request.getRequestDispatcher("HR_Personnel.jsp");
                       d.forward(request, response);
                } else {

                    String error = "Error!! Please the check entered info!! ";
                    request.setAttribute("error", error);
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);

                }
        
        
    }
    
             
    public void log_ins2(String uname,String pass,HttpServletRequest request,HttpServletResponse response)
            throws ClassNotFoundException, SQLException, InstantiationException, ServletException, IOException {
       
        HR_LOGS hrp=new HR_LOGS();
             //   out.println(uname);
             String type="sme";
                if (hrp.LoginHR(uname, pass,type)) {

                    HR_LOGS us = new HR_LOGS();
                    
                    us.setUsername(uname);
                    
                    us.GetUser();
                  //  out.println(us.getName());
                    HttpSession sessionUser = request.getSession();

                    sessionUser.setAttribute("SME", us.getUsername());
                    sessionUser.setAttribute("HR_names",  us.getName());
                
                    
                    
                    request.setAttribute("", "");
                 //   response.sendRedirect("Register.jsp");

                         RequestDispatcher d = request.getRequestDispatcher("Sme_Home.jsp");
                       d.forward(request, response);
                } else {

                    String error = "Error!! Please the check entered info!! ";
                    request.setAttribute("error", error);
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);

                }
        
        
    }
    
    
     public void log_ins3(String uname,String pass,HttpServletRequest request,HttpServletResponse response)
            throws ClassNotFoundException, SQLException, InstantiationException, ServletException, IOException {
       
        HR_LOGS hrp=new HR_LOGS();
             //   out.println(uname);
             String type="hrm";
                if (hrp.LoginHR(uname, pass,type)) {

                    HR_LOGS us = new HR_LOGS();
                    
                    us.setUsername(uname);
                    
                    us.GetUser();
                  //  out.println(us.getName());
                    HttpSession sessionUser = request.getSession();

                    sessionUser.setAttribute("HRM", us.getUsername());
                    sessionUser.setAttribute("HR_name",  us.getName());
                
                    
                    
                    request.setAttribute("", "");
                 //   response.sendRedirect("Register.jsp");

                         RequestDispatcher d = request.getRequestDispatcher("HRM_Home.jsp");
                       d.forward(request, response);
                } else {

                    String error = "Error!! Please the check entered info!! ";
                    request.setAttribute("error", error);
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);

                }
        
        
    }
    
}

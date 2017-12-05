/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Email;
import model.UserFunctions;
import model.loginHR;

/**
 *
 * @author Tayyab
 */
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uname = request.getParameter("user");
        String option = request.getParameter("option");
        String pass = request.getParameter("pass");

        /// model mvc
        if (option.equals("APP")) {
            UserFunctions reg = new UserFunctions();
            Email mails = new Email();
            Random rand = new Random();

            reg.setUsername(uname);
          //  out.println(option);
            reg.setPassword(pass);
            try {

                if (reg.LoginUSer(uname, pass)) {

                    UserFunctions us = new UserFunctions();
                    us.setUsername(String.valueOf(request.getParameter("user")));

                    us.GetUser();

                    HttpSession sessionUser = request.getSession();

                    sessionUser.setAttribute("user", us.getUsername());
                      sessionUser.setAttribute("user_name","Hello "+ us.getName());
                        
                    request.setAttribute("users", us.getUsername());
                    //   response.sendRedirect("Register.jsp");
                        
                    RequestDispatcher d = request.getRequestDispatcher("ShowJobs");
                    d.forward(request, response);
                } else {

                    String error = "Error!! Please the check entered info!! ";
                    request.setAttribute("error", error);
                    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
                    rd.forward(request, response);

                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
        
        
        else if (option.equals("HRP")) {
            
            
            
            
            
      //  out.println(option);
            loginHR hrp = new loginHR();
            try {
                hrp.log_ins(uname, pass, request, response);
            } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            
            
            
        }
          else if (option.equals("SME")) {
            
            
            
            
            
      //  out.println(option);
            loginHR hrp = new loginHR();
            try {
                hrp.log_ins2(uname, pass, request, response);
            } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            
            
            
        }
        
           else if (option.equals("HRM")) {
            
            
            
            
            
      //  out.println(option);
            loginHR hrp = new loginHR();
            try {
                hrp.log_ins3(uname, pass, request, response);
            } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            
            
            
        }
        
        
        
        
        
        
        else {
            String error = "Error!! Please check the  entered info!!  ";
            request.setAttribute("error", error);
            RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
            rd.forward(request, response);

        }

        processRequest(request, response);

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Email;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserFunctions;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

/**
 *
 * @author Tayyab
 */
public class RegisterController extends HttpServlet {

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

        String name = request.getParameter("name");
        String uname = request.getParameter("user");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String phone = request.getParameter("PhoneNo");
        String address = request.getParameter("Text1");
        String Gender = request.getParameter("gender");

        /// model mvc
        UserFunctions reg = new UserFunctions();
        Email mails = new Email();
        Random rand = new Random();

        
        ////////////////     XSS
        
        
        reg.setName(Jsoup.clean(name, Whitelist.basic()));
      
        System.out.println(reg.getName());

        reg.setUsername(Jsoup.clean(uname, Whitelist.basic()));
        reg.setOption(Jsoup.clean("user", Whitelist.basic()));
        reg.setEmail(Jsoup.clean(email, Whitelist.basic()));
        reg.setPassword(Jsoup.clean(pass, Whitelist.basic()));
        reg.setPhoneno(Jsoup.clean(phone, Whitelist.basic()));
        reg.setAddress(Jsoup.clean(address, Whitelist.basic()));
        reg.setGender(Jsoup.clean(Gender, Whitelist.basic()));

//        reg.setUsername(uname);
//        reg.setOption("user");
//        reg.setEmail(email);
//        reg.setPassword(pass);
//        reg.setPhoneno(phone);
//        reg.setAddress(address);
//        reg.setGender(Gender);
//        
        int n = rand.nextInt(9999) + 1000;
        //50 is the maximum and the 1 is our minimum 
        String code = Integer.toString(n);
        reg.setConfrim(Jsoup.clean("0", Whitelist.basic()));

        //    reg.setConfrim("0");
        reg.setSecurity(Jsoup.clean(code, Whitelist.basic()));
        //  reg.setSecurity(code);

        try {
            if (reg.already(uname)) {
                try {
                    reg.RegisterUser();
                    mails.send_email(email, code, uname);

                    //String eror = "Please check your Email ";
                    request.setAttribute("", "");
                    RequestDispatcher d = request.getRequestDispatcher("Security.jsp");
                    d.forward(request, response);

                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);

                }

            } else {

                String error = "User Name already exist";
                request.setAttribute("error", error);
                RequestDispatcher rd = request.getRequestDispatcher("ErrorUSer.jsp");
                rd.forward(request, response);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }

        processRequest(request, response);

    }

}

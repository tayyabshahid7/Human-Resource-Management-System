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
import model.HR_LOGS;

/**
 *
 * @author Tayyab
 */
public class ShowAppToSme extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
        try {
            HR_LOGS sm=new  HR_LOGS();
            ResultSet res = sm.get_sme_info();
            
            
            List<String> list = new ArrayList<String>();
            
            while (res.next()) {

                String username = res.getString(3);
                list.add(username);

            }

            // System.out.println(lists.get(1));
            //   System.out.println(list.get(1));

            request.setAttribute("temp", " Applicants");
            request.setAttribute("result", list);
            //   request.setAttribute("usernames", "abc");
            //  request.setAttribute("view_all", "View all jobs");
            
            //  request.setAttribute("link", "ShowJobs");

            RequestDispatcher rd = request.getRequestDispatcher("ShowApplicants.jsp");

            rd.forward(request, response);
        } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
            Logger.getLogger(ShowAppToSme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        processRequest(request, response);
    }
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}




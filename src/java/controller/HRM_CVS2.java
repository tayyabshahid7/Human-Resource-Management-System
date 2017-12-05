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
public class HRM_CVS2 extends HttpServlet {

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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            //  System.out.println(1122);
            ResultSet res;
            HR_LOGS applicant = new HR_LOGS();

            res = applicant.hrm_info_cv();

            List<String> list = new ArrayList<String>();

            while (res.next()) {
              //  String job_title = res.getString(2);
                String username = res.getString(1);
                list.add(username);

            }

            // System.out.println(lists.get(1));
         //   System.out.println(list.get(1));

            request.setAttribute("temp", "User Applications");
            request.setAttribute("result", list);
         //   request.setAttribute("usernames", "abc");
          //  request.setAttribute("view_all", "View all jobs");

          //  request.setAttribute("link", "ShowJobs");

            RequestDispatcher rd = request.getRequestDispatcher("Rating_feedback.jsp");

            rd.forward(request, response);
              processRequest(request, response);

        } catch (SQLException | InstantiationException | ClassNotFoundException ex) {
            Logger.getLogger(GetCVS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

}

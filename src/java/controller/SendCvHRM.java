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
import model.ApplyJOBS;
import model.HR_LOGS;

/**
 *
 * @author Tayyab
 */
public class SendCvHRM extends HttpServlet {

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
        
        
        HR_LOGS top5=new HR_LOGS();
          HR_LOGS hrm=new HR_LOGS();
        try {
            ResultSet res=top5.get_top_five();
          

            while (res.next()) {
                String id = res.getString(1);
                ApplyJOBS aj=new ApplyJOBS();
                System.out.println(id);
                aj.setUsername(id);
              
                aj.get_file_namess();
                
                String temp1=aj.getFilename();
                String temp2 = aj.getEmail();
                
                 System.out.println(temp1);
                  System.out.println(temp2);
                hrm.setEmail(temp2);
                hrm.setFilename(temp1);
                hrm.setUsername(id);
                hrm.hrm_info();
                
                
                
                // list.add(id);

            }
            request.setAttribute("message", "CV's Are sent to HRM!!");
          RequestDispatcher d = request.getRequestDispatcher("HR_Personnel.jsp");
                    d.forward(request, response);
            
            
            
        } catch (ClassNotFoundException | SQLException | InstantiationException ex) {
            Logger.getLogger(SendCvHRM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

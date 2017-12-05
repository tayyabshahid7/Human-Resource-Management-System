/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import model.JOBS_Functions;

/**
 *
 * @author Tayyab
 */
public class uploadjobs extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String jobtitle = request.getParameter("job_title");
        //out.println(jobtitle);
        
        String jobdescription = request.getParameter("job_description");

        JOBS_Functions jb = new JOBS_Functions();
        jb.setJob_title(jobtitle);
        jb.setJob_description(jobdescription);
        try {
           boolean a= jb.already(jobtitle);
            if (a) {
               jb.upload_jobs();
               request.setAttribute("", "");
                
                RequestDispatcher d = request.getRequestDispatcher("UploadJobs.jsp");
                d.forward(request, response);

            } else {
                String error = "Error!!! Job of this title already exist";
                request.setAttribute("error", error);
                RequestDispatcher rd = request.getRequestDispatcher("UploadJobs.jsp");
                rd.forward(request, response);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(uploadjobs.class.getName()).log(Level.SEVERE, null, ex);
        }

        processRequest(request, response);
    }

}

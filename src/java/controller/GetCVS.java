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
import model.JOBS_Functions;

/**
 *
 * @author Tayyab
 */
public class GetCVS extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {

       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try {
            //  System.out.println(1122);
            ResultSet res;
            ApplyJOBS applicant = new ApplyJOBS();

            res = applicant.get_applicant_info();

            List<String> list = new ArrayList<String>();

            while (res.next()) {
                String job_title = res.getString(2);
                String username = res.getString(1);
                list.add(username + ". applied for " + job_title);

            }

            // System.out.println(lists.get(1));
         //   System.out.println(list.get(1));

            request.setAttribute("temp", "User Applications");
            request.setAttribute("result", list);
         //   request.setAttribute("usernames", "abc");
          //  request.setAttribute("view_all", "View all jobs");

          //  request.setAttribute("link", "ShowJobs");

            RequestDispatcher rd = request.getRequestDispatcher("ShowApplications.jsp");

            rd.forward(request, response);
              processRequest(request, response);

        } catch (SQLException | InstantiationException ex) {
            Logger.getLogger(GetCVS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetCVS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import static java.lang.System.out;
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
import javax.servlet.http.HttpSession;
import model.JOBS_Functions;

/**
 *
 * @author Tayyab
 */
public class ShowJobs extends HttpServlet {

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
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ShowJobs</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ShowJobs at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

      //  System.out.println(1122);
        ResultSet res;
        JOBS_Functions user = new JOBS_Functions();

        
       
        try {
            res = user.getjobs();
                   
                   
            List<String> list = new ArrayList<String>();

            while (res.next()) {
                String id = res.getString(1);
                
                list.add(id);

            }

         //   System.out.println(list.get(0));
            //System.out.println(list.get(1));
             
            request.setAttribute("temp", "JOBS");
            request.setAttribute("result", list);
            request.setAttribute("view_all", "View all jobs");
                    
            request.setAttribute("link", "ShowJobs");

            RequestDispatcher rd = request.getRequestDispatcher("User_Home.jsp");

            rd.forward(request, response);

        } catch (SQLException | ClassNotFoundException | InstantiationException ex) {
            Logger.getLogger(ShowJobs.class.getName()).log(Level.SEVERE, null, ex);
        }

        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String temp = request.getParameter("input");

   //     System.out.println(request.getParameter("input"));

        JOBS_Functions jb = new JOBS_Functions();
        jb.setJob_title(temp);

        if (!temp.equalsIgnoreCase("v")) {

            try {
                if (jb.job_exist()) {
                    try {
                        if (jb.job_exist()) {
               
                            String list = jb.get_job_description(temp);

                         //   System.out.println(list);
                            String a = temp;
                             HttpSession sessionUser = request.getSession();
                            sessionUser.setAttribute("jb", a);
                            
                            request.setAttribute("temp", temp);
                            request.setAttribute("job_descrip", list);
                            request.setAttribute("job_descrip1", "JOB Description:");
                            request.setAttribute("view_all", "Apply Now");
                            request.setAttribute("link", "ApplyJOB.jsp");
                                   
                            RequestDispatcher rd = request.getRequestDispatcher("User_Home.jsp");

                            rd.forward(request, response);

                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(ShowJobs.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    ResultSet res;
                    JOBS_Functions user = new JOBS_Functions();
                    try {
                        res = user.getjobs();
                    
                        List<String> list = new ArrayList<String>();

                        while (res.next()) {
                            String id = res.getString(1);
                            list.add(id);

                        }
                        
                         HttpSession sessionUser = request.getSession();
                            sessionUser.setAttribute("jb", temp);
                            
                     //   System.out.println(list.get(0));
                       // System.out.println(list.get(1));
                        request.setAttribute("temp", "JOBS");
                        request.setAttribute("result", list);
                        request.setAttribute("view_all", "View all jobs");
                        request.setAttribute("link", "ShowJobs");
                               
                        RequestDispatcher rd = request.getRequestDispatcher("User_Home.jsp");

                        rd.forward(request, response);

                    } catch (SQLException | ClassNotFoundException | InstantiationException ex) {
                        Logger.getLogger(ShowJobs.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ShowJobs.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                ResultSet res;
                JOBS_Functions user = new JOBS_Functions();
                   
                res = user.getalljobs();

                List<String> list = new ArrayList<>();

                while (res.next()) {
                    String id = res.getString(1);
                    list.add(id);

                }
                 HttpSession sessionUser = request.getSession();
                            sessionUser.setAttribute("jb", temp);
                request.setAttribute("temp", "JOBS");
                request.setAttribute("result", list);
                request.setAttribute("view_all", "GoBack");
                request.setAttribute("link", "ShowJobs");
               
                RequestDispatcher rd = request.getRequestDispatcher("User_Home.jsp");

                rd.forward(request, response);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ShowJobs.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        processRequest(request, response);
    }
}

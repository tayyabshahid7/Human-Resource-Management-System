/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ApplyJOBS;

/**
 *
 * @author Tayyab
 */
public class CheckCV extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req
     * @param res
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
 response.setContentType("text/html;charset=UTF-8");
    }

 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {

            String name = req.getParameter("input");

            int iend = name.indexOf(".");
            String subString = null;
            if (iend != -1) {
                subString = name.substring(0, iend); //this will give abc}
            }

            ApplyJOBS getfile = new ApplyJOBS();
            getfile.setUsername(subString);

            getfile.get_file_path();
            String temps = getfile.getFilename();

           // System.out.println(subString);
           // System.out.println(temps);

            ServletContext context = req.getServletContext();
            String contextpath = System.getProperty("user.dir");
            //     System.out.println(contextpath);
            contextpath = contextpath + "\\uploads";

            HttpSession session = req.getSession();
            String user_order_id = "";

            String fileName = temps;
            res.setContentType("application/pdf");
            res.setHeader("Expires", "0");
            res.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
            res.setHeader("Content-Disposition", "inline;filename=" + fileName);
            res.setHeader("Accept-Ranges", "bytes");
            File nfsPDF = new File(contextpath + File.separator + fileName);
            FileInputStream fis = new FileInputStream(nfsPDF);
            try (BufferedInputStream bis = new BufferedInputStream(fis)) {
                ServletOutputStream sos = res.getOutputStream();
                byte[] buffer = new byte[2048];
                while (true) {
                    int bytesRead = bis.read(buffer, 0, buffer.length);
                    if (bytesRead < 0) {
                        break;
                    }
                    sos.write(buffer, 0, bytesRead);
                    sos.flush();
                }
                sos.flush();
            }
        } catch (IOException e) {
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CheckCV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            processRequest(req, res);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CheckCV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.annotation.MultipartConfig;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Iterator;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;

import model.ApplyJOBS;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Tayyab
 */

    @MultipartConfig
public class ApplyJob extends HttpServlet {

 
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response,String Filename) throws ServletException, IOException, MessagingException {
       
         
            HttpSession sessionUser = request.getSession();
            String username = (String) sessionUser.getAttribute("user");
            String jb = (String) sessionUser.getAttribute("jb");/// jb is job title name
            
            
            
            ApplyJOBS jobs=new ApplyJOBS();
            jobs.setUsername(username);
            jobs.setJob_title(jb);
            jobs.setFilename(Filename);
            
            
            try {
                jobs.Job_user_details();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ApplyJob.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             response.sendRedirect("ApplyJOB.jsp");
        
        
        
        
    }

    private String getFileName(final Part part) throws MessagingException {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
           
            response.setBufferSize(10000);
          
            
            
            String path = System.getProperty("user.dir");;
            System.out.println(path);
            path=path+"\\uploads";
            System.out.println(path);
            final Part filePart = (Part) request.getPart("fname");
            
            String fileName =  getFileName(filePart);
            
            
            
            
            char ab[] = new char[fileName.length() ];
            boolean flag = false;
            int l = 0;
            for (int i = 0; i<fileName.length(); i++) {
                
                if (fileName.charAt(i) == ':') {
                    i += 2;
                    for (int j = i; j<fileName.length(); j++) {
                        ab[l++] = (char) fileName.codePointAt(j);
                        
                    }
                    flag = true;
                }
                if (flag) {
                    break;
                }
            }
            
            
            
            
            String Filename=ab.toString();
            
            
            
            OutputStream out = null;
            InputStream filecontent = null;
            final PrintWriter writer = response.getWriter();
            try {
                out = new FileOutputStream(new File(path + File.separator + (Filename)));
                filecontent = filePart.getInputStream();
                int read = 0;
                final byte[] bytes = new byte[1024];
                while ((read = filecontent.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
                //  writer.println(Filename + " created at " + path);
                System.out.println(Filename);
                
                
            } catch (FileNotFoundException fne) {
                System.out.println(Filename);
                //   writer.println("Error in file upload ERROR:" + fne.getMessage());
            } finally {
                if (out != null) {
                    out.close();
                }
                if (filecontent != null) {
                    filecontent.close();
                }
                if (writer != null) {
                     processRequest(request,response,Filename);
                //    writer.close();
                }
            }
            
          
            
            
        } catch (MessagingException ex) {
             Logger.getLogger(ApplyJob.class.getName()).log(Level.SEVERE, null,ex);
        }
     
        
        
    }

}

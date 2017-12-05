/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.oreilly.servlet.MultipartRequest;
import controller.ApplyJob;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Tayyab
 */
public class ApplyJOBS {

    String job_title;
    String username;
    String filename;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    char[] filepath;

    
    
    public char[] getFilepath() {
        return filepath;
    }

    public void setFilepath(char[] filepath) {
        this.filepath = filepath;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    ///////////////////////////////////////////////////////////////////////////////////// DB functions
    public void Job_user_details() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        String query = "INSERT INTO Applied_Job_user_details VALUES ( '" + this.getUsername() + "' ,  '" + this.getJob_title() + "'  ,  '" + this.getFilename() + "'    )";

        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);

    }

    public void get_file_path() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "SELECT top 1 filename FROM Applied_Job_user_details WHERE username = '" + this.getUsername() + "'";

        try (Statement stm = con.createStatement()) {
            stm.executeQuery(query);
            ResultSet rs = stm.getResultSet();
            while (rs.next()) {
                filename = rs.getString("filename");

            }
        }
        System.out.println(filename);

    }

    public ResultSet get_applicant_info() throws ClassNotFoundException, SQLException, InstantiationException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "select username,job_title from Applied_Job_user_details";

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        return res;

    }

    public void get_file_namess() throws ClassNotFoundException, SQLException, InstantiationException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        String query = "select filename from Applied_Job_user_details WHERE username = '" + this.getUsername() + "'";
        
        UserFunctions uf=new UserFunctions();
        System.out.println(this.getUsername());
        uf.setUsername(this.getUsername());
        uf.GetUser();
          System.out.println(uf.getEmail());
       email= uf.getEmail();
        
        try (Statement stm = con.createStatement()) {
            stm.executeQuery(query);
            ResultSet rs = stm.getResultSet();
            while (rs.next()) {

                filename = rs.getString("filename");
               

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

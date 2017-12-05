/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tayyab
 */
public class JOBS_Functions {

    String job_title;
    String job_description;

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    /////////////////////////////////////////////
    public ResultSet getjobs() throws ClassNotFoundException, SQLException, InstantiationException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "select top 3 job_title from JOBS";

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);
      

        return res;

    }
     
       public void upload_jobs() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        String query = "INSERT INTO JOBS VALUES ( '" + this.getJob_title() + "' ,  '" + this.getJob_description() + "'  )";
        
        Statement stm = con.createStatement();

        int executeUpdate = stm.executeUpdate(query);



    }
    
    
    
    
    public boolean already(String temp) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select job_title from JOBS";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String user = rs.getString("job_title");
            if (user.equals(temp)) {
                return false;
            }
        }
      
       
        return true;
    }

    public boolean job_exist() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select job_title from JOBS";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String user = rs.getString("job_title");
            if (user.equals(this.getJob_title())) {
                return true;
            }
        }
        return false;

    }

    public String get_job_description(String temp) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select * from JOBS";

        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery(sql);
        String a = null;
        while (rs.next()) {
            a = rs.getString("job_description");
            String b = rs.getString("job_title");
         //   System.out.println(a);
            if (b.equals(temp)) {
                return a;
            }
        }

        return a;

        //        Statement st = con.createStatement();
//        ResultSet res = st.executeQuery("Select * from UserFunctions");
//    
    }

    public ResultSet getalljobs() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "select job_title from JOBS";

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        return res;

    }

}

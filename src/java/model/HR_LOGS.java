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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tayyab
 */
public class HR_LOGS {

    String username;
    String name;
    String password;
    String email;
    String phone;
    String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    String Ratings;

    public String getRatings() {
        return Ratings;
    }

    public void setRatings(String Ratings) {
        this.Ratings = Ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    ///////////////////////////////////////////////////////////////////////
    public void info_for_sme() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println(222);

        System.out.println(this.getName());
        System.out.println(this.getUsername());
        System.out.println(this.getEmail());
//        String query = "INSERT INTO sme_info VALUES ( '" + this.getName() + "' ,  '" + this.getUsername() +"'  ,  '" +this.getEmail() + "')";
        Statement stm = con.createStatement();
        String query = "INSERT INTO sme VALUES ( '" + this.getName() + "' ,  '" + this.getUsername() + "' , '" + this.getEmail() + "' )";

        stm.executeUpdate(query);

//        Statement st = con.createStatement();
//        ResultSet res = st.executeQuery("Select * from UserFunctions");
//        while (res.next()) {
//            String id = res.getString(2);
//            String n = res.getString(3);
//            String pass = res.getString(4);
//            System.out.println(id + " " + n + " " + pass);
//        }
    }

    public void info_for_hrp() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println(222);

        System.out.println(this.getName());
        System.out.println(this.getUsername());
        System.out.println(this.getEmail());
//        String query = "INSERT INTO sme_info VALUES ( '" + this.getName() + "' ,  '" + this.getUsername() +"'  ,  '" +this.getEmail() + "')";
        Statement stm = con.createStatement();
        String query = "INSERT INTO hrp_info VALUES ( '" + this.getName() + "' ,  '" + this.getUsername() + "' , '" + this.getEmail() + "' ,'" + this.getRatings() + "' )";

        stm.executeUpdate(query);

//        Statement st = con.createStatement();
//        ResultSet res = st.executeQuery("Select * from UserFunctions");
//        while (res.next()) {
//            String id = res.getString(2);
//            String n = res.getString(3);
//            String pass = res.getString(4);
//            System.out.println(id + " " + n + " " + pass);
//        }
    }

    public boolean LoginHR(String users, String pass, String type) throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "select username,password,options from Register";

        Statement stm = con.createStatement();

        stm.executeQuery(query);
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String user = rs.getString("username");
            String sec = rs.getString("password");
            String opt = rs.getString("options");
            if (user.equals(users) && sec.equals(pass) && opt.equals(type)) {
                return true;
            }
        }
        return false;

    }

    public void GetUser() throws ClassNotFoundException, SQLException, InstantiationException {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

            try (Connection con = DriverManager.getConnection(connectionURL)) {
                String query = "SELECT * FROM Register WHERE username = '" + this.getUsername() + "'";

                try (Statement stm = con.createStatement()) {
                    stm.executeQuery(query);
                    ResultSet rs = stm.getResultSet();
                    while (rs.next()) {
                        name = rs.getString("name");
                        username = rs.getString("username");
                        password = rs.getString("password");
                        email = rs.getString("email");
                        phone = rs.getString("phoneNo");
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet get_sme_info() throws ClassNotFoundException, SQLException, InstantiationException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "SELECT * FROM sme";

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        return res;

    }

    public ResultSet GetInfo_SentBySME() throws ClassNotFoundException, SQLException, InstantiationException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "SELECT * FROM hrp_info";

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        return res;

    }

    public ResultSet hrm_info_cv() throws ClassNotFoundException, SQLException, InstantiationException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "SELECT username from hrm";

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        return res;

    }

    public ResultSet get_top_five() throws ClassNotFoundException, SQLException, InstantiationException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "Select top 5 username from hrp_info  order by ratings desc";

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        return res;

    }
    
       public ResultSet get_all() throws ClassNotFoundException, SQLException, InstantiationException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String query = "Select * from user_ratings order by ratings desc";

        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        return res;

    }

    

    public void hrm_info() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println(222);

        System.out.println(this.getUsername());
        System.out.println(this.getEmail());
//        String query = "INSERT INTO sme_info VALUES ( '" + this.getName() + "' ,  '" + this.getUsername() +"'  ,  '" +this.getEmail() + "')";
        Statement stm = con.createStatement();
        String query = "INSERT INTO hrm VALUES ( '" + this.getUsername() + "' ,  '" + this.getFilename() + "' , '" + this.getEmail() + "' )";

        stm.executeUpdate(query);

//        Statement st = con.createStatement();
//        ResultSet res = st.executeQuery("Select * from UserFunctions");
//        while (res.next()) {
//            String id = res.getString(2);
//            String n = res.getString(3);
//            String pass = res.getString(4);
//            System.out.println(id + " " + n + " " + pass);
//        }
    }

    public void set_user_ratings() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println(222);

        System.out.println(this.getUsername());
        System.out.println(this.getEmail());
//        String query = "INSERT INTO sme_info VALUES ( '" + this.getName() + "' ,  '" + this.getUsername() +"'  ,  '" +this.getEmail() + "')";
        Statement stm = con.createStatement();
        String query = "INSERT INTO user_ratings VALUES ( '" + this.getUsername() + "' ,  '" + this.getRatings() + "' , '" + this.getEmail() + "' )";

        stm.executeUpdate(query);

//        Statement st = con.createStatement();
//        ResultSet res = st.executeQuery("Select * from UserFunctions");
//        while (res.next()) {
//            String id = res.getString(2);
//            String n = res.getString(3);
//            String pass = res.getString(4);
//            System.out.println(id + " " + n + " " + pass);
//        }
    }

}

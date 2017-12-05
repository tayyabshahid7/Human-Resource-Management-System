/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.servlet.http.HttpServlet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.registry.infomodel.User;

/**
 *
 * @author Tayyab
 */
public class UserFunctions extends HttpServlet {

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    int ID;
    String username;
    String email;
    String password;
    String address;
    String gender;
    String phoneno;
    String name;
    String security;
    String confrim;
    String option;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public String getConfrim() {
        return confrim;
    }

    public void setConfrim(String confrim) {
        this.confrim = confrim;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////// SQL

    public void RegisterUser() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println(this.getName());

        String usernames = this.getUsername();
        String pass=this.getPassword();
        String txtname = this.getName();//("UserId");
        String emails = this.getEmail();
        String phones = this.getPhoneno();
        String addresss = this.getAddress();
        String gend = this.getGender();
        String sec = this.getSecurity();
        String confirm = this.getConfrim();
        String opt = this.getOption();

        //    String query = "INSERT INTO Register VALUES ( '" + this.getName() + "' , '" + this.getUsername() + "'   ,   '" + this.getEmail() + "'  ,  '" + this.getPassword() + "' ,  '" + this.getPhoneno() + "'   ,    '" + this.getAddress() + "','" + this.getGender() + "' , '" + this.getSecurity() + "','" + this.getConfrim() + "' ,'" + this.getOption() + "')";
       
        PreparedStatement updateemp = con.prepareStatement( "INSERT INTO Register VALUES ( ?,?,?,?,?,?,?,?,?,?)" );

        updateemp.setString(1, usernames);
        updateemp.setString(2, txtname);
        updateemp.setString(3, emails);
        updateemp.setString(4, pass);
        updateemp.setString(5, phones);
        updateemp.setString(6, addresss);
        updateemp.setString(7, gend);
        updateemp.setString(8, sec);
        updateemp.setString(9, confirm);
        updateemp.setString(10, opt);
        
        System.out.println(1);
        updateemp.executeUpdate();

//      Statement stmt = con.createStatement();
//      String query = "select * from emp";
//      ResultSet rs =  stmt.executeQuery(query);
//      System.out.println("Id Name    Job");
        //    String query = "INSERT INTO Register VALUES ( '" + this.getName() + "' , '" + this.getUsername() + "'   ,   '" + this.getEmail() + "'  ,  '" + this.getPassword() + "' ,  '" + this.getPhoneno() + "'   ,    '" + this.getAddress() + "','" + this.getGender() + "' , '" + this.getSecurity() + "','" + this.getConfrim() + "' ,'" + this.getOption() + "')";
        // Statement stm = con.createStatement();
        //   int executeUpdate = stm.executeUpdate(query);
//        Statement st = con.createStatement();
//        ResultSet res = st.executeQuery("Select * from UserFunctions");
//        while (res.next()) {
//            String id = res.getString(2);
//            String n = res.getString(3);
//            String pass = res.getString(4);
//            System.out.println(id + " " + n + " " + pass);
//        }
    }

    public boolean already(String temp) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select username from Register";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String user = rs.getString("username");
            if (user.equals(temp)) {
                return false;
            }
        }
        return true;
    }

    public boolean confirm(String code, String users) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);

        String sql = "select username,securitycode from Register";

        Statement stm = con.createStatement();

        stm.executeQuery(sql);
        ResultSet rs = stm.getResultSet();

        while (rs.next()) {
            String user = rs.getString("username");
            String sec = rs.getString("securitycode");
            if (user.equals(users) && sec.equals(code)) {
                return true;
            }
        }
        return false;
    }

    public void changeconfirm(String user) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

        Connection con = DriverManager.getConnection(connectionURL);
        String query = "update Register set confrim='" + 1 + "' where username='"
                + user + "'";
        //out.println("tayyab");

        //     pst.executeUpdate();
        //     String query ="UPDATE UserFunctions SET confiirm='"+1+"' where username='"+user+"'";
        Statement stmt = (Statement) con.createStatement();
        stmt.executeUpdate(query);
//"UPDATE users SET confirm='"+1+"' where username='"+user+"'";

    }

    public boolean LoginUSer(String users, String pass) throws ClassNotFoundException, SQLException {

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
            if (user.equals(users) && sec.equals(pass) && opt.equals("user")) {
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
                        phoneno = rs.getString("phoneNo");
                        gender = rs.getString("gender");
                        ID = rs.getInt("id");
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Getstatus() throws ClassNotFoundException, SQLException, InstantiationException {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost:1434;databaseName=HRMS;user=testing;password=12345678";

            try (Connection con = DriverManager.getConnection(connectionURL)) {
                String query = "SELECT * FROM statuss WHERE id = '" + this.getID() + "'";

                try (Statement stm = con.createStatement()) {
                    stm.executeQuery(query);
                    ResultSet rs = stm.getResultSet();
                    while (rs.next()) {

                        username = rs.getString("username");

                        email = rs.getString("email");
                        status = rs.getString("status");
                        ID = rs.getInt("id");
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

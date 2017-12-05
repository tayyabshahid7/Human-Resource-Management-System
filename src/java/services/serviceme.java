/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Tayyab
 */
@WebService(serviceName = "serviceme")
public class serviceme {

//    /**
//     * This is a sample web service operation
//     * @param txt
//     * @return 
//     * @throws java.lang.ClassNotFoundException
//     * @throws java.sql.SQLException
//     */
    @WebMethod(operationName = "UserName")
    public String username(@WebParam(name = "name") String txt)  {
                
        try {
            UserFunctions user=new UserFunctions();
            user.setUsername(txt);
            user.GetUser();
         
            
            
            
            return "User ID is: "+user.getID()+"  Name is : "  +user.getName() + "    Email is: " +user.getEmail()+"   Phone no is: " +user.getPhoneno() +"  Gender is: "+user.getGender();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(serviceme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(serviceme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(serviceme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

 
   
 @WebMethod(operationName = "ID")
    public String ID_Status(@WebParam(name = "name") int txt)  {
                
        try {
            UserFunctions user=new UserFunctions();
            user.setID(txt);
            user.Getstatus();
         
            
            
             
            return   "User ID is: "+user.getID() + "  Status is : "+user.getStatus() +"  Email is: " +user.getEmail();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(serviceme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(serviceme.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(serviceme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

}

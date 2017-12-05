<%-- 
    Document   : Home
    Created on : Mar 20, 2017, 3:11:38 AM
    Author     : Tayyab
--%>

<%
 
     String username=(String)session.getAttribute("user");
     
    
    
     if(username==null) 
         {
              response.sendRedirect("Login.jsp");
           // RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
            
         //out.println("You are already not login <a href=\"index.jsp\">Back</a>");
     }
    
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page import="java.util.Locale.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Latest compiled and minified CSS -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Home</title>

        
    </head>
    
    <body style="background-color: dimgray">





        <nav class="navbar navbar-inverse" >

            <div class="container" >

                <!-- logo-->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MainNavBar" >
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="ShowJobs?method=get&input=a" Home class="navbar-brand" style="font-size:90 ;color:wheat" >Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
                </div>

                <!--menu-item-->
                <div class="collapse navbar-collapse" id="MainNavBar">
                    <ul class="nav navbar-nav">



                        <li class="active">
                            <a href="ShowJobs?method=get&input=a"> Home</a>
                        </li>



                        <li ><a href="ContactUS.jsp">Contact Us</a></li>
                        <li>
                        
                            <a href="AboutHR.jsp">About HR</a>
                        
                        </li>

                    </ul>




                    <ul class="nav navbar-nav navbar-right">

                        <!--
                                            <li ><a href="Login.jsp">Login</a></li>
                                            <li ><a href="Register.jsp">Register</a></li>-->
                         <li><a href="#" style="color:wheat;font-weight:bold" > <%= session.getAttribute("user_name") %></a> </li>
                        <li><a href="Logout.jsp">Logout</a></li>

                    </ul>




                </div>

            </div>


        </nav>

        <div class="modal-dialog" style="padding-left:150px;" >


            <div class="loginmodal-container" style="background-color:whitesmoke;">



                <center>
                    <br/>
                    <h1>${temp}</h1><br>

                    <table>
                        <tr>
                        <td>
                        <c:forEach var="url" items="${result}">
                            <a  style="color:#357ae8;font-size: 17px;font-weight:bold " href="ShowJobs?method=GET&input=${url}"> ${url}</a>
                            <br>
                        </c:forEach>
                        </td>
                        </tr>
                     </table>




                </center>



                <p style="padding-left: 65px;font-weight:bold ;font-family:initial;font-size: 30px ">${job_descrip1}</p>

                <h1 style="font-size: 20px;padding-left: 30px;font-family:initial;">
                    ${job_descrip}

                </h1>
                    <br>
                <center>   
                 
                    
        <input type="submit" name="SignUp"  id="a" class="btn btn-primary" value="${view_all}" onclick="document.location.href  = '${link}?method=get&input=v';" >
        
            
                </center>

            <br/>
            <br/>

            </div>
        </div>







        <br/><br/>



        <div align="center">
            <!-- FOOTER -->
            <footer>

                <p style="color:#dddddd">© 2017 Company, Inc. · <a style="color:#dddddd" href="#">Privacy</a> · <a style="color:#dddddd" href="#">Terms</a></p>
            </footer>

        </div>




    </body>
</html>


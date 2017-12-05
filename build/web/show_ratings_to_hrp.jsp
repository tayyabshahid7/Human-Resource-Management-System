<%-- 
    Document   : Home
    Created on : Mar 20, 2017, 3:11:38 AM
    Author     : Tayyab
--%>

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
        <title>HR Personnel</title>
        
        
    
        
        
    </head>
    <body style="background-color: dimgray">




            <nav class="navbar navbar-inverse">
                <div class="container" >
                    <!-- logo-->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MainNavBar" >
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href="HR_Personnel.jsp" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
                    </div>

                    <!--menu-item-->
                    <div class="collapse navbar-collapse" id="MainNavBar">
                        <ul class="nav navbar-nav">
                            <li class="active" ><a href="HR_Personnel.jsp"><span class="glyphicon glyphicon-play"></span>&nbsp SME's Home</a></li>
                            <!--<li><a href="UploadJobs.jsp" >Upload Jobs</a></li>-->

                            <!--  <li ><a href="About%20HR.html">About HR</a></li>-->
                            <!-- <li><a href="Contact%20US.html" >Contact US</a></li> -->


                        </ul>

                        <ul class="nav navbar-nav navbar-right">


                            <!--  <li ><a href="#">HR Login</a></li>
                            -->      <li><a href="#"  style="color:wheat;font-weight:bold" >Hello <%= session.getAttribute("HR_name")%></a> </li>
                            <li><a href="Logout.jsp">Logout</a></li>

                        </ul>




                    </div>

                </div>


            </nav>


                            <form action="SendToHRP" method="post">

            <div class="modal-dialog" style="padding-left:130px; width:900px " >


                <div class="loginmodal-containers" style="background-color:whitesmoke;">



                    <center>
                        <br/>
                        <h1>${temp}</h1><br>

                        
                        <table align="center" id="t01" >



                            <c:forEach var="url" items="${result}" >
                                <tr>
                                    <td>
                                        <h4 style="color: #357ae8">${url}</h4>
                                    </td>
                                    
<!--                                     <td>     
                                         <span style="padding-left:15px; "><input type="text" name="feedback" maxlength="6" placeholder="0-10"> </span>
                                    </td>
                                    
                                    
                                    <td>     
                                        <span style="padding-left:100px; ">
                                            
                                            <button class="btn btn-primary"   name="call"  type="submit" value="${url}">Send Ratings and Call for interview</button></span>
                                            
                                    
                                    
                                    </td>
                                  -->
                                    
                                   
                                   
                                  
                                </tr>
                                <tr>
                                    <td><br></td>
                                </tr>
                            </c:forEach>




                        </table>



                    </center>


                    <br>

                    <br/>
                    <br/>

                </div>
            </div>

                            </form>




















            <br/><br/>



            <div align="center">
                <!-- FOOTER -->
                <footer>

                    <p style="color:#dddddd">© 2017 Company, Inc. · <a style="color:#dddddd" href="#">Privacy</a> · <a style="color:#dddddd" href="#">Terms</a></p>
                </footer>

            </div>



        </form>
    </body>
</html>


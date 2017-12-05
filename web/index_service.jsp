<%-- 
    Document   : Login
    Created on : Mar 20, 2017, 12:00:24 AM
    Author     : Tayyab
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link rel="stylesheet" href="CSS.css">
        <!-- Latest compiled and minified CSS -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>Login
        </title>



       
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
                    <a href="#" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
                </div>

                <!--menu-item-->
                <div class="collapse navbar-collapse" id="MainNavBar">
                    <ul class="nav navbar-nav">
                        <li ><a href="Home.jsp">Web Service</a></li>
                        <!--<li ><a href="ContactUS.jsp">Contact Us</a></li>-->


                    </ul>
<!--
                    <ul class="nav navbar-nav navbar-right">


                        <li class="active"><a href="Login.jsp"> Login</a></li>
                        <li ><a href="Register.jsp">Register</a></li>
                         <li><a href="#">Logout</a></li>

                    </ul>-->




                </div>

            </div>


        </nav>


        <div class="modal-dialog" >
            <div class="loginmodal-container" style="background-color:whitesmoke">


                <h1>Service</h1><br>


                <form method="POST" action="show_service.jsp" >



                    <div style="color: #FF0000 ;font-size:18px ">${error}</div>
                  
                    <label>Search Applicant By ID</label><br>
                    <input type="text" id="user" name="ID" placeholder="Enter Username" >

                   

                    <br>

                    <input type="submit" style="height: 50px" name="service" class="btn btn-primary" value="Submit" >
                </form>
                    
                    
                     <form method="POST" action="show_service2.jsp" >



                    <div style="color: #FF0000 ;font-size:18px ">${error}</div>
                    
                   <label>Search Applicant By Username</label>
                    <input type="text" id="user" name="user" placeholder="Enter Username" >

                   

                    <br>

                    <input type="submit" style="height: 50px" name="service" class="btn btn-primary" value="Submit" >
                </form>

            </div>
        </div>
        <div align="center">
            <!-- FOOTER -->
            <footer>

                <p style="color:#dddddd">© 2017 Company, Inc. · <a style="color:#dddddd" href="#">Privacy</a> · <a style="color:#dddddd" href="#">Terms</a></p>
            </footer>

        </div>



    </body>
</html>
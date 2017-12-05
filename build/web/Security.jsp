<%-- 
    Document   : Security
    Created on : Mar 18, 2017, 11:55:47 PM
    Author     : Tayyab
--%>




<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link href="CSS.css" rel="stylesheet" type="text/css"/>

        <!-- Latest compiled and minified CSS -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>Security Code Confirmation
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
                    <a href="Home.html" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
                </div>

                <!--menu-item-->
                <div class="collapse navbar-collapse" id="MainNavBar">
                    <ul class="nav navbar-nav">
                        <li ><a href="Home.html">Home</a></li>
                        <li ><a href="Contact%20US.html">Contact Us</a></li>



                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">

                        <li ><a href="HR%20Login.html">Login</a></li>
                        <li class="active"><a href="Register.jsp">Register</a></li>
                        <!-- <li><a href="#">Logout</a></li>-->

                    </ul>




                </div>

            </div>


        </nav>

        <div class="modal-dialog" >
            <div class="loginmodal-container" style="background-color:whitesmoke">
                <h1>Please Check Your Email for Security Code!!</h1><br>
                <form method="post" action="security">
                    <div style="color: #FF0000;">${error}</div>

                    <br/>
                    UserName:

                    <input type="text" name="user" placeholder="Username" >
                    Security Code:<br/>
                    <input  type="password" name="pwd" placeholder="Security Code" >


                    <input type="submit" name="confirm"  style="height: 50px" class="btn btn-primary"   value="Confrim">
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
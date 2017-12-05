<%-- 
    Document   : Login
    Created on : Mar 20, 2017, 12:00:24 AM
    Author     : Tayyab
--%>
<%
 
     String username=(String)session.getAttribute("user");
      String usernames=(String)session.getAttribute("HR");
      
          String usernamess=(String)session.getAttribute("SME");     
    if(username!=null)
        {
          
              response.sendRedirect("User_Home.jsp");
        }
    else if(usernames!=null)
    {
    
              response.sendRedirect("HR_Personnel.jsp");
    }
     else if(usernamess!=null)
    {
    
              response.sendRedirect("Sme_Home.jsp");
    }
    
 
 
 
%>

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



        <script>

            function myfunc() {
                var x = document.getElementById("HR");
                var y = x.options[x.selectedIndex].value;
                if (y == "a")
                {
                    //alert("sa");
                    window.open('HR Personnel.html')

                } else if (y == "b")
                {

                    window.open('HR Manager.html')

                } else if (y == "c")
                {

                    window.open('HR Manager.html')

                } else if (y == "d")
                {

                    window.open('SME.html')

                }
            }

        </script>
    </head>





    <body style="background-color: dimgray">




<!--navbar-inverse-->

        <nav class="navbar navbar">
            <div class="container" >
                <!-- logo-->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MainNavBar" >
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="Home.jsp" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
                </div>

                <!--menu-item-->
                <div class="collapse navbar-collapse" id="MainNavBar">
                    <ul class="nav navbar-nav">
                        <li ><a href="Home.jsp">Home</a></li>
                        <li ><a href="ContactUS.jsp">Contact Us</a></li>


                    </ul>

                    <ul class="nav navbar-nav navbar-right">


                        <li class="active"><a href="Login.jsp"> Login</a></li>
                        <li ><a href="Register.jsp">Register</a></li>
                        <!-- <li><a href="#">Logout</a></li>-->

                    </ul>




                </div>

            </div>


        </nav>


        <div class="modal-dialog" >
            <div class="loginmodal-container" style="background-color:whitesmoke">


                <h1>Login to Your Account</h1><br>


                <form method="POST" action="LoginController" >



                    <div style="color: #FF0000 ;font-size:18px ">${error}</div>
                    <input type="text" name="user" placeholder="Username" required>
                    <input type="password" name="pass" placeholder="Password" required>

                    <span>
                        <h4 style="font-family:'Times New Roman';font-size: 16px "> 
                            User Type:
                            <select id="HR" size="height:3px"  name="option" class="eduction" required>

                                <option   value="HRP" >HR Personnel</option>
                                <option   value="HRM"  >HR Manager</option>
                                <option   value="APP" >Applicant</option>
                                <option   value="SME" >SME</option>

                            </select></h4>
                    </span>

                    <br>

                    <input type="submit" style="height: 50px" name="login" class="btn btn-primary" value="Login" >
                </form>

                <div class="login-help">
                    <a style=" color:#d13333"href="Register.jsp">New here? Register</a>
                </div>
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
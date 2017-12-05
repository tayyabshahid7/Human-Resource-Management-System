<%-- 
    Document   : Reigster
    Created on : Mar 17, 2017, 11:40:24 PM
    Author     : TayyabShahid
--%>

<%

    String username = (String) session.getAttribute("user");
    String usernames = (String) session.getAttribute("HR");
    if (username != null) {

        response.sendRedirect("User_Home.jsp");
    } else if (usernames != null) {

        response.sendRedirect("HR_Personnel.jsp");
    } else {
        String error = "";
        request.setAttribute("error", error);
        // RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");

        //out.println("You are already not login <a href=\"index.jsp\">Back</a>");
    }


%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link href="CSS.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <!-- Latest compiled and minified CSS -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <style type="text/css">
            .flable {
                color: gray;
            }

            .status {
                font-family: verdana;
                font-size: 12px;
            }

            .uname {
                color: blue;
            }
        </style>

        <script src="jquery.js" type="text/javascript"></script>

        <script type="text/javascript">

            $(document).ready(function () {
                $("#username").blur(function () {
                    //   $("input").css("background-color", "yellow");

                    var abc = $("#username").val();
                    $.ajax({

                        type: "POST",
                        data: {user_name: abc},
                        url: "checkuser_name_ajax"
                        ,
                        dataType: "text",

                        success: function (html)
                        {
                            $("#available").html(html);

                        }

                    });

                });
                $("input").keyup(function () {


                    //  $("input").css("background-color", "red");

                });

            });


        </script>

        <title>Register
        </title>


    </head>





    <body style="background-color: dimgray">






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
                        <li class="dropdown">

                        <li ><a href="Login.jsp">Login</a></li>
                        <li class="active"><a href="Register.jsp">Register</a></li>
                        <!-- <li><a href="#">Logout</a></li>-->

                    </ul>




                </div>

            </div>


        </nav>

        <div class="modal-dialog" style="" >
            <div class="loginmodal-container" style="background-color:whitesmoke">
                <h1>New Here? Register Now!!</h1><br>
                <form method="post" action="RegisterController">
                    Name:<br/>
                    <input type="text" name="name" placeholder="Name" required>
                    <br/>
                    UserName:

                    <input type="text"  id="username" name="user" placeholder="Username" onkeyup="" required>
                    <span id="available"></span>

                    Email:
                    <br/>


                    <input type="email" name="email"  placeholder="Email" required class="email-type">

                    </br>

                    </br>
                    Password:
                    <input type="password" name="pass" placeholder="Password" required>

                    Phone No:
                    </br>

                    <input type="text" name="PhoneNo" placeholder="PhoneNo" required>


                    </br>
                    Address:

                    <!--        <span>  <h4 style="font-family:'Times New Roman';font-size: 16px "> Upload CV:</h4> </span>
                    
                    
                                <input type="file" name="CV"  required>
                    
                    
                                </br>-->

                    <textarea name="Text1" cols="40" rows="4" class="form-control" placeholder="Address" required></textarea>


                    <br/>

                    <span> <h4 style="font-family:'Times New Roman';font-size: 16px ;"> Gender :</h4> </span>
                    <input type="radio" name="gender" value="male" checked> Male<br>
                    <input type="radio" name="gender" value="female"> Female<br>
                    <input type="radio" name="gender" value="other"> Other
                    <br/>

                    <br/>

                    <br/>

                    <input type="submit" name="SignUp"  style="height: 50px" class="btn btn-primary" value="Register">

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

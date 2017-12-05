<%-- 
    Document   : Home
    Created on : Mar 20, 2017, 3:11:38 AM
    Author     : Tayyab
--%>
<%
 
     String username=(String)session.getAttribute("user");
      String usernames=(String)session.getAttribute("HR");
    if(username!=null)
        {
          
              response.sendRedirect("User_Home.jsp");
        }
    else if(usernames!=null)
    {
    
              response.sendRedirect("HR_Personnel.jsp");
    }
    
     else   
        
        
        
         {
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
        <!-- Latest compiled and minified CSS -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Home</title>
    </head>
    <body style="background-color: dimgray">


        <form method="POST">


            <nav class="navbar navbar" >

                <div class="container" >

                    <!-- logo-->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MainNavBar" >
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href="Home.jsp" class="navbar-brand" style="font-size:90 ;color:wheat" >Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
                    </div>

                    <!--menu-item-->
                    <div class="collapse navbar-collapse" id="MainNavBar">
                        <ul class="nav navbar-nav">
                            <li class="active">
                                <a href="Home.jsp">Home</a>
                            </li>





                            <!--
                                                <li class="dropdown" >
                                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"> HR &nbsp<span class="caret"></span></a>
                            
                                                    <ul class="dropdown-menu">
                                                        <li><a href="HR%20Manager.html">HR Manager</a></li>
                                                        <li><a href="HR%20Personnel.html">HR Personnel</a></li>
                            
                                                    </ul>
                                                </li>
                            -->
                            <li ><a href="jobs.jsp">Jobs</a></li>
                            <li ><a href="ContactUS.jsp">Contact Us</a></li>
                            <li ><a href="AboutHR.jsp">About HR</a></li>

                        </ul>




                        <ul class="nav navbar-nav navbar-right">


                            <li ><a href="Login.jsp">Login</a></li>
                            <li ><a href="Register.jsp">Register</a></li>
                            <!-- <li><a href="#">Logout</a></li>-->

                        </ul>




                    </div>

                </div>


            </nav>


            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1" class=""></li>
                    <li data-target="#myCarousel" data-slide-to="2" class=""></li>
                </ol>
                <!--style="height: 600px; " style="height: 450px;"-->
                <div class="carousel-inner" role="listbox" >

                    <div class="item active" align="center">
                        <img class="first-slide"  src="image1.jpg" alt="First slide">
                        <div class="container">
                            <div class="carousel-caption" >
                                <h1>One more for good measure..</h1>

                                <big>  <p style="color:saddlebrown;font-size: 20px"> Are you Frustrated and looking for a job? So it's a right place for you. You are only single click away.</p></big>
                                <p><a class="btn btn-lg btn-primary" href="Login.jsp" role="button">Apply for Job.</a></p>
                            </div>
                        </div>
                    </div>

                    <div class="item"  align="center" >
                        <img class="second-slide" src="image2.jpg" alt="Second slide">
                        <div class="container">
                            <div class="carousel-caption" >
                                <h1>Looking For a Job?</h1>
                                <big>  <p style="color:saddlebrown;font-size: 20px">Search job according to your abilities and Apply now. </p></big>
                                <p><a class="btn btn-lg btn-primary" href="Register.jsp" role="button">Sign Up and Apply for Job.</a></p>
                            </div>
                        </div>
                    </div>

                    <div class="item" align="center">
                        <img class="third-slide" src="image3.jpg" alt="Third slide">
                        <div class="container">
                            <div class="carousel-caption" >
                                <h1>One more for good measure.</h1>
                                <p style="color:saddlebrown;font-size: 20px"> Opportunities are like sunrises. If you wait too long, you miss them
                                    <br/> <code style="color:lightseagreen;background-color:greenyellow; font-size: 15px">William Arthur Ward</code>
                                </p>
                                <p><a class="btn btn-lg btn-primary" href="Login.jsp" role="button">Apply for Job</a></p>
                            </div>
                        </div>
                    </div>

                </div>

                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>





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


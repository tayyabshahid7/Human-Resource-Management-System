<%-- 
    Document   : jobs
    Created on : Mar 20, 2017, 10:17:52 PM
    Author     : Tayyab
--%>
<%
 
     String username=(String)session.getAttribute("user");
      String usernames=(String)session.getAttribute("HR");
      String usernamess=(String)session.getAttribute("SME");
         String usernamesss=(String)session.getAttribute("HRM");
    if(username!=null)
        {
           // session.removeAttribute("user");
    //         session.invalidate();
              response.sendRedirect("ShowJobs");
        }
    else if(usernames!=null)
    {
        
   //  session.removeAttribute("HR");
  //   session.invalidate();
              response.sendRedirect("Login.jsp");
    } 
    else if(usernamess!=null)
    {
    // session.removeAttribute("SME");
 //    session.invalidate();
              response.sendRedirect("Login.jsp");
    }
    else if(usernamesss!=null)
    {
  //   session.removeAttribute("HRM");
    //  session.invalidate();
              response.sendRedirect("HRM_Home.jsp");
    }
     else 
         {
       //  out.println("You are already not login <a href=\"index.jsp\">Back</a>");
     }
 
 
 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <link href="screen.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="CSS.css">
        <!-- Latest compiled and minified CSS -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>Apply for Job</title>
    </head>





    <body style="background-color: dimgray">

        <script>

            function myfunction() {
                alert('Submitted');

            }
        </script>




        <form method="post" onsubmit= myfunction();>



            <nav class="navbar navbar-inverse">
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
                             <li class="active"><a href="jobs.jsp">Jobs</a></li>
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






            <div class="modal-dialog" style="padding-left:0px" >


                <div class="loginmodal-container" style="background-color:whitesmoke">


                    <h1>Please <a style="font-size: 25px;color:#4d90fe" href="Login.jsp" >Login</a> to see jobs</h1>












                    <!--                    <a class="secondary clearfix" href="http://jobs.hrjobs.com/jobseeker/search/results/">View All Jobs</a>
                                    </div>-->
                </div>

            </div>

        </form>


        <div align="center">
            <!-- FOOTER -->
            <footer>

                <p style="color:#dddddd">© 2017 Company, Inc. · <a style="color:#dddddd" href="#">Privacy</a> · <a style="color:#dddddd" href="#">Terms</a></p>
            </footer>

        </div>

    </body>
</html>
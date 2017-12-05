<%-- 
    Document   : UploadJos
    Created on : Mar 25, 2017, 12:14:07 AM
    Author     : Tayyab
--%>
<%

    String username = (String) session.getAttribute("HR");

    if (username == null) {
        response.sendRedirect("Login.jsp");
        // RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");

        //out.println("You are already not login <a href=\"index.jsp\">Back</a>");
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

        <title>JOBS
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
                    <a href="HR_Personnel.jsp" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
                </div>

                <!--menu-item-->
                <div class="collapse navbar-collapse" id="MainNavBar">
                    <ul class="nav navbar-nav">
                        <li ><a href="HR_Personnel.jsp">HR Personnel's Home</a></li>
                        <li class="active"><a href="UploadJobs.jsp" >Upload Jobs</a></li>



                    </ul>

                    <ul class="nav navbar-nav navbar-right">


                        <li><a href="#"  style="color:wheat;font-weight:bold" >Hello <%= session.getAttribute("HR_name")%></a> </li>

                        <li><a href="Logout.jsp">Logout</a></li>

                    </ul>




                </div>

            </div>


        </nav>




        <div class="modal-dialog" >
            <div class="loginmodal-container" style="background-color:whitesmoke">
                <h1 style="color:darkcyan;">Upload JOBS.</h1><br>
                <form action="uploadjobs" method="POST">
                    <div style="color: #FF0000 ;font-size:18px ">${error}</div>
                    <h4>Job Title</h4>

                    <input type="text" name="job_title" required>
                    <br/>


                    <h4>Job Description!</h4>
                    <br/>
                    <textarea name="job_description" cols="35" rows="5" placeholder="Job Description" required></textarea>
                    <br/>
                    <br/>
                    <br/>

                    <input type="submit" size="50px"  style="width:150px" name="JOBS" class="login loginmodal-submit" value="Upload Jobs">

                </form>
                <br/>
                <br/>
                <div class="">
                    </br>
                </div>
            </div>
        </div>









    </body>
</html>
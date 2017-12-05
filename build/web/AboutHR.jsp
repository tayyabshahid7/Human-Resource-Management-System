<%-- 
    Document   : AboutHR.jsp
    Created on : Mar 20, 2017, 3:13:08 AM
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

        <style>

            .WebHRContents {
                font-family: "EnzoLight", Sans-Serif;
                font-size: 17px;
                color: whitesmoke;
                font-weight: bold;
            }
            style.css
            {
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
            }
            .WebHRContentsB {
                font-family: "EnzoBold", Sans-Serif;
                font-size: 18px;
                color: whitesmoke;
            }
            .WebHRContentsMI {
                font-family: "EnzoMediumItalic", Sans-Serif;
                font-size: 18px;
                color: whitesmoke;
            }
            div {
                display: block;
            }
        </style>


        <title>About HR
        </title>
    </head>



    <body style="background-color: dimgray">


        <div style="background-color: dimgray">







            <nav class="navbar navbar-inverse  ">


                <div class="container" >
                    <!-- logo-->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MainNavBar" >
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <%
                            String usernamess = (String) session.getAttribute("user");
                            if (usernamess == null) {

                        %>
                        <a href="Home.jsp" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>


                        <%  } else {
                        %>
                        <a href="ShowJobs?method=get&input=a" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>



                        <% }%>

                    </div>

                    <!--menu-item-->
                    <div class="collapse navbar-collapse" id="MainNavBar">
                        <ul class="nav navbar-nav">

                            <%
                                String usernames = (String) session.getAttribute("user");
                                if (usernames == null) {

                            %>
                            <li ><a href="Home.jsp">Home</a></li>

                            <%  } else {
                            %>
                            <li > <a href="ShowJobs?method=get&input=a"> Home</a></li>

                            <% }%>


                            <!--<li ><a href="jobs.jsp">Jobs</a></li>-->
                            <li><a href="ContactUS.jsp" >Contact US</a></li>
                            <li class="active"><a href="AboutHR.jsp">About HR</a></li>



                        </ul>

                        <ul class="nav navbar-nav navbar-right">


                            <%
                                String username = (String) session.getAttribute("user");
                                if (username == null) {
                            %>

                            <li><a href="Login.jsp">Login</a></li>
                            <li><a href="Register.jsp">Register</a></li>   
                                <% } else {
                                %>
                            <li><a href="#" style="color:wheat;font-weight:bold" > <%= session.getAttribute("user_name")%></a> </li>
                            <li>  <a href="Logout.jsp">Logout</a></li>
                                <% }%>

                        </ul>




                    </div>

                </div>


            </nav>




            <div class="container">


                <h1 style="color: wheat">

                    About HR

                    <hr>
                </h1>







                <!--    Paragraph about hr-->
                <div class="WebHRContents">
                    Human Resources will provide the leadership, supportive services, guiding principles, policies, structures and standards necessary for Washington University to be recognized as an Employer of Choice.
                </div>
                <br>
                <div align="center" class="WebHRContents" style="font-size:24px;">"Trusted by over 15,000 Companies in 193 Countries"</div>
                <br>
                <div class="WebHRContents"> When making a decision to work for a given employer, people will choose to work at Washington University because of our commitment to our employees as expressed through the following cardinal/guiding principles and values.

                </div>

                <br>
                <br>


                <!--    Circle images-->

                <div class="row" align="center">
                    <div class="col-lg-4">
                        <img class="img-circle" src="person1.jpg" alt="Generic placeholder image" width="140" height="140">
                        <h2 style="color: azure">John Williams</h2>
                        <p><a class="btn btn-default" href="#" role="button">View details </a></p>
                    </div>
                    <div class="col-lg-4">
                        <img class="img-circle" src="person2.jpg" alt="Generic placeholder image" width="140" height="140">
                        <h2 style="color: azure">David Alba</h2>
                        <p><a class="btn btn-default" href="#" role="button">View details </a></p>
                    </div>
                    <div class="col-lg-4">
                        <img class="img-circle" src="person3.jpg" alt="Generic placeholder image" width="140" height="140">
                        <h2 style="color: azure">Chris Lean</h2>
                        <p><a class="btn btn-default" href="#" role="button">View details</a></p>
                    </div>
                </div>

                <br>


                <!-- Slides-->

<!--                <div align="center">

                    <iframe src="//www.slideshare.net/slideshow/embed_code/key/GD1nhwvkEnIEVM" width="650" height="543" frameborder="0" marginwidth="0" marginheight="0" scrolling="no" style="border:1px solid #CCC; border-width:1px; margin-bottom:5px; max-width: 100%;" allowfullscreen="">
                    </iframe>

                </div>-->

                <div style="height:30px;"></div>


                <!-- FEatures HR-->
                <div align="center"><h1 style="color: azure">HR Features</h1></div>
                <div style="height:10px;"></div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Feature Rich Social HR</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Complete Recruitment Solution</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Employees Self Service</div>
                <div style="clear:both;"></div>
                <div style="margin-top:16px;"></div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Extremely User Friendly</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Effortless Payroll</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Employees Attendance / Biometrics</div>
                <div style="clear:both;"></div>
                <div style="margin-top:16px;"></div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Very Cost Effective</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Comprehensive Reports &amp; Graphs</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Extensive Leaves Management</div>
                <div style="clear:both;"></div>
                <div style="margin-top:16px;"></div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Online Job Portal</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Extensive Employee Profile</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Customizable Data Fields</div>
                <div style="clear:both;"></div>
                <div style="margin-top:16px;"></div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Documents Management</div>
                <div style="float:left; width:33%;" class="WebHRContentsMI"><img style="width:32px;" src="iconTick.png">&nbsp;&nbsp;Reports Generator</div>
                <div style="clear:both;"></div>

                <div style="height:30px;"></div>


                <br>
                <br>



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

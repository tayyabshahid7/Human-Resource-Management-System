<%-- 
    Document   : ContactUS
    Created on : Mar 20, 2017, 3:14:27 AM
    Author     : Tayyab
--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Contact US</title>
        <style>


            .hgroup {
                margin-top: 10px;
                margin-bottom: 16px;
                border-bottom: 1px solid #cccccc;
                padding-top: 17px;
                padding-bottom: 17px;
                position: relative;
            }
            div {
                display: block;
            }
            .row {
                margin-left: -15px;
                margin-right: -15px;
            }
            .col-xs-1, .col-sm-1, .col-md-1, .col-lg-1, .col-xs-2, .col-sm-2, .col-md-2, .col-lg-2, .col-xs-3, .col-sm-3, .col-md-3, .col-lg-3, .col-xs-4, .col-sm-4, .col-md-4, .col-lg-4, .col-xs-5, .col-sm-5, .col-md-5, .col-lg-5, .col-xs-6, .col-sm-6, .col-md-6, .col-lg-6, .col-xs-7, .col-sm-7, .col-md-7, .col-lg-7, .col-xs-8, .col-sm-8, .col-md-8, .col-lg-8, .col-xs-9, .col-sm-9, .col-md-9, .col-lg-9, .col-xs-10, .col-sm-10, .col-md-10, .col-lg-10, .col-xs-11, .col-sm-11, .col-md-11, .col-lg-11, .col-xs-12, .col-sm-12, .col-md-12, .col-lg-12 {
                position: relative;
                min-height: 1px;
                padding-left: 15px;
                padding-right: 15px;
            }



            .team_member {
                margin-bottom: 30px;
            }

            .team_member {
                text-align: center;
                background-color: #000;
                background-color: #222222;
                background: url(../images/Backgrounds/wild_oliva_dark.png);
                color: #cccccc;
                padding: 40px;
                -webkit-transition: all 500ms linear;
                transition: all 500ms linear;
                border-radius: 6px;
            }
        </style>
    </head>


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


                        <%
                            String usernamess2 = (String) session.getAttribute("user");
                            if (usernamess2 == null) {

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
                                String usernames1 = (String) session.getAttribute("user");
                                if (usernames1 == null) {

                            %>
                            <li > <a href="Home.jsp">Home</a></li>

                            <%  } else {
                            %>
                           
                            <li > <a href="ShowJobs?method=get&input=a"> Home</a></li>

                            <% }%>






                            <!--<li ><a href="jobs.jsp">Jobs</a></li>-->
                            <li class="active"><a href="ContactUS.jsp">Contact Us</a></li>
                            <li ><a href="AboutHR.jsp">About HR</a></li>

                        </ul>




                        <ul class="nav navbar-nav navbar-right">

                            <%
                                String username3 = (String) session.getAttribute("user");
                                if (username3 == null) {

                            %>
                             <li><a href="Login.jsp">Login</a></li>
                            <li><a href="Register.jsp">Register</a></li>
                           

                            <%  } else {
                            %>
                             <li><a href="#" style="color:wheat;font-weight:bold" > <%= session.getAttribute("user_name") %></a> </li>
                            <li>  <a href="Logout.jsp">Logout</a></li>
                                <% }%>

                            <!--            
                                            <li > <a href="Login.jsp">Login</a></li>
                                            <li ><a href="Register.jsp">Register</a></li>-->
                            <!-- <li><a href="#">Logout</a></li>-->

                        </ul>




                    </div>

                </div>


            </nav>






            <div  class="container" style="color: wheat;font-weight: bold">
                <h1>
                    Contact us
                    <hr>
                </h1>

            </div>






            <div class="container">
                <div class="row">
                    <div class="office_address col-sm-4 col-md-4">
                        <div class="team_member" style="color: azure">
                            <img src="LOGOHR.svg" alt="logo" style="height:125px;">
                            <h5 >HR Inc.</h5>
                            <div class="team_social">
                                
                                <a href="http://www.facebook.com/HR">
                                    <i class="fa fa-facebook" style="color:#66ccff">Facebook.</i></a> 
                                    <a href="http://twitter.com/hrco">
                                        <i class="fa fa-twitter" style="color:#66ccff">
                                            twitter.
                                        </i>
                                    </a>
                            </div>
                            <address>

                                Liberty Market ,<br>
                                Lahore, Pakistan. <br>
                                <br><br>

                                <i class="fa fa-phone"></i>&nbsp;Pakistan:&nbsp;+92-333-264-9311<br>
                                <i class="fa fa-phone"></i>&nbsp;U.A.E.:&nbsp;+971-50-484-7862<br>
                                <i class="fa fa-envelope"></i>&nbsp;&nbsp;info [at] HR.co
                            </address>
                        </div>


                    </div>
                    <div class="contact_form col-sm-8 col-md-8" style="color: azure">
                        <div align="center" style="font-size:20px; font-weight:bolder;"></div>
                        <form method="post" action="" onsubmit="">
                            <div class="row">
                                <div class="col-sm-6 col-md-6"><label style="font-size:20px; font-weight:bolder;">Name</label>
                                    <input style="background-color: gainsboro;" type="text" name="n" id="n" value="" class="form-control"></div>
                                <div class="col-sm-6 col-md-6"><label style="font-size:20px; font-weight:bolder;">E-mail</label>
                                    <input  style="background-color: gainsboro;" type="text" name="e" id="e" value="" class="form-control"></div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12 col-md-12"><label style="font-size:20px; font-weight:bolder;">Subject</label>
                                    <input style="background-color: gainsboro;" name="s" id="s" value="" class="form-control" type="text"></div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12 col-md-12"><label style="font-size:20px; font-weight:bolder;">Message</label>
                                    <textarea  style="background-color: gainsboro;" name="m" id="m" rows="8" class="form-control"></textarea></div>
                            </div>

                            <div class="row">
                                <div class="col-sm-12 col-md-12">


                                    <label style="font-size:20px; font-weight:bolder;color: azure">Security Code</label><br>

                                    <script src="https://www.google.com/recaptcha/api.js"></script>


                                    <div class="g-recaptcha" data-sitekey="6LfGNxsTAAAAANCjMpgE_A03ZIrUhb5PxBaRHGzj"><div style="width: 304px; height: 78px;">
                                            <div>
                                                <iframe src="https://www.google.com/recaptcha/api2/anchor?k=6LfGNxsTAAAAANCjMpgE_A03ZIrUhb5PxBaRHGzj&amp;co=aHR0cHM6Ly93ZWJoci5jbzo0NDM.&amp;hl=en&amp;v=r20170213115309&amp;size=normal&amp;cb=65830ktmh5ly" title="recaptcha widget" width="304" height="78" frameborder="0" scrolling="no" name="undefined"></iframe>
                                            </div>
                                            <textarea id="g-recaptcha-response" name="g-recaptcha-response" class="g-recaptcha-response" style="width: 250px; height: 40px; border: 1px solid #c1c1c1; margin: 10px 25px; padding: 0px; resize: none;  display: none; ">

                                            </textarea>
                                        </div>
                                    </div>
                                    <br><br>
                                    <input type="submit" class="btn btn-primary" value="Send Message" style="width:200px; height:50px; fontw-weight:bold; font-size:20px;">
                                </div>
                            </div>
                            
                            <div class="row">
                                <div class="col-sm-12 col-md-12"><br>
                                </div>
                            </div>
                            <input type="hidden" name="action" id="action" value="SendMessage">
                        </form>
                    </div>
                </div>




            </div>

            <div align="center">
                <!-- FOOTER -->
                <footer>

                    <p style="color:#dddddd">© 2017 Company, Inc. · <a style="color:#dddddd" href="#">Privacy</a> · <a style="color:#dddddd" href="#">Terms</a></p>
                </footer>

            </div>











    </html>
</body>
</html>
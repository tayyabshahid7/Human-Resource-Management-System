<%-- 
    Document   : ApplyJOB
    Created on : Mar 20, 2017, 3:15:45 AM
    Author     : Tayyab
--%>

<%
 
     String username=(String)session.getAttribute("user");
     
    
    
     if(username==null) 
         {
             
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

        <title>Apply for Job</title>
    </head>





    <body style="background-color: dimgray">

        <script>

            function myfunction() {
                alert('Submitted');

            }
        </script>




     



            <nav class="navbar navbar-inverse">
                <div class="container" >
                    <!-- logo-->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MainNavBar" >
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a href="ShowJobs?method=get&input=a" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
                    </div>

                    <!--menu-item-->
                    <div class="collapse navbar-collapse" id="MainNavBar">
                        <ul class="nav navbar-nav">
                            <li ><a href="ShowJobs?method=get&input=a">Home</a></li>
                            <li ><a href="ContactUS.jsp">Contact Us</a></li>



                        </ul>

                        <ul class="nav navbar-nav navbar-right">

                             <li><a href="#" style="color:wheat;font-weight:bold" > <%= session.getAttribute("user_name") %></a> </li>
                            <li ><a href="Logout.jsp">Logout</a></li>
                          
                         

                        </ul>




                    </div>

                </div>


            </nav>

            <div class="modal-dialog" >
                <div class="loginmodal-container" style="background-color:whitesmoke">
                    <h1 style="color: darkgreen">Apply for JOB!.</h1><br>
                   
                    
                    <form method="post" action="ApplyJob" enctype="multipart/form-data"  >

                        
                   
                        <br/>

                        <span>  <h4 style="font-family:'Times New Roman';font-size: 16px "> Upload CV:</h4> </span>


                        <input style="font-family:'Times New Roman';font-size: 16px " id="file" type="file" name="fname" value=""  required>
                        <br/>

                        <span>  <h4 style="font-family:'Times New Roman';font-size: 16px ">CGPA :
                                <input id="gpa" type="number" name="CV" placeholder="0.00-4.00" MIN="0.00" MAX="4.00"  required></h4> </span>

                        </br>
                        <span>  <h4 style="font-family:'Times New Roman';font-size: 16px "> EDUCATION:
                                <select id="edu" size="height:3px"  name="Education" class="eduction" required>

                                    <option  value="FSC">FSC</option>
                                    <option value="O-LVL">O-Level</option>
                                    <option value="BS">BS-Graduate</option>
                                    <option value="BS">MS-Graduate</option>

                                </select>

                            </h4>
                        </span>




                     
                        <br/>
                        </br>
                        <input  type="submit" name="APPLY" class="btn btn-primary" value="Apply!!"  >
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
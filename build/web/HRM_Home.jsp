<%-- 
    Document   : HRM_Home
    Created on : Mar 30, 2017, 5:01:08 PM
    Author     : Tayyab
--%>
<%

    String username = (String) session.getAttribute("HRM");

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
    <style>
        table {
            width:60%;

        }
        table, th, td {
            border: 2.5px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 4px;
            text-align: left;
        }
        table#t01 tr:nth-child(even) {
            background-color: #eee;
        }
        table#t01 tr:nth-child(odd) {
            background-color:#eee;
        }
        table#t01 th {
            background-color: black;
            color: white;
        }
    </style>
    <title>HR Manager
    </title>
</head>



<body style="background-color: dimgray">
<div style="background-color: dimgray">







    <nav class="navbar navbar-inverse">
        <div class="container" >
            <!-- logo-->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MainNavBar" >
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="HRM_Home.jsp" class="navbar-brand" style="font-size:90 ;color:wheat">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>
            </div>

            <!--menu-item-->
            <div class="collapse navbar-collapse" id="MainNavBar">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="HRM_Home.jsp"><span class="glyphicon glyphicon-play"></span>&nbspHR Manager's Home</a></a></li>
                  <!--  <li><a href="JOB.html" >Jobs</a></li>-->

                <!--    <li class="active"><a href="About%20HR.html">About HR</a></li>-->
                 <!--   <li><a href="Contact%20US.html" >Contact US</a></li>-->


                </ul>

                <ul class="nav navbar-nav navbar-right">


                  <!--  <li ><a href="#">HR Login</a></li>-->
                <li><a href="#"  style="color:wheat;font-weight:bold" >Hello <%= session.getAttribute("HR_name")%></a> </li>    
                   <li><a href="Logout.jsp">Logout</a></li>

                </ul>




            </div>

        </div>


    </nav>


    <div align="center">
        <div class="panel panel-success"  style="width: 400px "    >
            <div class="panel-heading" >
                <h1>Home.</h1>
                ${rates}
            </div>
        </div>
    </div>




    <div align="center">
        <div class="panel panel-info"  style="width: 400px "  >
            <div class="panel-heading" >


            <table align="center" id="t01" >

        <tr>

            <td>
                <a href="HRM_CVS?method=GET"> Call for  Interviews</a></td>

            <td>
                <a href="Top_applicant?method=GET"> Send Offer Letter to top Applicant</a>
            </td>
            
            
            
            
            
            
        </tr>
        <tr>
              <td>
                <a href="HRM_CVS2?method=GET"> Give Ratings</a>
            </td>
            
            
            
        </tr>


    </table>

            </div>
        </div>
    </div>











</div>




</body>
</html>

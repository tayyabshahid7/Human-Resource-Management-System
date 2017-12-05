<%-- 
    Document   : Logout
    Created on : Mar 24, 2017, 12:27:39 AM
    Author     : Tayyab
--%>
<%
 
     String username=(String)session.getAttribute("user");
      String usernames=(String)session.getAttribute("HR");
      String usernamess=(String)session.getAttribute("SME");
         String usernamesss=(String)session.getAttribute("HRM");
    if(username!=null)
        {
            session.removeAttribute("user");
             session.invalidate();
              response.sendRedirect("Home.jsp");
        }
    else if(usernames!=null)
    {
        
     session.removeAttribute("HR");
     session.invalidate();
              response.sendRedirect("Home.jsp");
    } 
    else if(usernamess!=null)
    {
     session.removeAttribute("SME");
     session.invalidate();
              response.sendRedirect("Home.jsp");
    }
    else if(usernamesss!=null)
    {
     session.removeAttribute("HRM");
      session.invalidate();
              response.sendRedirect("Home.jsp");
    }
     else 
         {
         out.println("You are already not login <a href=\"index.jsp\">Back</a>");
     }
 
 
 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
    </body>
</html>

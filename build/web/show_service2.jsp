<%-- 
    Document   : show_service2
    Created on : Apr 26, 2017, 8:39:48 PM
    Author     : Tayyab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
   <%-- start web service invocation --%><hr/>
    <%
        String temp=request.getParameter("user");
        System.out.println(temp);
        if(temp!=null){
        try 
    {
        
	service_client.Serviceme_Service service = new service_client.Serviceme_Service();
	service_client.Serviceme port = service.getServicemePort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = temp;
	// TODO process result here
	java.lang.String result = port.userName(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
    
</html>

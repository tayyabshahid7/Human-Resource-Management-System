<%-- 
    Document   : show_service
    Created on : Apr 26, 2017, 8:10:50 PM
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
        String a1=request.getParameter("ID");
        
         int aa=Integer.parseInt(a1);
       
        
       
        
        
   
        
    try {
	service_client.Serviceme_Service service = new service_client.Serviceme_Service();
	service_client.Serviceme port = service.getServicemePort();
	 // TODO initialize WS operation arguments here
	int name = aa;
	// TODO process result here
	java.lang.String result = port.id(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
        
    %>
    
    <%-- end web service invocation --%><hr/>
    
   
    </body>
</html>

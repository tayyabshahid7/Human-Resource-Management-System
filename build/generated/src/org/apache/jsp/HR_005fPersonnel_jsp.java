package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HR_005fPersonnel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');


    String username = (String) session.getAttribute("HR");

    if (username == null) {
        
        response.sendRedirect("Login.jsp");
        // RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");

        //out.println("You are already not login <a href=\"index.jsp\">Back</a>");
    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS.css\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>HR Personnel\n");
      out.write("        </title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            table {\n");
      out.write("                width:60%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table, th, td {\n");
      out.write("                border: 2.5px solid black;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                padding: 4px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            table#t01 tr:nth-child(even) {\n");
      out.write("                background-color: #eee;\n");
      out.write("            }\n");
      out.write("            table#t01 tr:nth-child(odd) {\n");
      out.write("                background-color:#eee;\n");
      out.write("            }\n");
      out.write("            table#t01 th {\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body style=\"background-color: dimgray\">\n");
      out.write("        <div style=\"background-color: dimgray\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-inverse\">\n");
      out.write("                <div class=\"container\" >\n");
      out.write("                    <!-- logo-->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MainNavBar\" >\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a href=\"HR_Personnel.jsp\" class=\"navbar-brand\" style=\"font-size:90 ;color:wheat\">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--menu-item-->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"MainNavBar\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"active\" ><a href=\"HR_Personnel.jsp\"><span class=\"glyphicon glyphicon-play\"></span>&nbspHR Personnel's Home</a></li>\n");
      out.write("                            <li><a href=\"UploadJobs.jsp\" >Upload Jobs</a></li>\n");
      out.write("\n");
      out.write("                            <!--  <li ><a href=\"About%20HR.html\">About HR</a></li>-->\n");
      out.write("                            <!-- <li><a href=\"Contact%20US.html\" >Contact US</a></li> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--  <li ><a href=\"#\">HR Login</a></li>\n");
      out.write("                            -->      <li><a href=\"#\"  style=\"color:wheat;font-weight:bold\" >Hello ");
      out.print( session.getAttribute("HR_name"));
      out.write("</a> </li>\n");
      out.write("                            <li><a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- HR Personnel -->\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <div class=\"panel panel-success\"  style=\"width: 400px \"    >\n");
      out.write("                    <div class=\"panel-heading\" >\n");
      out.write("                        <h1>Home.</h1>\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <div class=\"panel panel-info\"  style=\"width: 400px \"  >\n");
      out.write("                    <div class=\"panel-heading\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <table align=\"center\" id=\"t01\" >\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("<!--                                <td>\n");
      out.write("                                    <a href=\"#\"> Check Interviews</a></td>-->\n");
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                     <br>\n");
      out.write("                                    <a href=\"SendCvHRM?method=GET\" > Send Top 5 CV's to HRM</a>\n");
      out.write("                                </td>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td >\n");
      out.write("                                     <br>\n");
      out.write("                                    <a href=\"GetCVS?method=GET\">  Review Applications</a>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                                                               \n");
      out.write("                            <tr>\n");
      out.write("                                 \n");
      out.write("                                <td> <br>\n");
      out.write("\n");
      out.write("                                    <a href=\"GetSmeReplys?method=GET\"> View SME's Replies </a>\n");
      out.write("\n");
      out.write("                                                                </td>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

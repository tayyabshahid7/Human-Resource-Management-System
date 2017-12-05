package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    String username = (String) session.getAttribute("user");
    String usernames = (String) session.getAttribute("HR");
    if (username != null) {

        response.sendRedirect("User_Home.jsp");
    } else if (usernames != null) {

        response.sendRedirect("HR_Personnel.jsp");
    } else {
        String error = "";
        request.setAttribute("error", error);
        // RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");

        //out.println("You are already not login <a href=\"index.jsp\">Back</a>");
    }



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <link href=\"CSS.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .flable {\n");
      out.write("                color: gray;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .status {\n");
      out.write("                font-family: verdana;\n");
      out.write("                font-size: 12px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .uname {\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script src=\"jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#username\").blur(function () {\n");
      out.write("                    //   $(\"input\").css(\"background-color\", \"yellow\");\n");
      out.write("\n");
      out.write("                    var abc = $(\"#username\").val();\n");
      out.write("                    $.ajax({\n");
      out.write("\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        data: {user_name: abc},\n");
      out.write("                        url: \"checkuser_name_ajax\"\n");
      out.write("                        ,\n");
      out.write("                        dataType: \"text\",\n");
      out.write("\n");
      out.write("                        success: function (html)\n");
      out.write("                        {\n");
      out.write("                            $(\"#available\").html(html);\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                });\n");
      out.write("                $(\"input\").keyup(function () {\n");
      out.write("\n");
      out.write("\n");
      out.write("                    //  $(\"input\").css(\"background-color\", \"red\");\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <title>Register\n");
      out.write("        </title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body style=\"background-color: dimgray\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container\" >\n");
      out.write("                <!-- logo-->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MainNavBar\" >\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"Home.jsp\" class=\"navbar-brand\" style=\"font-size:90 ;color:wheat\">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!--menu-item-->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"MainNavBar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li ><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                        <li ><a href=\"ContactUS.jsp\">Contact Us</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("\n");
      out.write("                        <li ><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"Register.jsp\">Register</a></li>\n");
      out.write("                        <!-- <li><a href=\"#\">Logout</a></li>-->\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"modal-dialog\" style=\"\" >\n");
      out.write("            <div class=\"loginmodal-container\" style=\"background-color:whitesmoke\">\n");
      out.write("                <h1>New Here? Register Now!!</h1><br>\n");
      out.write("                <form method=\"post\" action=\"RegisterController\">\n");
      out.write("                    Name:<br/>\n");
      out.write("                    <input type=\"text\" name=\"name\" placeholder=\"Name\" required>\n");
      out.write("                    <br/>\n");
      out.write("                    UserName:\n");
      out.write("\n");
      out.write("                    <input type=\"text\"  id=\"username\" name=\"user\" placeholder=\"Username\" onkeyup=\"\" required>\n");
      out.write("                    <span id=\"available\"></span>\n");
      out.write("\n");
      out.write("                    Email:\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"email\" name=\"email\"  placeholder=\"Email\" required class=\"email-type\">\n");
      out.write("\n");
      out.write("                    </br>\n");
      out.write("\n");
      out.write("                    </br>\n");
      out.write("                    Password:\n");
      out.write("                    <input type=\"password\" name=\"pass\" placeholder=\"Password\" required>\n");
      out.write("\n");
      out.write("                    Phone No:\n");
      out.write("                    </br>\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"PhoneNo\" placeholder=\"PhoneNo\" required>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </br>\n");
      out.write("                    Address:\n");
      out.write("\n");
      out.write("                    <!--        <span>  <h4 style=\"font-family:'Times New Roman';font-size: 16px \"> Upload CV:</h4> </span>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                                <input type=\"file\" name=\"CV\"  required>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                                </br>-->\n");
      out.write("\n");
      out.write("                    <textarea name=\"Text1\" cols=\"40\" rows=\"4\" class=\"form-control\" placeholder=\"Address\" required></textarea>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("                    <span> <h4 style=\"font-family:'Times New Roman';font-size: 16px ;\"> Gender :</h4> </span>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"male\" checked> Male<br>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"other\"> Other\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("                    <br/>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" name=\"SignUp\"  style=\"height: 50px\" class=\"btn btn-primary\" value=\"Register\">\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <!-- FOOTER -->\n");
      out.write("            <footer>\n");
      out.write("\n");
      out.write("                <p style=\"color:#dddddd\">© 2017 Company, Inc. · <a style=\"color:#dddddd\" href=\"#\">Privacy</a> · <a style=\"color:#dddddd\" href=\"#\">Terms</a></p>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
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

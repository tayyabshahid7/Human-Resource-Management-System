package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactUS_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
     String username=(String)session.getAttribute("user");
      String usernames=(String)session.getAttribute("HR");
      String usernamess=(String)session.getAttribute("SME");
         String usernamesss=(String)session.getAttribute("HRM");
    if(username!=null)
        {
           
              response.sendRedirect("Home.jsp");
        }
    else if(usernames!=null)
    {
        
    
              response.sendRedirect("Home.jsp");
    } 
    else if(usernamess!=null)
    {
    
              response.sendRedirect("Home.jsp");
    }
    else if(usernamesss!=null)
    {
    
              response.sendRedirect("Home.jsp");
    }
     else 
         {
         out.println("You are already not login <a href=\"index.jsp\">Back</a>");
     }
 
 
 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Contact US</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            .hgroup {\n");
      out.write("                margin-top: 10px;\n");
      out.write("                margin-bottom: 16px;\n");
      out.write("                border-bottom: 1px solid #cccccc;\n");
      out.write("                padding-top: 17px;\n");
      out.write("                padding-bottom: 17px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            div {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("            .row {\n");
      out.write("                margin-left: -15px;\n");
      out.write("                margin-right: -15px;\n");
      out.write("            }\n");
      out.write("            .col-xs-1, .col-sm-1, .col-md-1, .col-lg-1, .col-xs-2, .col-sm-2, .col-md-2, .col-lg-2, .col-xs-3, .col-sm-3, .col-md-3, .col-lg-3, .col-xs-4, .col-sm-4, .col-md-4, .col-lg-4, .col-xs-5, .col-sm-5, .col-md-5, .col-lg-5, .col-xs-6, .col-sm-6, .col-md-6, .col-lg-6, .col-xs-7, .col-sm-7, .col-md-7, .col-lg-7, .col-xs-8, .col-sm-8, .col-md-8, .col-lg-8, .col-xs-9, .col-sm-9, .col-md-9, .col-lg-9, .col-xs-10, .col-sm-10, .col-md-10, .col-lg-10, .col-xs-11, .col-sm-11, .col-md-11, .col-lg-11, .col-xs-12, .col-sm-12, .col-md-12, .col-lg-12 {\n");
      out.write("                position: relative;\n");
      out.write("                min-height: 1px;\n");
      out.write("                padding-left: 15px;\n");
      out.write("                padding-right: 15px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .team_member {\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .team_member {\n");
      out.write("                text-align: center;\n");
      out.write("                background-color: #000;\n");
      out.write("                background-color: #222222;\n");
      out.write("                background: url(../images/Backgrounds/wild_oliva_dark.png);\n");
      out.write("                color: #cccccc;\n");
      out.write("                padding: 40px;\n");
      out.write("                -webkit-transition: all 500ms linear;\n");
      out.write("                transition: all 500ms linear;\n");
      out.write("                border-radius: 6px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!DOCTYPE html>\n");
      out.write("    <html lang=\"en\">\n");
      out.write("        <head>\n");
      out.write("            <!-- Latest compiled and minified CSS -->\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("            <title>Home</title>\n");
      out.write("        </head>\n");
      out.write("        <body style=\"background-color: dimgray\">\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-inverse\" >\n");
      out.write("                <div class=\"container\" >\n");
      out.write("                    <!-- logo-->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MainNavBar\" >\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                            String usernamess2 = (String) session.getAttribute("user");
                            if (usernamess2 == null) {

                        
      out.write("      \n");
      out.write("                        <a href=\"Home.jsp\" class=\"navbar-brand\" style=\"font-size:90 ;color:wheat\">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        ");
  } else {
                        
      out.write("\n");
      out.write("                        <a href=\"ShowJobs?method=get&input=a\" class=\"navbar-brand\" style=\"font-size:90 ;color:wheat\">Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--menu-item-->\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"MainNavBar\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ");

                                String usernames1 = (String) session.getAttribute("user");
                                if (usernames1 == null) {

                            
      out.write("\n");
      out.write("                            <li > <a href=\"Home.jsp\">Home</a></li>\n");
      out.write("\n");
      out.write("                            ");
  } else {
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                            <li > <a href=\"ShowJobs?method=get&input=a\"> Home</a></li>\n");
      out.write("\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li ><a href=\"jobs.jsp\">Jobs</a></li>\n");
      out.write("                            <li class=\"active\"><a href=\"ContactUS.jsp\">Contact Us</a></li>\n");
      out.write("                            <li ><a href=\"AboutHR.jsp\">About HR</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                            ");

                                String username3 = (String) session.getAttribute("user");
                                if (username3 == null) {

                            
      out.write("\n");
      out.write("                             <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("                            <li><a href=\"Register.jsp\">Register</a></li>\n");
      out.write("                           \n");
      out.write("\n");
      out.write("                            ");
  } else {
                            
      out.write("\n");
      out.write("                             <li><a href=\"#\" style=\"color:wheat;font-weight:bold\" > ");
      out.print( session.getAttribute("user_name") );
      out.write("</a> </li>\n");
      out.write("                            <li>  <a href=\"Logout.jsp\">Logout</a></li>\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                            <!--            \n");
      out.write("                                            <li > <a href=\"Login.jsp\">Login</a></li>\n");
      out.write("                                            <li ><a href=\"Register.jsp\">Register</a></li>-->\n");
      out.write("                            <!-- <li><a href=\"#\">Logout</a></li>-->\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div  class=\"container\" style=\"color: wheat;font-weight: bold\">\n");
      out.write("                <h1>\n");
      out.write("                    Contact us\n");
      out.write("                    <hr>\n");
      out.write("                </h1>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"office_address col-sm-4 col-md-4\">\n");
      out.write("                        <div class=\"team_member\" style=\"color: azure\">\n");
      out.write("                            <img src=\"LOGOHR.svg\" alt=\"logo\" style=\"height:125px;\">\n");
      out.write("                            <h5 >HR Inc.</h5>\n");
      out.write("                            <div class=\"team_social\">\n");
      out.write("                                \n");
      out.write("                                <a href=\"http://www.facebook.com/HR\">\n");
      out.write("                                    <i class=\"fa fa-facebook\" style=\"color:#66ccff\">Facebook.</i></a> \n");
      out.write("                                    <a href=\"http://twitter.com/hrco\">\n");
      out.write("                                        <i class=\"fa fa-twitter\" style=\"color:#66ccff\">\n");
      out.write("                                            twitter.\n");
      out.write("                                        </i>\n");
      out.write("                                    </a>\n");
      out.write("                            </div>\n");
      out.write("                            <address>\n");
      out.write("\n");
      out.write("                                Liberty Market ,<br>\n");
      out.write("                                Lahore, Pakistan. <br>\n");
      out.write("                                <br><br>\n");
      out.write("\n");
      out.write("                                <i class=\"fa fa-phone\"></i>&nbsp;Pakistan:&nbsp;+92-333-264-9311<br>\n");
      out.write("                                <i class=\"fa fa-phone\"></i>&nbsp;U.A.E.:&nbsp;+971-50-484-7862<br>\n");
      out.write("                                <i class=\"fa fa-envelope\"></i>&nbsp;&nbsp;info [at] HR.co\n");
      out.write("                            </address>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"contact_form col-sm-8 col-md-8\" style=\"color: azure\">\n");
      out.write("                        <div align=\"center\" style=\"font-size:20px; font-weight:bolder;\"></div>\n");
      out.write("                        <form method=\"post\" action=\"\" onsubmit=\"\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-6 col-md-6\"><label style=\"font-size:20px; font-weight:bolder;\">Name</label>\n");
      out.write("                                    <input style=\"background-color: gainsboro;\" type=\"text\" name=\"n\" id=\"n\" value=\"\" class=\"form-control\"></div>\n");
      out.write("                                <div class=\"col-sm-6 col-md-6\"><label style=\"font-size:20px; font-weight:bolder;\">E-mail</label>\n");
      out.write("                                    <input  style=\"background-color: gainsboro;\" type=\"text\" name=\"e\" id=\"e\" value=\"\" class=\"form-control\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12 col-md-12\"><label style=\"font-size:20px; font-weight:bolder;\">Subject</label>\n");
      out.write("                                    <input style=\"background-color: gainsboro;\" name=\"s\" id=\"s\" value=\"\" class=\"form-control\" type=\"text\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12 col-md-12\"><label style=\"font-size:20px; font-weight:bolder;\">Message</label>\n");
      out.write("                                    <textarea  style=\"background-color: gainsboro;\" name=\"m\" id=\"m\" rows=\"8\" class=\"form-control\"></textarea></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12 col-md-12\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <label style=\"font-size:20px; font-weight:bolder;color: azure\">Security Code</label><br>\n");
      out.write("\n");
      out.write("                                    <script src=\"https://www.google.com/recaptcha/api.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"g-recaptcha\" data-sitekey=\"6LfGNxsTAAAAANCjMpgE_A03ZIrUhb5PxBaRHGzj\"><div style=\"width: 304px; height: 78px;\">\n");
      out.write("                                            <div>\n");
      out.write("                                                <iframe src=\"https://www.google.com/recaptcha/api2/anchor?k=6LfGNxsTAAAAANCjMpgE_A03ZIrUhb5PxBaRHGzj&amp;co=aHR0cHM6Ly93ZWJoci5jbzo0NDM.&amp;hl=en&amp;v=r20170213115309&amp;size=normal&amp;cb=65830ktmh5ly\" title=\"recaptcha widget\" width=\"304\" height=\"78\" frameborder=\"0\" scrolling=\"no\" name=\"undefined\"></iframe>\n");
      out.write("                                            </div>\n");
      out.write("                                            <textarea id=\"g-recaptcha-response\" name=\"g-recaptcha-response\" class=\"g-recaptcha-response\" style=\"width: 250px; height: 40px; border: 1px solid #c1c1c1; margin: 10px 25px; padding: 0px; resize: none;  display: none; \">\n");
      out.write("\n");
      out.write("                                            </textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <br><br>\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary\" value=\"Send Message\" style=\"width:200px; height:50px; fontw-weight:bold; font-size:20px;\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12 col-md-12\"><br>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"hidden\" name=\"action\" id=\"action\" value=\"SendMessage\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <!-- FOOTER -->\n");
      out.write("                <footer>\n");
      out.write("\n");
      out.write("                    <p style=\"color:#dddddd\">© 2017 Company, Inc. · <a style=\"color:#dddddd\" href=\"#\">Privacy</a> · <a style=\"color:#dddddd\" href=\"#\">Terms</a></p>\n");
      out.write("                </footer>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("    </html>\n");
      out.write("</body>\n");
      out.write("</html>");
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

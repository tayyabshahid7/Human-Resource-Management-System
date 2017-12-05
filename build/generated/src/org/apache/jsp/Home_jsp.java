package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 
     String username=(String)session.getAttribute("user");
      String usernames=(String)session.getAttribute("HR");
    if(username!=null)
        {
          
              response.sendRedirect("User_Home.jsp");
        }
    else if(usernames!=null)
    {
    
              response.sendRedirect("HR_Personnel.jsp");
    }
    
     else   
        
        
        
         {
             String error = "";
            request.setAttribute("error", error);
           // RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
            
         //out.println("You are already not login <a href=\"index.jsp\">Back</a>");
     }
 
 
 

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: dimgray\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"POST\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-inverse\" >\n");
      out.write("\n");
      out.write("                <div class=\"container\" >\n");
      out.write("\n");
      out.write("                    <!-- logo-->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#MainNavBar\" >\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a href=\"Home.jsp\" class=\"navbar-brand\" style=\"font-size:90 ;color:wheat\" >Human Resource Management System &nbsp&nbsp&nbsp&nbsp&nbsp</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--menu-item-->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"MainNavBar\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"Home.jsp\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--\n");
      out.write("                                                <li class=\"dropdown\" >\n");
      out.write("                                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\"> HR &nbsp<span class=\"caret\"></span></a>\n");
      out.write("                            \n");
      out.write("                                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                                        <li><a href=\"HR%20Manager.html\">HR Manager</a></li>\n");
      out.write("                                                        <li><a href=\"HR%20Personnel.html\">HR Personnel</a></li>\n");
      out.write("                            \n");
      out.write("                                                    </ul>\n");
      out.write("                                                </li>\n");
      out.write("                            -->\n");
      out.write("                            <li ><a href=\"jobs.jsp\">Jobs</a></li>\n");
      out.write("                            <li ><a href=\"ContactUS.jsp\">Contact Us</a></li>\n");
      out.write("                            <li ><a href=\"AboutHR.jsp\">About HR</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <li ><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("                            <li ><a href=\"Register.jsp\">Register</a></li>\n");
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
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <!-- Indicators -->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"2\" class=\"\"></li>\n");
      out.write("                </ol>\n");
      out.write("                <!--style=\"height: 600px; \" style=\"height: 450px;\"-->\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\" >\n");
      out.write("\n");
      out.write("                    <div class=\"item active\" align=\"center\">\n");
      out.write("                        <img class=\"first-slide\"  src=\"image1.jpg\" alt=\"First slide\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"carousel-caption\" >\n");
      out.write("                                <h1>One more for good measure..</h1>\n");
      out.write("\n");
      out.write("                                <big>  <p style=\"color:saddlebrown;font-size: 20px\"> Are you Frustrated and looking for a job? So it's a right place for you. You are only single click away.</p></big>\n");
      out.write("                                <p><a class=\"btn btn-lg btn-primary\" href=\"Login.jsp\" role=\"button\">Apply for Job.</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\"  align=\"center\" >\n");
      out.write("                        <img class=\"second-slide\" src=\"image2.jpg\" alt=\"Second slide\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"carousel-caption\" >\n");
      out.write("                                <h1>Looking For a Job?</h1>\n");
      out.write("                                <big>  <p style=\"color:saddlebrown;font-size: 20px\">Search job according to your abilities and Apply now. </p></big>\n");
      out.write("                                <p><a class=\"btn btn-lg btn-primary\" href=\"Register.jsp\" role=\"button\">Sign Up and Apply for Job.</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\" align=\"center\">\n");
      out.write("                        <img class=\"third-slide\" src=\"image3.jpg\" alt=\"Third slide\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"carousel-caption\" >\n");
      out.write("                                <h1>One more for good measure.</h1>\n");
      out.write("                                <p style=\"color:saddlebrown;font-size: 20px\"> Opportunities are like sunrises. If you wait too long, you miss them\n");
      out.write("                                    <br/> <code style=\"color:lightseagreen;background-color:greenyellow; font-size: 15px\">William Arthur Ward</code>\n");
      out.write("                                </p>\n");
      out.write("                                <p><a class=\"btn btn-lg btn-primary\" href=\"Login.jsp\" role=\"button\">Apply for Job</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <br/><br/>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

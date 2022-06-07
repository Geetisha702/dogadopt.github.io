package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PasswordSetting_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("    <style>\r\n");
      out.write("        \r\n");
      out.write("        .mytheme\r\n");
      out.write("        {\r\n");
      out.write("            height: 150px;\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("            width:20%;\r\n");
      out.write("        }\r\n");
      out.write("        .mytheme:hover\r\n");
      out.write("        {\r\n");
      out.write("            background-color: darkgray;\r\n");
      out.write("        }\r\n");
      out.write("        a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            color:white;\r\n");
      out.write("        };\r\n");
      out.write("    </style>\r\n");
      out.write("    <body> \r\n");
      out.write("    \r\n");
      out.write("        <table>\r\n");
      out.write("            \r\n");
      out.write("        </table>        \r\n");
      out.write("        \r\n");
      out.write("        <div style=\"width:100%;height:50px;background:gray; \">\r\n");
      out.write("            <table width='100%' >\r\n");
      out.write("                <tr>\r\n");
      out.write("<td style='background-color: lightskyblue' ><font color='white'>USER SIGN IN</font></td>\r\n");
      out.write("                    <td><font color='white'>UserId</font></td>\r\n");
      out.write("                    <td><input type='text' placeholder=\"Enter id here\"></td>\r\n");
      out.write("                    <td><font color='white'>Password</font></td>\r\n");
      out.write("                    <td><input type='password' placeholder=\"Enter password here\"></td>\r\n");
      out.write("                    <td><input type='submit' value='Login'></td>\r\n");
      out.write("                    <td><marquee scrollamount='7' behavior='alternate'> <font size=\"5\"><font color='white'> what if dogs are angels with a tail and a little fur too!!!</font></marquee>\r\n");
      out.write("            </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>    \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div style=\"width:100%;height:50px;background:white\">\r\n");
      out.write("            <table width=\"100%\">\r\n");
      out.write("                <tr>\r\n");
      out.write("<td width=\"20%\"><img src=\"dogg.jpg.png\"></td>\r\n");
      out.write("<td width=\"5%\"><font size=\"10px\">Pick<br> My <br>Dog</font></td>\r\n");
      out.write("<td>\r\n");
      out.write("    <table WIDTH=\"100%\">\r\n");
      out.write("        <tr BGCOLOR=\"lightblue\" align=\"center\">\r\n");
      out.write("            <td  class='mytheme'><marquee behavior='slide'><a href='homepage.jsp' >HOME</a></marquee></td>\r\n");
      out.write("            <td class='mytheme'><marquee behavior='slide'><a href='Aboutus.jsp'>ABOUT</a></marquee></td>\r\n");
      out.write("            <td class='mytheme'><marquee behavior='slide'><a href='PasswordSetting.jsp'>PASSWORD</a></marquee></td>\r\n");
      out.write("            <td class='mytheme'><marquee behavior='slide'><a href='homepage.jsp'>LOGOUT</a></marquee></td>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("        <div style=\"width:100%;height:100%;background-image:url('dogp.jpg')\">\r\n");
      out.write("        \r\n");
      out.write("            \r\n");
      out.write("                        <form action='LoginCode.jsp'>\r\n");
      out.write("            <table align='left' border='1' cellpadding='20' cellspacing='20' style='color: black;opacity:1.0;margin-left: 400px ;background-color: lightblue;opacity:0.6 '>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan='2'>PASSWORD SETTING FORM</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <td>ADMIN ID</td>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type='text' name='aId'></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <TR>\r\n");
      out.write("                    <td>OLD PASSWORD</td>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type='password'  name=\"oldPwd\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                 <TR>\r\n");
      out.write("                    <td>NEW PASSWORD</td>\r\n");
      out.write("                </TR>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type='password'  name=\"nPwd\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type='submit' value='Change'></td>\r\n");
      out.write("                    <td><input type='reset' value='Clear'></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                    \r\n");
      out.write("            </table>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("    </body>\r\n");
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

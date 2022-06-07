package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class ShowSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        .mytheme\n");
      out.write("        {\n");
      out.write("            height: 150px;\n");
      out.write("            font-size: 30px;\n");
      out.write("            width:20%;\n");
      out.write("        }\n");
      out.write("        .mytheme:hover\n");
      out.write("        {\n");
      out.write("            background-color: darkgray;\n");
      out.write("        }\n");
      out.write("        a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            color:white;\n");
      out.write("        };\n");
      out.write("    </style>\n");
      out.write("    <body> \n");
      out.write("    \n");
      out.write("        <table>\n");
      out.write("            \n");
      out.write("        </table>        \n");
      out.write("        \n");
      out.write("        <div style=\"width:100%;height:50px;background:gray; \">\n");
      out.write("            \n");
      out.write("            <form action=\"UserLoginCode.jsp\">\n");
      out.write("            <table width='100%' >\n");
      out.write("                <tr>\n");
      out.write("<td style='background-color: lightskyblue' ><font color='white'>USER SIGN IN</font></td>\n");
      out.write("                    <td><font color='white'>User Id</font></td>\n");
      out.write("                    <td><input type='text' placeholder=\"Enter id here\"  name=\"usId\"></td>\n");
      out.write("                    <td><font color='white'>Password</font></td>\n");
      out.write("                    <td><input type='password' placeholder=\"Enter password here\" name=\"uPass\"></td>\n");
      out.write("                    <td><input type='submit' value='Login'></td>\n");
      out.write("                    <td><marquee scrollamount='7' behavior='alternate'><font size=\"5\"> <font color='white'>what if dogs are angels with a tail and a little fur too!!!</font></marquee>\n");
      out.write("            </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>    \n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"width:100%;height:50px;background:white\">\n");
      out.write("            <table width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("<td width=\"20%\"><img src=\"dogg.jpg.png\"></td>\n");
      out.write("<td width=\"5%\"><font size=\"10px\">Pick<br> My <br>Dog</font></td>\n");
      out.write("<td>\n");
      out.write("    <table WIDTH=\"100%\">\n");
      out.write("        <tr BGCOLOR=\"lightblue\" align=\"center\">\n");
      out.write("            <td  class='mytheme'><marquee behavior='slide'><a href='homepage.jsp' >HOME</a></marquee></td>\n");
      out.write("            <td class='mytheme'><marquee behavior='slide'><a href='PasswordSetting.jsp'>PASSWORD</a></marquee></td>\n");
      out.write("            \n");
      out.write("            <td class='mytheme'><marquee behavior='slide'><a href='DeleteProfile.jsp'>DELETE</a></marquee></td>\n");
      out.write("            <td class='mytheme'><marquee behavior='slide'><a href='homepage.jsp'>LOGOUT</a></marquee></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div style=\"width:100%;height:100%;background-image:url('dogp.jpg')\">\n");
      out.write("        \n");
      out.write("            <div style=\"width:100%;height:100%;background-image:url('dogp.jpg')\">\n");
      out.write("        \n");
      out.write("                <form action=\"SearchResults.jsp\">\n");
      out.write("                \n");
      out.write("                    <table align='left' border='1' cellpadding='20' cellspacing='20' style='color: black;margin-top: 80px;margin-right:500px ;margin-left: 600px ;background-color: lightblue;opacity:0.6 '>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan='2'>SEARCH PROFILE</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


String id=request.getParameter("userId");


Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","geet@24730");
PreparedStatement st=con.prepareStatement("select * from profiletable where userid=?");
st.setString(1,id);

ResultSet rs=st.executeQuery(); 
if(rs.next())
      out.write("\n");
      out.write("                <TR>\n");
      out.write("              \n");
      out.write("                      \n");
      out.write("                <TR>\n");
      out.write("                    <td>OWNER</td>\n");
      out.write("          \n");
      out.write("                </TR>\n");
      out.write("                <TR>\n");
      out.write("                    <td>DOG NAME</td>\n");
      out.write("                    <td><input type='text' name=\"dogname\" value=\"");
      out.print(rs.getString("dogname"));
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                </TR>\n");
      out.write("                <TR>\n");
      out.write("                    <td>DOG BREED</td>\n");
      out.write("                            <td><input type='text' name=\"dogbreed\"></td>\n");
      out.write("\n");
      out.write("                </TR>\n");
      out.write("                <TR>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                     <td><input type='text' name=\"emailid\"></td>\n");
      out.write("\n");
      out.write("                </TR>\n");
      out.write("                \n");
      out.write("                <TR>\n");
      out.write("                    <td>City</td>\n");
      out.write("                    <td><select name=\"city\">\n");
      out.write("                        <option>Select City</option>\n");
      out.write("                        <option>indore</option>\n");
      out.write("                        <option>pune</option>\n");
      out.write("                        </select></td>\n");
      out.write("\n");
      out.write("                </TR>\n");
      out.write("                    \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("                    </form>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            \n");
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

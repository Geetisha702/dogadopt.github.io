package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <Style>\n");
      out.write("        .myepic\n");
      out.write("        {\n");
      out.write("            font-family:italic;\n");
      out.write("            font-weight:bold;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .myepic:hover\n");
      out.write("        {\n");
      out.write("            background:burlywood;\n");
      out.write("            font-Style:italic;\n");
      out.write("        }\n");
      out.write("        </Style>\n");
      out.write("        <body bgcolor=\"#e5e4d0\">\n");
      out.write("        \n");
      out.write("        </body>\n");
      out.write("        <table>\n");
      out.write("           \n");
      out.write("                    <tr align=\"center\">\n");
      out.write("                        <img src=\"dogp.jpg\"width=\"20% \"height=\"200px\"  align=\"center\">\n");
      out.write("                    </tr>\n");
      out.write("        </table>\n");
      out.write("        <table>\n");
      out.write("            \n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("        <table>\n");
      out.write("            \n");
      out.write("                  <tr>\n");
      out.write("                  <td class =\"myepic\" ADMIN LOGIN</td>\n");
      out.write("                      \n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("            \n");
      out.write("                  \n");
      out.write("               \n");
      out.write("        \n");
      out.write("               \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        ");
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

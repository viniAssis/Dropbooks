package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery-3.3.1.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("                $('#enviar').click(function(){\r\n");
      out.write("\r\n");
      out.write("                    alert(\"\");\r\n");
      out.write("\r\n");
      out.write("                     var email = $(\"#email\").val();\r\n");
      out.write("                     var senha = $(\"#senha\").val();\r\n");
      out.write("\r\n");
      out.write("                     $.ajax({\r\n");
      out.write("                                type:'POST',\r\n");
      out.write("                                url : \"UsuarioServlet\",\r\n");
      out.write("                                data : {\r\n");
      out.write("                                    email : email,\r\n");
      out.write("                                    senha : senha\r\n");
      out.write("                                },\r\n");
      out.write("                                success : function(results){\r\n");
      out.write("                                    if(results === \"1\"){\r\n");
      out.write("                                        $(\"#email\").css(\"color\", \"red\");\r\n");
      out.write("                                    }else if(results === \"2\"){\r\n");
      out.write("                                        $(\"#senha\").css(\"color\", \"red\");\r\n");
      out.write("                                    }else{\r\n");
      out.write("                                        $(\"#email\").css(\"color\", \"green\");\r\n");
      out.write("                                        $(\"#senha\").css(\"color\", \"green\");\r\n");
      out.write("                                    }\r\n");
      out.write("                                }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <p><input type=\"text\" id=\"email\"></p>\r\n");
      out.write("        <p><input type=\"text\" id=\"senha\"></p>\r\n");
      out.write("        <p><input type=\"submit\" id=\"enviar\"></p>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

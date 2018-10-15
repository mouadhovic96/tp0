package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class home1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("          <style>\n");
      out.write("#wrapper {\n");
      out.write("width:400px;\n");
      out.write("height:350px;\n");
      out.write("margin-top: 40px;\n");
      out.write("margin-left: 500px;\n");
      out.write("border-radius:30px;\n");
      out.write("font-family: helvetica;\n");
      out.write("font-size:1.2em;\n");
      out.write("border: 1px solid grey;\n");
      out.write("background-color: appworkspace;\n");
      out.write("}\n");
      out.write(".form-group{\n");
      out.write("   \n");
      out.write("    width:300px;\n");
      out.write("\n");
      out.write("    \n");
      out.write("}\n");
      out.write("/*input {\n");
      out.write("width:300px;\n");
      out.write("height:30px;\n");
      out.write("padding:5px;\n");
      out.write("border-radius:5px;\n");
      out.write("font-size:1.2em;\n");
      out.write("border: 1px solid grey;\n");
      out.write("margin-bottom:10px;\n");
      out.write("}\n");
      out.write("label {\n");
      out.write("width:200px;\n");
      out.write("\n");
      out.write("padding-top:7px;\n");
      out.write("}*/\n");
      out.write("#validationForm{\n");
      out.write("    margin-left: 50px;\n");
      out.write("}\n");
      out.write("#welcomme{\n");
      out.write("   margin-left: 550px;\n");
      out.write("   margin-top: 30px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("#submitButton {\n");
      out.write("height:50px;\n");
      out.write("margin-left:200px;\n");
      out.write("width:100px;\n");
      out.write("}\n");
      out.write("#error {\n");
      out.write("color:red;\n");
      out.write("margin:20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#/WebApplication2/CLOCO\">REST25</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarText\" aria-controls=\"navbarText\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarText\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"#navbarText\"> <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("       \n");
      out.write("    </ul>\n");
      out.write("    <span class=\"navbar-text\">\n");
      out.write("      \n");
      out.write("    </span>\n");
      out.write("  </div>\n");
      out.write("   <form   class=\"form-inline my-2 my-lg-0\" methode=\"post\" action=\"login\">\n");
      out.write("      <input name=\"nlog\" class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Name\" aria-label=\"Name\">\n");
      out.write("      <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">LOG</button>\n");
      out.write("    </form>\n");
      out.write("</nav>\n");
      out.write("        ");
 if(request.getAttribute("error").equals("er") ) {
      out.write("\n");
      out.write("        <div class=\"alert alert-danger\" style=\"display: ");
   
      out.write("\" role=\"alert\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
}
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("        <div id=\"welcomme\">\n");
      out.write("            \n");
      out.write("            <h1 class=\"display-2\">welcome to Rest25</h1>\n");
      out.write("        </div>\n");
      out.write("       <div id=\"wrapper\">\n");
      out.write("<div id=\"error\"></div>\n");
      out.write("<form id=\"validationForm\" method=\"post\" action=\"term\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleFormControlInput1\">Name</label>\n");
      out.write("    <input name=\"name\" type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"name\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleFormControlSelect1\">LIST OF RESTAURENT</label>\n");
      out.write("    <select  name=\"rest\" class=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <option>  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("           </option>\n");
      out.write("      <option>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("      <option>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("      <option>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("      <div class=\"form-group\">\n");
      out.write("<div class='input-group date' id='datetimepicker1'>\n");
      out.write("    <input name=\"time\" type=\"date\" class=\"form-control\"   min=\"2018-01-01\" max=\"2018-12-31\" placeholder=\"yyyy/mm/dd\"/>\n");
      out.write("<span class=\"input-group-addon\"><span class=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("</span>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <button type=\"submit\" class=\"btn btn-lg btn-primary\" >RESERVER</button>\n");
      out.write(" <a href=\"/WebApplication2/Show\">Show Evaluation</a>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("      \n");
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

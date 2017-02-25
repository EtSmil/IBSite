package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/tails/Header.jsp");
    _jspx_dependants.add("/tails/Footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"scripts/navbar.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("      <link href=\"css/newcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <ul class=\"topnav\" id=\"myTopnav\">\n");
      out.write("            \n");
      out.write("              \n");
      out.write("  \n");
      out.write("\n");
      out.write("  <li><a href=\"#contact\">Kontakt os</a></li>\n");
      out.write("  <li><a href=\"#about\">Doner</a></li>\n");
      out.write("  <li><a href=\"#about\">Bliv frivillig</a></li>\n");
      out.write("  \n");
      out.write("    <li><a href=\"#news\">Vores mål</a></li>\n");
      out.write("  <li><a class=\"active\" href=\"#hvem\">Hvem?</a></li>\n");
      out.write("  <li class=\"myIcon\"><a  href=\"#hvem\">IRAQ Builders</a></li>    \n");
      out.write("  <li class=\"icon\">\n");
      out.write("    <a href=\"javascript:void(0);\" style=\"font-size:15px;\" onclick=\"myFunction()\">☰</a>\n");
      out.write("  </li>\n");
      out.write("  \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("       ");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<div id=\"hvem\" class=\"section bg1 text-center\">\n");
      out.write("        <h1 >Hvem er IRAQ Builders?</h1>\n");
      out.write("\n");
      out.write("        <video class=\"videoSection\" width=\"700\"  controls>\n");
      out.write("            <source src=\"vid/IBCar.mp4\" type=\"video/mp4\">\n");
      out.write("            Your browser does not support the <code>video</code> tag.\n");
      out.write("        </video>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <div class=\"text-video\">\n");
      out.write("    <h2>Hvem er vi?</h2>\n");
      out.write("    <p>\n");
      out.write("IRAQ Builders består af en gruppe unge initiativtagere i Irak, der sammen med deres ligesindede i andre lande har skabt en international organisation, der sigter efter et bedre Irak med en lysere fremtid. \n");
      out.write("\n");
      out.write("De frivillige har til formål at beskytte liv, sørge for helbred og sikre respekt for mennesket i Irak. De forsørger nationalt (i Irak) at forhindre og lindre menneskelig lidelse primært gennem genopbygning af ruinerede huse som følge af krig og de daglige destruktive overfald på mennesket. \n");
      out.write("\n");
      out.write("IRAQ Builders er en ikke-statslig organisation, og vi repræsenterer ikke en bestem politisk eller religiøs holdning.\n");
      out.write("\n");
      out.write("IRAQ Builders yder hjælp og støtte til alle irakere, uden hensyn til deres religiøse-, politiske- og racemæssige tilhørsforhold. \n");
      out.write("        \n");
      out.write("    </p>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("    \n");
      out.write("<div class=\"floating-box2\">\n");
      out.write("\n");
      out.write("        <h1> Følg os på </h1>\n");
      out.write("       \n");
      out.write("        <a href=\"https://www.facebook.com/iraqbuildersDK/\">@Facebok</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("<div class=\"floating-box2-center\">\n");
      out.write("\n");
      out.write("        <h1> Kontakt </h1>\n");
      out.write("        \n");
      out.write("        <a >IRAQBuildersdk@hotmail.dk</a>\n");
      out.write("    <a>tlf: 28 66 10 72</a>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("   <div class=\"floating-box2\">\n");
      out.write("\n");
      out.write("        <h1> Støt os</h1>\n");
      out.write("        <a> Mobilepay</a>\n");
      out.write("        <a> Bankoverføresel</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"copyR\">\n");
      out.write("<a  href=\"https://www.linkedin.com/in/yousef-mohsen-616ab5139?trk=nav_responsive_tab_profile_pic\" target=\"_blank\">@Yousef Mohsen</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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

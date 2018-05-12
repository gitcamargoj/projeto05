package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.projeto05.quiz.Pergunta;
import br.com.fatecpg.projeto05.quiz.Quiz;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/jspf/bootstrap_gfonts.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/navbar_inicio.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/navbar_fim.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/bootstrap_js_end_body.jspf");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    boolean desafiado = false;
    double resultado = 0.0;
    if(request.getParameter("desafiado") != null){
        desafiado = true;
        int acertou = 0;
        for(int i = 0; i < Quiz.getDesafio().size(); i++){
            Pergunta pergunta = Quiz.getDesafio().get(i);
            String respostaUsuario = request.getParameter(pergunta.getPergunta());
            if(pergunta.getResposta().equals(respostaUsuario)) acertou++;
        }
        resultado = 100.0 * ((double)(acertou) / (double)(Quiz.getDesafio().size()));
    }

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    \n");
      out.write("    <!-- CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/css.css\">\n");
      out.write("        \n");
      out.write("    <!-- CSS Bootstrap -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("    <!-- Bootstrap Responsive tag -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        \n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Bree+Serif\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>SUPER QUIZ: Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"body_color\">\n");
      out.write("\n");
      out.write("        ");
      out.write("    <!-- Navbar -->\n");
      out.write("    <center>\n");
      out.write("    <nav>\n");
      out.write("        <div>\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                <li>\n");
      out.write("\n");
      out.write("                        <a href=\"home.jsp\" class=\"a_navbar a_link_navbar\">SUPER QUIZ</a>\n");
      out.write("        ");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        ");
 if(desafiado) { 
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <h3 class=\"h3_body\">");
      out.print( session.getAttribute("nomeUsuario") );
      out.write(", você teve um acerto total de: ");
      out.print( resultado );
      out.write("%</h3>\n");
      out.write("        <hr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Sistema de login -->\n");
      out.write("        <br><br><br>\n");
      out.write("        <center>\n");
      out.write("            <h3 class=\"h3_body\">Para ser desafiado você precisa entrar com o seu nome de usuário.</h3>\n");
      out.write("            <p class=\"p3_body\">Se você já fez participou do desafio antes, basta colocar o mesmo nome de usuário e clicar em Enviar.<br> Se for sua primeira vez é só escolher um nome de usuário e clicar em Enviar!</p>\n");
      out.write("        </center>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <form method=\"post\" action=\"quiz.jsp\">\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                            <input class=\"form-control\" aria-label=\"Large\" aria-describedby=\"inputGroup-sizing-sm\" type=\"text\" name=\"usuario\" value=\"\" required/>\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-dark btn-lg btn-block fonte_botao\" name=\"enviar\" value=\"Enviar\"/>\n");
      out.write("                            </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- JS Bootstrap -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\n");
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

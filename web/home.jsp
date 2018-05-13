<%-- 
    Document   : home
    Created on : May 9, 2018, 10:39:06 AM
    Author     : JOSEANTONIODECAMARGO
--%>

<%@page import="br.com.fatecpg.projeto05.quiz.Ranking"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Banco"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Pergunta"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Quiz"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
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
    
           
            Ranking dadosRanking = new Ranking();
            dadosRanking.setdadosRanking(resultado);
           
         
%>
<html>
    <head>
        <%@include file="WEB-INF/jspf/bootstrap_gfonts.jspf" %>
        <title>SUPER QUIZ: Home</title>
    </head>
    <body class="body_color">

        <%@include file="WEB-INF/jspf/navbar_inicio.jspf" %>
                        <a href="home.jsp" class="a_navbar a_link_navbar">SUPER QUIZ</a>
        <%@include file="WEB-INF/jspf/navbar_fim.jspf" %>
    
        <% if(desafiado) { %>
        <hr>
        <h3 class="h3_body"><%= session.getAttribute("nomeUsuario") %>, você teve um acerto total de: <%= resultado %>%</h3>
        <hr>
        <% } %>
        
        <!-- Sistema de login -->
        <br><br><br>
        <center>
            <h3 class="h3_body">Para ser desafiado você precisa entrar com o seu nome de usuário.</h3>
            <p class="p3_body">Se você já fez participou do desafio antes, basta colocar o mesmo nome de usuário e clicar em Enviar.<br> Se for sua primeira vez é só escolher um nome de usuário e clicar em Enviar!</p>
        </center>
        <br>
        
        <center>
            <table>
                <tr>
                    <td>
                        <form method="post" action="quiz.jsp">
                            <div class="input-group mb-3">
                            <input class="form-control" aria-label="Large" aria-describedby="inputGroup-sizing-sm" type="text" name="usuario" value="" required/>
                            <div class="input-group-append">
                                <input type="submit" class="btn btn-dark btn-lg btn-block fonte_botao" name="enviar" value="Enviar"/>
                            </div>
                            </div>
                        </form>
                    </td>
                </tr>
            </table>
        </center>
        
        <%@include file="WEB-INF/jspf/bootstrap_js_end_body.jspf" %>
    </body>
</html>

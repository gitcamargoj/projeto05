
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Pergunta"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Quiz"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Banco"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Jogador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- Sessão do Usuario --%>
<%
   String nome = request.getParameter( "usuario" );
   session.setAttribute( "nomeUsuario", nome );
%> 

<%-- Adicionando no Banco --%>
<%
    try {
        if(request.getParameter("enviar") != null){
           Jogador novoUsuario = new Jogador();
            novoUsuario.setName(nome);
            Banco.getJogador().add(novoUsuario);
            
            //response.sendRedirect(request.getRequestURI());
        }
        
        boolean verifica = Banco.getJogador().contains(nome);
        System.out.println(verifica);
        /*for(int i = 0; i < Banco.getUsuarios().size(); i++){
            if(!Banco.getUsuarios().contains(nome)){
                Usuario novoUsuario = new Usuario();
                novoUsuario.setNomeUsuario(request.getParameter("usuario"));
                Banco.getUsuarios().add(novoUsuario);
            }
        }*/
    }catch(Exception ex) { %>
        <script>alert("Preencha corretamente o nome do usuario");</script>
    <% }
%>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/jspf/bootstrap_gfonts.jspf" %>
        <title>SUPER QUIZ: Desafio</title>
    </head>
    <body class="body_color">
        
        <%@include file="WEB-INF/jspf/navbar_inicio.jspf" %>
                        <a href="home.jsp" class="a_navbar a_link_navbar">SUPER QUIZ: </a><a href="quiz.jsp" class="a_navbar a_desafio">Desafio</a>
        <%@include file="WEB-INF/jspf/navbar_fim.jspf" %>
        <br><br><br>
        <center>
            <table>
                <tr>
                    <td>
                        <form method="post" action="home.jsp">
                            <%-- Criando um vetor com número aleatorios  --%>
                            <% 
                               ArrayList<Integer> ordemAleatoria = new ArrayList<>();
                               int count = 0;
                               while(count < Quiz.getDesafio().size()){
                                   int aleatorio = (int)(Math.random() * Quiz.getDesafio().size());
                                   if(!ordemAleatoria.contains(aleatorio)){
                                       ordemAleatoria.add(aleatorio);
                                       ++count;
                                   }
                               }
                            %>
                            
                            <%-- Lendo as perguntas sorteadas --%>
                            <% for(int i = 0; i < Quiz.getDesafio().size(); i++) { %>                            
                            <% Pergunta pergunta = Quiz.getDesafio().get(ordemAleatoria.get(i)); %>
                                <h3 class="h3_quiz"><%= pergunta.getPergunta() %><h3>
                                    <% for(int j = 0; j < pergunta.getAlternativas().length; j++) { %>
                                    <div class="form-check form-check-inline">
                                        <input class="form-check-input" type="radio" name="<%= pergunta.getPergunta() %>" value="<%= pergunta.getAlternativas()[j] %>" required/>
                                    </div>    
                                        <span class="alternativas_quiz"><%= pergunta.getAlternativas()[j] %></span>
                                    <% } %>
                                    <hr class="hr_cor_linha">
                            <% } %>
                            
                            <center><input class="btn btn-light btn-lg btn-block fonte_botao" type="submit" name="desafiado" value="Enviar"/></center>
                        </form>
                    </td>
                </tr>
            </table>
        </center>
        
        
    <%--
        <h1 class="h1_quiz">Olá, <%= session.getAttribute("nomeUsuario") %></h1>
        <h1 class="h1_quiz">Banco: <%= Banco.getUsuarios().toString() %></h1>
    --%>    
        <%@include file="WEB-INF/jspf/bootstrap_js_end_body.jspf" %>
    </body>
</html>

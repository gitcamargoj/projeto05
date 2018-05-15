

<%@page import="java.text.DecimalFormat"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Ordenar"%>
<%@page import="java.util.Collections"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Ranking"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Pergunta"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Quiz"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Banco"%>
<%@page import="br.com.fatecpg.projeto05.quiz.Usuario"%>

<%
    DecimalFormat ff1 = new DecimalFormat("#");
    DecimalFormat ff = new DecimalFormat("0");
    
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ranking</title>
    </head>
    <body>
        <a href="home.jsp">Home</a>
        <div>
            <div>
                <h1>Ranking</h1> 
                <hr>
                <div>
                    <table>
                        <thead>  <!--//tabela cabeçalho-->
                            
                            <th>Pontuação</th>
                        </thead>   <tbody>    <!--//tabela corpo-->
                            <%
                                ArrayList<Ranking> ranking = Ranking.ranking;
                                Collections.sort(ranking, new Ordenar());  //coloca em ordem ranking pela pontuaçao
                                for (int i = 0; i < Ranking.getRanking().size(); i++) {{%>
                            <tr>
                                 <td>
                                    <%= dadosRanking.getJogador(i).getNome(i)%>
                                </td>
                               <td>
                                   <%= ranking.getdadosRanking(i) %>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>    
            </div>
        </div>
    </body>
</html>

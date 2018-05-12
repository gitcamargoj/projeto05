<%@page import="br.com.fatecpg.projeto05.quiz.Jogador"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <body>
                        
                        <% try {
            if (request.getParameter ("btnenvia") !=null){
        
                   String nome = request.getParameter("name");
                   HttpSession sessão = request.getSession();
                   sessão.setAttribute("teste", nome);
                   Jogador user2 = new Jogador(nome);
                   response.sendRedirect("home.jsp");
            }
        }catch(Exception ex){
        
        }
        %>
  
    </body>
</html>

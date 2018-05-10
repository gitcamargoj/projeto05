<%-- 
    Document   : quiz
    Created on : May 9, 2018, 10:40:19 AM
    Author     : JOSEANTONIODECAMARGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%-- Capturando o nome do usuario --%>
<%
   String nome = request.getParameter( "usuario" );
   session.setAttribute( "nomeUsuario", nome );
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SUPER QUIZ</title>
    </head>
    <body>
        <h1>Olá, <%= session.getAttribute( "nomeUsuario" ) %></h1>
    </body>
</html>

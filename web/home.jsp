<%-- 
    Document   : home
    Created on : May 9, 2018, 10:39:06 AM
    Author     : JOSEANTONIODECAMARGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!-- CSS -->
        <link rel="stylesheet" href="css/css.css">
        
        <!-- CSS Bootstrap -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
        
        <!-- Bootstrap Responsive tag -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        
        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Bree+Serif" rel="stylesheet">
        
        <title>SUPER QUIZ</title>
    </head>
    <body class="body_color">
        <!-- Navbar -->
        <center>
        <nav>
            <div>
                <ul class="navbar-nav mr-auto">
                    <li>
                        <a href="home.jsp" class="a_navbar a_link_navbar">SUPER QUIZ</a>
                    </li>
                </ul>
            </div>
        </nav>
        </center>
    
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
                                <input type="submit" class="btn btn-light-secondary" value="Enviar"/>
                            </div>
                            </div>
                        </form>
                    </td>
                </tr>
            </table>
        </center>
        
    
        <!-- JS Bootstrap -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    </body>
</html>

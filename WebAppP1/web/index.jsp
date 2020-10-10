<%-- 
    Document   : index
    Created on : 10 de out de 2020, 14:29:54
    Author     : rlarg
--%>

<%@page import="ads.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Início - P1</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/menu.jspf" %>
        <h1>Início</h1>
        <h2>Nome</h2>
        <div>Ricardo Pupo Larguesa</div>
        <h2>RA</h2>
        <div>00000000</div>
        <h2>Disciplinas matriculadas</h2>
        <div><%= Disciplina.getList().size() %></div>
    </body>
</html>

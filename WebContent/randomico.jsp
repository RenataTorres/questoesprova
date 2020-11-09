<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>PÁGINA PARA GERAR NÚMERO RANDÔMICO</h1>
	<p>Número gerado = 
	<% java.util.Random geradorDeNumeros = new java.util.Random(); %>
	<%= geradorDeNumeros.nextInt(100) %></p>

</body>
</html>
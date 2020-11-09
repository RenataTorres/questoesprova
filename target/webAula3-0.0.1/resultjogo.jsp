<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Resultado da Simulação</h1>
	<%
		List<Integer> listajogo = (List) request.getAttribute("jogo_bean");
		for(int i=0;i<listajogo.size();i++) {
			out.print(" "+listajogo.get(i));
		}
	%>
	<p><a href="formjogo.jsp">Retornar</a></p>
</body>
</html>
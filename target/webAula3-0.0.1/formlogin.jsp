<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bem-vindo!</h1>
	<form action="ControladorForm">
		<label>Informe seu nome:
			<input type="text" name="nome">
		</label>
		<button type="submit">Entrar</button>
	</form>
	<br>
	<%= request.getParameter("erro") %>
	
</body>
</html>
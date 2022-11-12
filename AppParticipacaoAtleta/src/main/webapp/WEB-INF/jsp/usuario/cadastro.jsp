<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Usuários</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
		<h2>Usuário</h2>
		<form action="/usuario/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> 
				<input type="text" class="form-control" placeholder="Entre com seu nome" name="nome">
			</div>
			
			<div class="form-group">
				<label>Email:</label>
				 <input type="text" class="form-control" placeholder="Entre com seu email" name="email">
			</div>
			
			<div class="form-group">
				<label>Senha:</label>
				 <input type="text" class="form-control" placeholder="Entre com sua senha" name="senha">
			</div>
			
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
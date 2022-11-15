<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Usuarios</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
	
	<form action="/cep" class="form-inline" method="post">
		<div class="form-group">
				<label>Cep:</label> 
				<input type="text" class="form-control" placeholder="Entre com o seu CEP" name="cep">
		</div>	
		 <button type="submit" class="btn btn-default">Buscar</button>
	</form>
		
		<h2>Usuario</h2>
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
				 <input type="password" class="form-control" placeholder="Informe sua senha" name="senha">
			</div>			
			
			<c:import url="/WEB-INF/jsp/endereco.jsp"/>	
						
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Atletas</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
		<h2>Atleta</h2>
		<form action="/atleta/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> 
				<input type="text" class="form-control" placeholder="Entre com seu nome" name="nome">
			</div>
			
			<div class="form-group">
				<label>CPF:</label>
				 <input type="text" class="form-control" placeholder="Entre com seu CPF" name="cpf">
			</div>
			
			<div class="form-group">
				<label>Gênero</label>
				    <div class="form-check">
				        <input type="radio" class="form-check-input" name="genero" value="true"> Feminino
				        <label class="form-check-label"></label> 
			        </div>							
			       <div class="form-check">
				        <input type="radio" class="form-check-input" name="genero" value="false"> Masculino
				        <label class="form-check-label"></label> 
			       </div>
			</div>
			
			<div class="form-group">
				<label>É PCD?</label>
				    <div class="form-check">
				        <input type="radio" class="form-check-input" name="pcd" value="true"> Sim
				        <label class="form-check-label"></label> 
			        </div>							
			       <div class="form-check">
				        <input type="radio" class="form-check-input" name="pcd" value="false"> Nao
				        <label class="form-check-label"></label> 
			       </div>
			</div>
			
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
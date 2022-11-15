<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Natação</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
		<h2>Natação</h2>
		<form action="/natacao/incluir" method="post">
			<div class="form-group">
				<label>Estilo:</label> 
				<input type="text" class="form-control" placeholder="Informe o estilo da natação" name="estilo">
			</div>
			
			<div class="form-group">
				<label>Distância:</label>
				 <input type="number"  class="form-control" placeholder="Informe a distância" name="distancia">
			</div>
														
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
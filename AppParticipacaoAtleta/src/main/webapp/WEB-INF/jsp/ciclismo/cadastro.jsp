<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Ciclismo</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
		<h2>Ciclismo</h2>
		<form action="/ciclismo/incluir" method="post">
			<div class="form-group">
				<label>Categoria:</label> 
				<input type="text" class="form-control" placeholder="Informe a categoria" name="categoria">
			</div>
			
			<div class="form-group">
				<label>Classificação:</label>
				 <input type="text" class="form-control" placeholder="Informe a classificação" name="classificacao">
			</div>
			
			<div class="form-group">
				<label>Tipo de bicicleta:</label>
				 <input type="text" class="form-control" placeholder="Informe o tipo de bicicleta" name="tipo_bicicleta">
			</div>
									
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
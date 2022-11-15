<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Corrida</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
		<h2>Corrida</h2>
		<form action="/corrida/incluir" method="post">
			<div class="form-group">
				<label>Tipo:</label> 
				<input type="text" class="form-control" placeholder="Informe o tipo da corrida" name="tipo">
			</div>
			
			<div class="form-group">
				<label>Percurso:</label>
				 <input type="number"  class="form-control" placeholder="Informe o percurso" name="percurso">
			</div>
			
			<div class="form-group">
				<label>Possui obstáculo?</label>
				    <div class="form-check">
				        <input type="radio" class="form-check-input" name="obstaculo" value="true"> Sim
				        <label class="form-check-label"></label> 
			        </div>							
			       <div class="form-check">
				        <input type="radio" class="form-check-input" name="obstaculo" value="false"> Nao
				        <label class="form-check-label"></label> 
			       </div>
			</div>
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Eventos</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
		<h2>Evento</h2>
		<form action="/evento/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> 
				<input type="text" class="form-control" placeholder="Entre com seu nome" name="nome">
			</div>
			
			<div class="form-group">
				<label>Data de realização:</label>
				 <input type="date" class="form-control" placeholder="Data de realização" name="dt_realizacao">
			</div>
					
			<div class="form-group">
				<label>Possui assistência PCD??</label>
				    <div class="form-check">
				        <input type="radio" class="form-check-input" name="assistencia_pcd" value="true"> Sim
				        <label class="form-check-label"></label> 
			        </div>							
			       <div class="form-check">
				        <input type="radio" class="form-check-input" name="assistencia_pcd" value="false"> Nao
				        <label class="form-check-label"></label> 
			       </div>
			</div>
			
			<div class="form-group">
				<label>Qual tipo de assistência PCD?:</label> 
				<input type="text" class="form-control" placeholder="Informe o tipo de assistência PCD" name="tipo_assistencia_pcd">
			</div>
						
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
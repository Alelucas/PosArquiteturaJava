<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Participações</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
		<h2>Participação</h2>
		<form action="/participacao/incluir" method="post">
			<div class="form-group">
				<label>Data da inscrição:</label> 
				<input type="datetime-local" class="form-control" placeholder="Data da inscrição" name="dt_inscricao">
			</div>
			
			<div class="form-group">
				<label>Atleta:</label>
				 <select name = "atleta" class = "form-select">
				   <c:forEach var='a' items="${atletas}">
				    <option value="${a.id}">${a.nome}</option>
				   </c:forEach>
				 </select>
			</div>
			
			<div class="form-group">
				<label>Evento:</label>
				<c:forEach var="e" items="${eventos}">
				   <div class="form-check">
				    <input class="form-check-input" type="checkbox" name="eventos" value="${e.id}">
				    <label class="form-check-label"> ${e.nome}</label>	 
				   </div>				
				</c:forEach>
			</div>			
				
			 <button type="submit" class="btn btn-default">Cadastrar</button>
		</form>
	</div>

</body>
</html>
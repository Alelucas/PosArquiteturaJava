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
	  <h3>Eventos: ${listagem.size()}</h3>
	  
	   <h4><a href="/evento"> Novo Evento </a></h4>
		  
		    <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Data Realização</th>
	        <th>Assistência PCD</th>
	        <th>Tipo Assistência PCD</th>	    
	         <th></th>	
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var='e' items="${listagem}">	    
	      		<tr>
			        <td>${e.id}</td>
			        <td>${e.nome}</td>
			        <td>${e.dt_realizacao}</td>
			        <td>${e.assistencia_pcd}</td>
			        <td>${e.tipo_assistencia_pcd}</td>	
			        <td><a href="/evento/${e.id}/excluir">excluir</a></td>		       
	      		</tr>
	      	</c:forEach>	   
	    </tbody>
	  </table>
		  
	</div>

</body>
</html>
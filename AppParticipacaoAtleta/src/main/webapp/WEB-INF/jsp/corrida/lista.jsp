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
	 <h3>Corrida: ${listagem.size()}</h3>
		  
		    <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Data Realização</th>
	        <th>Assistência PCD</th>
	        <th>Tipo Assistência PCD</th>
	        <th>Tipo</th>
	        <th>Percurso</th>
	        <th>Obstáculo</th>	  
	        <th></th>     
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var='cr' items="${listagem}">	    
	      		<tr>
			        <td>${cr.id}</td>
			        <td>${cr.nome}</td>
			        <td>${cr.dt_realizacao}</td>
			        <td>${cr.assistencia_pcd}</td>
			        <td>${cr.tipo_assistencia_pcd}</td>
			        <td>${cr.tipo}</td>
			        <td>${cr.percurso}</td>
			        <td>${cr.obstaculo}</td>
			        <td><a href="/corrida/${cr.id}/excluir">excluir</a></td>
	      		</tr>
	      	</c:forEach>	   
	    </tbody>
	  </table>
		  
	</div>

</body>
</html>
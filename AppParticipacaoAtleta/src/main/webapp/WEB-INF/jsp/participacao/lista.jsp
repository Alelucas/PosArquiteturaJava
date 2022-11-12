<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de Participacao</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>	
	<div class="container mt-3">
	   <h3>Participação: ${listagem.size()}</h3>
		  
		    <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Data Inscrição</th>
	        <th>Atleta</th>
	        <th>Eventos</th>        
	        <th></th> 
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var='p' items="${listagem}">	    
	      		<tr>
			        <td>${p.id}</td>
			        <td>${p.dt_inscricao}</td>
			        <td>${p.atleta.nome}</td>
			        <td>${p.eventos.nome}</td>		
			         <td><a href="/participacao/${p.id}/excluir">excluir</a></td>	 
	      		</tr>
	      	</c:forEach>	   
	    </tbody>
	  </table>
		  
	</div>

</body>
</html>
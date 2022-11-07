<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Participacao</title>
</head>
<body>
	<div class="container mt-3">
	   <h3>Participa��o: ${listagem.size()}</h3>
		  
		    <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Data Inscri��o</th>
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
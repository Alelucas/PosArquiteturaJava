<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
	<title>Cadastramento de Natacao</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Natação: ${listagem.size()}</h3>
		  
		    <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>Nome</th>
	        <th>Data Realização</th>
	        <th>Assistência PCD</th>
	        <th>Tipo Assistência PCD</th>
	        <th>Estilo</th>
	        <th>Distância</th>	 
	        <th></th>	   
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach var='n' items="${listagem}">	    
	      		<tr>
			        <td>${n.id}</td>
			        <td>${n.nome}</td>
			        <td>${n.dt_realizacao}</td>
			        <td>${n.assistencia_pcd}</td>
			        <td>${n.tipo_assistencia_pcd}</td>
			        <td>${n.estilo}</td>
			        <td>${n.distancia}</td>
			        <td><a href="/natacao/${n.id}/excluir">excluir</a></td>
	      		</tr>
	      	</c:forEach>	   
	    </tbody>
	  </table>
		  
	</div>

</body>
</html>
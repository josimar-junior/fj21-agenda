<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Contato</title>
</head>
<body>
	
	<c:import url="cabecalho.jsp"/>
	
	<form action="adicionaContato" method="POST">
	
		<label for="nome">Nome:</label>
		<input type="text" name="nome" id="nome"/> <br/><br/>
		
		<label for="nome">E-mail:</label>
		<input type="text" name="email" id="email"/> <br/><br/>
		
		<label for="nome">Endereço:</label>
		<input type="text" name="endereco" id="endereco"/> <br/><br/>
		
		<label for="nome">Data de Nascimento:</label>
		<caelum:campoData id="dataNascimento"/> <br/><br/>
		
		<input type="submit" value="Salvar"/>
	</form>
	<c:import url="rodape.jsp"/>
</body>
</html>
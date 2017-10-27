<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listagens dos Contatos</title>
</head>
<body>
	
	<c:import url="cabecalho.jsp"/>
	<jsp:useBean id="dao" class="br.com.fj21.dao.ContatoDAO"/>
	
	<table>
		<thead>
			<td>Nome</td>
			<td>E-mail</td>
			<td>Endereço</td>
			<td>Data Nasc.</td>
		</thead>
		<c:forEach var="contato" items="${dao.todos}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'ffffff' : 'aaee88'}">
				<td>${contato.nome}</td>
				
				<td><c:choose>
					<c:when test="${not empty contato.email}">
						<a href="mailto:${contao.email}">${contato.email}</a>
					</c:when>
					<c:otherwise>
						E-mail não encontrado.
					</c:otherwise>
				</c:choose></td>
				
				<td>${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento}" pattern="dd/MM/yyyy"/></td>
			</tr>
		</c:forEach>
		
	</table>	
	<c:import url="rodape.jsp"/>
</body>
</html>
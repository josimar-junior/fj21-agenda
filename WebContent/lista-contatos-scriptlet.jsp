<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, br.com.fj21.dao.*, br.com.fj21.model.*, java.text.SimpleDateFormat"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listagem dos Contatos</title>
</head>
<body>

	<table>
	<%
		ContatoDAO contatoDAO = new ContatoDAO();
		List<Contato> contatos = contatoDAO.getTodos();
		
		for(Contato c : contatos) {
		%>
			<tr>
				<td><%=c.getNome()%><td>
				<td><%=c.getEmail()%><td>
				<td><%=c.getEndereco()%><td>
				<td><%
					String date = new SimpleDateFormat("dd/MM/yyyy").format(c.getDataNascimento());
					
					out.println(date);
					%></td>
			</tr>
		<%
		}
		%>
	</table>

</body>
</html>
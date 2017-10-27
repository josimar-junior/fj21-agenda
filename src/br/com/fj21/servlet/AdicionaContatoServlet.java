package br.com.fj21.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fj21.dao.ContatoDAO;
import br.com.fj21.model.Contato;
import br.com.fj21.util.DataUtil;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {

	private static final long serialVersionUID = 1793742597560613187L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter writer = response.getWriter();
		
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String dataTexto = request.getParameter("dataNascimento");
		Date dataNascimento = DataUtil.getDate(dataTexto);
		
		Contato contato = new Contato(nome, endereco, email, dataNascimento);
		
		new ContatoDAO().salvar(contato);
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Contato " + contato.getNome() + " salvo com sucesso.");
		writer.println("</body>");
		writer.println("<html>");
	}
	
}

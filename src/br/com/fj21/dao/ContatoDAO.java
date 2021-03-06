package br.com.fj21.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fj21.jdbc.ConnectionFactory;
import br.com.fj21.model.Contato;

public class ContatoDAO implements DAO<Contato> {

	@Override
	public void salvar(Contato contato) {
		String sql = "INSERT INTO contatos (nome, endereco, email, data_nascimento) VALUES (?, ?, ?, ?);";

		try (Connection connection = new ConnectionFactory().getConnection()) {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getEndereco());
			ps.setString(3, contato.getEmail());
			ps.setDate(4, new Date(contato.getDataNascimento().getTime()));

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void atualizar(Contato t) {

	}

	@Override
	public void deletar(Contato t) {
		// TODO Auto-generated method stub

	}

	@Override
	public Contato getPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> getTodos() {

		List<Contato> contatos = new ArrayList<>();

		try (Connection connection = new ConnectionFactory().getConnection()) {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM contatos;");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Contato contato = new Contato(rs.getLong("id"), rs.getString("nome"), rs.getString("endereco"),
						rs.getString("email"), rs.getDate("data_nascimento"));

				contatos.add(contato);
			}

			rs.close();
			ps.close();

			return contatos;

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

}

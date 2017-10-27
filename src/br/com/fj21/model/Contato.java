package br.com.fj21.model;

import java.io.Serializable;
import java.util.Date;

public class Contato implements Serializable {

	private static final long serialVersionUID = -2784142125685051029L;

	private Long id;
	private String nome;
	private String endereco;
	private String email;
	private Date dataNascimento;

	public Contato() {
	}

	public Contato(String nome, String endereco, String email, Date dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public Contato(Long id, String nome, String endereco, String email, Date dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

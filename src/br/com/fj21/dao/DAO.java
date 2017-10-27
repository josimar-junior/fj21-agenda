package br.com.fj21.dao;

import java.util.List;

public interface DAO<T> {

	void salvar(T t);

	void atualizar(T t);

	void deletar(T t);

	T getPorId(Long id);
	
	List<T> getTodos();
}

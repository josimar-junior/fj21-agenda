package br.com.fj21.dao;

public interface DAO<T> {

	void salvar(T t);

	void atualizar(T t);

	void deletar(T t);

	T getPorId(Long id);
}

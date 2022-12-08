package br.edu.infnet.matricula.persistencia;

import java.util.List;

public interface IDAO<T> {

	void salvar(T t);
	
	void atualizar(T t);
	
	void deletar(T t);
	
	T retornar(Integer matricula);
	
	List<T> listaTodos();
}

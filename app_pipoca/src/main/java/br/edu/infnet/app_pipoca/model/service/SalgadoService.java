package br.edu.infnet.app_pipoca.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app_pipoca.controller.AppProduto;

import br.edu.infnet.app_pipoca.model.domain.Salgado;


@Service
public class SalgadoService {
	
	private static Map<Integer, Salgado> mapSalgados = new HashMap<Integer, Salgado>();
	private static Integer id = 1;
	
	public void incluir(Salgado salgado) {
		salgado.setId(id++);
		mapSalgados.put(salgado.getId(), salgado);
		AppProduto.relatorio("Produtos: " +  salgado.getNome() + " adicionado ", salgado);
	}
	
	public void excluir(Integer id) {
		mapSalgados.remove(id);
	}
	
	public Collection<Salgado> retornarLista(){
		return mapSalgados.values();
	}
	
}

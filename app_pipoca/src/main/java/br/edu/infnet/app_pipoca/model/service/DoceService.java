package br.edu.infnet.app_pipoca.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.model.domain.Cliente;
import br.edu.infnet.app_pipoca.model.domain.Doce;
import br.edu.infnet.app_pipoca.model.domain.Usuario;

@Service
public class DoceService {
	
	private static Map<Integer, Doce> mapDoce = new HashMap<Integer, Doce>();
	private static Integer id = 1;
	
	public void incluir(Doce doce) {
		doce.setId(id++);
		mapDoce.put(doce.getId(), doce);
	 	AppProduto.relatorio("Produto " + doce.getNome() + " adicionado:", doce);
	}
	 
	public void excluir(Integer id) {
		mapDoce.remove(id);
	}
	
	public Collection<Doce> retornarLista(){
		return mapDoce.values();
	}

}

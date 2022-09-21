package br.edu.infnet.app_pipoca.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.model.domain.Ligth;


@Service
public class LigthService {

	
	private static Map<Integer, Ligth> mapLigth = new HashMap<Integer, Ligth>();
	private  static Integer id = 1;
	

	public void incluir(Ligth ligth) {
		ligth.setId(id++);
		mapLigth.put(ligth.getId(), ligth);
		AppProduto.relatorio("Produto " + ligth.getNome() + " adicionado:", ligth);
	}
	
	public void excluir(Integer id) {
		mapLigth.remove(id);
	}

	public Collection<Ligth> retornarLista(){
		return mapLigth.values();
	}

	
}

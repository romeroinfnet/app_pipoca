package br.edu.infnet.app_pipoca.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.model.domain.Premium;

@Service
public class PremiumService {

	private static Map<Integer, Premium> mapPremium = new HashMap<Integer, Premium>();
	private static Integer id = 1;

	public void incluir(Premium premium) {
		premium.setId(id++);
		mapPremium.put(premium.getId(), premium);
		AppProduto.relatorio("Produto " + premium.getNome() + " adicionado:", premium);
	}
	
	public void excluir(Integer id) {
		mapPremium.remove(id);
	}
	
	public Collection<Premium> retornarLista(){
		return mapPremium.values();
	}
}

package br.edu.infnet.app_pipoca.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.model.domain.Compra;
import br.edu.infnet.app_pipoca.model.domain.Doce;


@Service
public class CompraService {
	
	private static Map<Integer, Compra> mapCompra = new HashMap<Integer, Compra>();
	private static Integer id = 1;
	
	public void incluir(Compra compra) {
		compra.setId(id++);
		mapCompra.put(compra.getId(), compra);
		AppProduto.relatorio("Compra ---> " + compra.getCodigo() + " adicionado:", compra);
	}
	
	public void excluir(Integer id) {
		mapCompra.remove(id);
	}
	
	public Collection<Compra> retornaLista(){
		return mapCompra.values();
	}
	

}

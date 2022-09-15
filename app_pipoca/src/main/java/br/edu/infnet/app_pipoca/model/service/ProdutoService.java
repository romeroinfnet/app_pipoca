package br.edu.infnet.app_pipoca.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.model.domain.Produto;
import br.edu.infnet.app_pipoca.model.domain.Usuario;

@Service
public class ProdutoService {

	private static Map<Integer, Produto> mapProduto = new HashMap<Integer, Produto>();
	private static Integer id = 1;
	
	public static void incluir(Produto produto) {
		produto.setId(id++);
		mapProduto.put(produto.getId(), produto);
	 	AppProduto.relatorio("Produto " + produto.getNome() + " adicionado:", produto);
	}
	
	public static void excluir(Integer id) {
		mapProduto.remove(id);
	}
	
	public static Collection<Produto> retornarLista(){
		return mapProduto.values();
	}
}

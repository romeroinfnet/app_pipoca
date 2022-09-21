package br.edu.infnet.app_pipoca.model.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.model.domain.Produto;


@Service
public class ProdutoService {

	private static Map<Integer, Produto> mapProduto = new HashMap<Integer, Produto>();
	private static Integer id = 1;
	
	@Autowired
	private PremiumService premiumService;

	@Autowired
	private DoceService doceService;
	
	@Autowired
	private SalgadoService salgadoService;
	
	@Autowired
	private LigthService ligthService;
	
	
	public List<Produto> obterLista(){
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.addAll(premiumService.retornarLista());
		produtos.addAll(doceService.retornarLista());
		produtos.addAll(salgadoService.retornarLista());
		produtos.addAll(ligthService.retornarLista());
		
		return produtos;
	}
		
	
	public void incluir(Produto produto) {
		produto.setId(id++);
		mapProduto.put(produto.getId(), produto);
	 	AppProduto.relatorio("Produto " + produto.getNome() + " adicionado:", produto);
	}
	
	public void excluir(Integer id) {
		mapProduto.remove(id);
	}
	
	public Collection<Produto> retornarLista(){
		return mapProduto.values();
	}
}

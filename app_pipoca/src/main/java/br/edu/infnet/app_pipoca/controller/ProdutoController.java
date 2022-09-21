package br.edu.infnet.app_pipoca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.app_pipoca.model.service.ProdutoService;


@Controller
public class ProdutoController {

	/*	private static Map<Integer, Produto> mapProduto = new HashMap<Integer, Produto>();
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
	} */
	
	@Autowired
	private ProdutoService pr;
	
	@GetMapping(value = "/produto/listaProduto")
	public String TelaProduto(Model model) {
		model.addAttribute("listagem", pr.retornarLista());
		return "/produto/listaProduto";
	}
	
	@GetMapping(value = "/produto/{id}/excluir")
	public String exclusaoPremium(@PathVariable Integer id) {
		pr.excluir(id);
		System.out.println("Realizada a exclusão com sucesso!");
		return "redirect:/produto/listaProduto";
	}
}

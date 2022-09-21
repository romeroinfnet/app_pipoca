package br.edu.infnet.app_pipoca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.util.buf.EncodedSolidusHandling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.app_pipoca.model.domain.Compra;
import br.edu.infnet.app_pipoca.model.service.ClienteService;
import br.edu.infnet.app_pipoca.model.service.CompraService;
import br.edu.infnet.app_pipoca.model.service.DoceService;
import br.edu.infnet.app_pipoca.model.service.ProdutoService;

@Controller
public class CompraController {
	
/*	private static Map<Integer, Compra> mapCompra = new HashMap<Integer, Compra>();
	private static Integer id = 1;
	
	public static void incluir(Compra compra) {
		compra.setId(id++);
		mapCompra.put(compra.getId(), compra);
		AppProduto.relatorio("Compra ---> " + compra.getCodigo() + " adicionado:", compra);
	}
	
	public static void excluir(Integer id) {
		mapCompra.remove(id);
	}
	
	public static Collection<Compra> retornaLista(){
		return mapCompra.values();
	}
*/
	@Autowired
	private CompraService cs;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping(value = "/compra/cadastrarCompra")
	public String TelaCadastro(Model model) {
		model.addAttribute("clientes", clienteService.retornarLista());
		model.addAttribute("compras",produtoService.obterLista());
		return "/compra/cadastrarCompra";
	}
	
	@GetMapping(value = "/compra/listaCompra")
	public String TelaCompra(Model model) {
		model.addAttribute("lista",cs.retornaLista());
		return "/compra/listaCompra";
	}
	
	@PostMapping(value = "/compra/incluir")
	public String incluir() {
		//compra.incluir(id);
		
		//AppProduto.relatorio("Compra ---> " + compra.getCodigo() + " adicionado:", compra);
		return "redirect: /compra/";
	}
	
	@GetMapping(value = "/compra/{id}/excluir")
	public String exclusaoCompra(@PathVariable Integer id) {
		cs.excluir(id);
		System.out.println("Realizada a exclusão com sucesso!!");
		return "redirect:/compra/listaCompra";
	}
	
}

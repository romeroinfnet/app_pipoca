package br.edu.infnet.app_pipoca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.app_pipoca.model.domain.Compra;

@Controller
public class CompraController {
	
	private static Map<Integer, Compra> mapCompra = new HashMap<Integer, Compra>();
	private static Integer id = 1;
	
	public static void incluir(Compra compra) {
		compra.setId(id++);
		mapCompra.put(compra.getId(), compra);
		AppProduto.relatorio("Compra ---> " + compra.getCodigo() + " adicionado:", compra);
	}
	
	public static void excluir(Integer id) {
		mapCompra.remove(id);
	}
	
	@GetMapping(value = "/compra/")
	public String TelaCompra(Model model) {
		model.addAttribute("lista",retornaLista());
		return "/compra/listaCompra";
	}
	
	public static Collection<Compra> retornaLista(){
		return mapCompra.values();
	}
	
	
	@GetMapping(value = "/compra/{id}/excluir")
	public String exclusaoCompra(@PathVariable Integer id) {
		excluir(id);
		System.out.println("Realizada a exclusão com sucesso!!");
		return "redirect:/compra/listaCompra";
	}
	
}

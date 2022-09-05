package br.edu.infnet.app_pipoca.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.app_pipoca.model.domain.Doce;

@Controller
public class DoceCotroller {
	
	private static Map<Integer, Doce> mapDoce = new HashMap<Integer, Doce>();
	private static Integer id = 1;
	
	public static void incluir(Doce doce) {
		doce.setId(id++);
		mapDoce.put(doce.getId(), doce);
	 	AppProduto.relatorio("Produto " + doce.getNome() + " adicionado:", doce);
	}
	 	
	public static Collection<Doce> retornarLista(){
		return mapDoce.values();
	}
	
	@GetMapping(value = "/doce/listaDoce")
	public String telaDoce(Model model) {	
		model.addAttribute("listagem", retornarLista());	
		return "/doce/listaDoce";
	}
	
	public static void excluir(Integer id) {
		mapDoce.remove(id);
	}
	
	@GetMapping(value = "/doce/listaDoce/{id}/excluir")
	public String exclusaoDoce(@PathVariable Integer id) {
		excluir(id);
		System.out.println("Realizada a exclusão com suecesso!");
		return "redirect:/doce/listaDoce"; 
	}
}

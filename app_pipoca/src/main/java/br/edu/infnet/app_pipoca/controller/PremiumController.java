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

import br.edu.infnet.app_pipoca.model.domain.Premium;

@Controller
public class PremiumController {
	
	private static Map<Integer, Premium> mapPremium = new HashMap<Integer, Premium>();
	private static Integer id = 1;

	public static void incluir(Premium premium) {
		premium.setId(id++);
		mapPremium.put(premium.getId(), premium);
		AppProduto.relatorio("Produto " + premium.getNome() + " adicionado:", premium);
	}
	
	public static Collection<Premium> retornarLista(){
		return mapPremium.values();
	}
	
	@GetMapping(value ="/premium/listaPremium")
	public String TelaPremium(Model model) {
		model.addAttribute("listagem", retornarLista());
		return "/premium/listaPremium";
	}
	
	public static void excluir(Integer id) {
		mapPremium.remove(id);
	}
	
	@GetMapping(value = "/premium/listaPremium/{id}/excluir")
	public String exclusaoPremium(@PathVariable Integer id) {
		excluir(id);
		System.out.println("Realizada a exclusão com sucesso!");
		return "redirect:/premium/listaPremium";
	}
	
}

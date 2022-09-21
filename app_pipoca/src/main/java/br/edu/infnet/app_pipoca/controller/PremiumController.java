package br.edu.infnet.app_pipoca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.app_pipoca.model.service.PremiumService;

@Controller
public class PremiumController {
	
/*	
	private static Map<Integer, Premium> mapPremium = new HashMap<Integer, Premium>();
	private static Integer id = 1;

	public static void incluir(Premium premium) {
		premium.setId(id++);
		mapPremium.put(premium.getId(), premium);
		AppProduto.relatorio("Produto " + premium.getNome() + " adicionado:", premium);
	}
	
	public static void excluir(Integer id) {
		mapPremium.remove(id);
	}
	
	public static Collection<Premium> retornarLista(){
		return mapPremium.values();
	} */
	
	@Autowired
	private PremiumService premiumService;
	
	@GetMapping(value ="/premium/listaPremium")
	public String TelaPremium(Model model) {
		model.addAttribute("listagem", premiumService.retornarLista());
		return "/premium/listaPremium";
	}
	
	@GetMapping(value = "/premium/{id}/excluir")
	public String exclusaoPremium(@PathVariable Integer id) {
		premiumService.excluir(id);
		System.out.println("Realizada a exclusão com sucesso!");
		return "redirect:/premium/listaPremium";
	}
	
}

package br.edu.infnet.app_pipoca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.app_pipoca.model.service.LigthService;

@Controller
public class LigthController {

/*	private static Map<Integer, Ligth> mapLigth = new HashMap<Integer, Ligth>();
	private  static Integer id = 1;
	

	public static void incluir(Ligth ligth) {
		ligth.setId(id++);
		mapLigth.put(ligth.getId(), ligth);
		AppProduto.relatorio("Produto " + ligth.getNome() + " adicionado:", ligth);
	}
	
	public static void excluir(Integer id) {
		mapLigth.remove(id);
	}

	public static Collection<Ligth> retornarLista(){
		return mapLigth.values();
	}
	*/
	@Autowired
	private LigthService ligthService;
	
	@GetMapping(value = "/ligth/listaLigth")
	public String TelaLigth(Model model) {
		model.addAttribute("listagem", ligthService.retornarLista());
		return "/ligth/listaLigth";
	}
	
	@GetMapping(value = "/ligth/{id}/excluir")
	public String exclusaoLigth(@PathVariable Integer id) {
		ligthService.excluir(id);
		System.out.println("Realizada a exclusão com sucesso!");
		return "redirect:/ligth/listaLigth";
	}
	
}

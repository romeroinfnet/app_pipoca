package br.edu.infnet.app_pipoca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.app_pipoca.model.service.DoceService;

@Controller
public class DoceCotroller {
	
	/*private static Map<Integer, Doce> mapDoce = new HashMap<Integer, Doce>();
	private static Integer id = 1;
	
	public static void incluir(Doce doce) {
		doce.setId(id++);
		mapDoce.put(doce.getId(), doce);
	 	AppProduto.relatorio("Produto " + doce.getNome() + " adicionado:", doce);
	}
	 
	public static void excluir(Integer id) {
		mapDoce.remove(id);
	}
	
	public static Collection<Doce> retornarLista(){
		return mapDoce.values();
	} */
	
	@Autowired
	private DoceService ds;
	
	@GetMapping(value = "/doce/listaDoce")
	public String telaDoce(Model model) {	
		model.addAttribute("listagem", ds.retornarLista());	
		return "/doce/listaDoce";
	}
	
	@GetMapping(value = "/doce/{id}/excluir")
	public String exclusaoDoce(@PathVariable Integer id) {
		ds.excluir(id);
		System.out.println("Realizada a exclusão com suecesso!");
		return "redirect:/doce/listaDoce"; 
	}
}

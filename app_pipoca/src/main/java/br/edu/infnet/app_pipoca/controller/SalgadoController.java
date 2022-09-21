package br.edu.infnet.app_pipoca.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.app_pipoca.model.service.SalgadoService;

@Controller
public class SalgadoController {
/*
	private static Map<Integer, Salgado> mapSalgados = new HashMap<Integer, Salgado>();
	private static Integer id = 1;
	
	public static void incluir(Salgado salgado) {
		salgado.setId(id++);
		mapSalgados.put(salgado.getId(), salgado);
		AppProduto.relatorio("Produtos: " +  salgado.getNome() + " adicionado: ", salgado);
	}
	
	public static void excluir(Integer id) {
		mapSalgados.remove(id);
	}
	
	public static  Collection<Salgado> retornarSalgado(){
		return mapSalgados.values();
	}
	*/
	@Autowired
	private SalgadoService salgadoService;
	
	@GetMapping (value = "/salgado/listaSalgado")
	public String TelaSalgado(Model model) {
		model.addAttribute("listagem",salgadoService.retornarLista());
		return "/salgado/listaSalgado";
	}
	
	@GetMapping(value = "/salgado/{id}/excluir")
	public String exclusaoSalgado(@PathVariable Integer id) {
		salgadoService.excluir(id);
		System.out.println("Realizada a exclusão com sucesso!");
		return "redirect:/salgado/listaSalgado";
	}
}

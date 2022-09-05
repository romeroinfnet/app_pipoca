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

import br.edu.infnet.app_pipoca.model.domain.Salgado;

@Controller
public class SalgadoController {

	private static Map<Integer, Salgado> mapSalgados = new HashMap<Integer, Salgado>();
	private static Integer id = 1;
	
	public static void incluir(Salgado salgado) {
		salgado.setId(id++);
		mapSalgados.put(salgado.getId(), salgado);
		AppProduto.relatorio("Produtos: " +  salgado.getNome() + " adicionado: ", salgado);
	}
	
	public static  Collection<Salgado> retornarSalgado(){
		return mapSalgados.values();
	}
	
	@GetMapping (value = "/salgado/listaSalgado")
	public String TelaSalgado(Model model) {
		model.addAttribute("listagem",retornarSalgado());
		return "/salgado/listaSalgado";
	}
	
	public static void excluir(Integer id) {
		mapSalgados.remove(id);
	}
	
	@GetMapping(value = "/salgado/listaSalgado/{id}/excluir")
	public String exclusaoSalgado(@PathVariable Integer id) {
		excluir(id);
		System.out.println("Realizada a exclusão com sucesso!");
		return "redirect:/salgado/listaSalgado";
	}
}

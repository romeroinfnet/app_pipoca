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

import br.edu.infnet.app_pipoca.model.domain.Cliente;
import br.edu.infnet.app_pipoca.model.domain.Doce;


@Controller
public class ClienteCotroller {
	
	private static Map<Integer, Cliente> mapCliente = new HashMap<Integer, Cliente>();
	private static Integer id = 1;
	
	public static void incluir(Cliente cliente) {
		cliente.setId(id++);
		mapCliente.put(cliente.getId(), cliente);
	 	AppProduto.relatorio("Produto " + cliente.getNome() + " adicionado:", cliente);
	}
	 	
	public static Collection<Cliente> retornarLista(){
		return mapCliente.values();
	}
	
	@GetMapping(value = "/cliente/listaCliente")
	public String telaCliente(Model model) {	
		model.addAttribute("listagem", retornarLista());	
		return "/cliente/listaCliente";
	}
	
	public static void excluir(Integer id) {
		mapCliente.remove(id);
	}
	
	@GetMapping(value = "/cliente/listaCliente/{id}/excluir")
	public String exclusaoDoce(@PathVariable Integer id) {
		excluir(id);
		System.out.println("Realizada a exclusão com suecesso!");
		return "redirect:/cliente/listaCliente"; 
	}
}

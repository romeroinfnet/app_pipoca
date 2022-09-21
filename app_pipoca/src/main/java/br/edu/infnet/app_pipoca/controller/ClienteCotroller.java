package br.edu.infnet.app_pipoca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.app_pipoca.model.service.ClienteService;

@Controller
public class ClienteCotroller {
	
	/*private static Map<Integer, Cliente> mapCliente = new HashMap<Integer, Cliente>();
	private static Integer id = 1;
	
	public static void incluir(Cliente cliente) {
		cliente.setId(id++);
		mapCliente.put(cliente.getId(), cliente);
	 	AppProduto.relatorio("Produto " + cliente.getNome() + " adicionado:", cliente);
	}
	
	public static void excluir(Integer id) {
		mapCliente.remove(id);
	}
	
	public static Collection<Cliente> retornarLista(){
		return mapCliente.values();
	} */
	@Autowired
	private ClienteService cl;
	
	@GetMapping(value = "/cliente/listaCliente")
	public String telaCliente(Model model) {	
		model.addAttribute("listagem", cl.retornarLista());	
		return "/cliente/listaCliente";
	}
	
	@GetMapping(value = "/cliente/{id}/excluir")
	public String exclusaoDoce(@PathVariable Integer id) {
		cl.excluir(id);
		System.out.println("Realizada a exclusão com suecesso!");
		return "redirect:/cliente/listaCliente"; 
	}
}

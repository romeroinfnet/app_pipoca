package br.edu.infnet.app_pipoca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.app_pipoca.model.domain.Usuario;
import br.edu.infnet.app_pipoca.model.service.*;

@Controller
public class UsuarioCotroller {
	
	//private static Map<String, Usuario> mapUsuario = new HashMap<String, Usuario>();

	@Autowired
	private UsuarioService us;
	
	@GetMapping(value = "/cadastro/listaUsuario")
	public String telaUsuario(Model model) {	
		model.addAttribute("listagem", UsuarioService.retornarLista());	
		return "/cadastro/listaUsuario";
	}
	
	@GetMapping(value = "/cadastro/cadastrarUsuario")
	public String telaCadastro() {
		return null;
	}
	
	@PostMapping(value = "/cadastro/incluir")
	public String inclusao(Usuario usuario){
		us.incluir(usuario);
		return "redirect:/";
	}
	
	@GetMapping(value = "/cadastro/{email}/excluir")
	public String exclusaoUsuario(@PathVariable String email) {
		UsuarioService.excluir(email);
		System.out.println("Realizada a exclusão com suecesso!");
		return "redirect:/cadastro/listaUsuario"; 
	}
}
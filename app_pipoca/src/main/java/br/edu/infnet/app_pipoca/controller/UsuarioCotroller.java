package br.edu.infnet.app_pipoca.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.app_pipoca.model.domain.Usuario;


@Controller
public class UsuarioCotroller {
	
	private static Map<String, Usuario> mapUsuario = new HashMap<String, Usuario>();
	
	public static Usuario validar(String email, String senha) {
		Usuario usuario = mapUsuario.get(email);
		
		if(usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;	
		}
		return null;
	}
	
	public static void incluir(Usuario usuario) {
		mapUsuario.put(usuario.getEmail(), usuario);
	 	AppProduto.relatorio("Produto " + usuario.getNome() + " adicionado:", usuario);
	}
	 	
	public static Collection<Usuario> retornarLista(){
		return mapUsuario.values();
	}
	
	@GetMapping(value = "/cadastro/listaUsuario")
	public String telaUsuario(Model model) {	
		model.addAttribute("listagem", retornarLista());	
		return "/cadastro/listaUsuario";
	}
	
	
	@GetMapping(value = "/cadastro")
	public String telaCadastro() {
		return null;
	}
	
	@PostMapping(value = "/cadastro/incluir")
	public String inclusao(Usuario usuario){
		incluir(usuario);
		return "redirect:/";
	}
	
	public static void excluir(String email) {
		mapUsuario.remove(email);
	}
	
	@GetMapping(value = "/cadastro/listaUsuario/{email}/excluir")
	public String exclusaoUsuario(@PathVariable String email) {
		excluir(email);
		System.out.println("Realizada a exclusão com suecesso!");
		return "redirect:/cadastro/listaUsuario"; 
	}
}
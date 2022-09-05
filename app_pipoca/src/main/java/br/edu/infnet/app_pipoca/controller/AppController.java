package br.edu.infnet.app_pipoca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import br.edu.infnet.app_pipoca.model.domain.Usuario;

@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String telaHome() {
		return "/index";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String Login( Model model,@RequestParam String email,@RequestParam String senha) {
		Usuario user = new UsuarioCotroller().validar(email, senha);
		
		//if(email.equalsIgnoreCase(senha)) {
		if(user != null) {
			model.addAttribute("user",user.getNome());
			return "index";
			//return "redirect:/";
		}
		return "login";
		//return "redirect:/login";
	}
	
	@GetMapping(value = "logout")
	public String logout(Model model) {
		model.addAttribute("user", "");
		return "redirect:/";
	}
}

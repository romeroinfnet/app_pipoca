package br.edu.infnet.app_pipoca.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import br.edu.infnet.app_pipoca.model.domain.Usuario;
import br.edu.infnet.app_pipoca.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AppController {
	
	@Autowired
	private UsuarioService us;
	
	@GetMapping(value = "/")
	public String telaHome() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String Login( Model model,@RequestParam String email,@RequestParam String senha) {
		Usuario user = us.validar(email, senha);
		
		//if(email.equalsIgnoreCase(senha)) {
		if(user != null) {
			model.addAttribute("user",user.getNome());
			return "index";
			//return "redirect:/index";
		}
		return "login";
		//return "redirect:/login";
	}
	
	@GetMapping(value = "logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("user");
		return "redirect:/";
	}
}

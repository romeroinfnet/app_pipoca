package br.edu.infnet.app_pipoca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping(value = "/")
	public String telaHome() {
		return "index";
	}
}

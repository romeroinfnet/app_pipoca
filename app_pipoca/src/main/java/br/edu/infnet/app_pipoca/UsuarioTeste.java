package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.controller.ClienteCotroller;
import br.edu.infnet.app_pipoca.controller.UsuarioCotroller;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Cliente;
import br.edu.infnet.app_pipoca.model.domain.Usuario;

@Component
public class UsuarioTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) {
		
		Usuario u = new Usuario();
		u.setEmail("romero@gmail.com");
		u.setNome("Romero");
		u.setSenha("#@Zagallos55");
		AppProduto.relatorio("Inclusão realizada do cliente:", u);
		UsuarioCotroller.incluir(u);
			
		 
	}

}

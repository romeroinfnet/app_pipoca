package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		Cliente cliente1 = new Cliente("Marina","00011122230","marina@marina.com","marina.v");
		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente("Pedro","22233311100","pedro@pedro.com","pedro.c");
		System.out.println(cliente2);
		
	}

}

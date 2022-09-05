package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.controller.ClienteCotroller;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Cliente;

@Component
public class ClienteTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) {
		
		
		Cliente cliente1;
		try {
			cliente1 = new Cliente("Marina","00011122230","marina@marina.com","marina.v");
			AppProduto.relatorio("Inclusão realizada do cliente:", cliente1);
			ClienteCotroller.incluir(cliente1);
			
			cliente1 = new Cliente("Romero","00011122240","romero@romero.com","romero.v");
			AppProduto.relatorio("Inclusão realizada do cliente:", cliente1);
			ClienteCotroller.incluir(cliente1);
		} catch (CpfInvalidoException e) {
			System.out.println("Erro ao incluir cliente!" + e.getMessage());
		}
		
		//Cliente cliente2 = new Cliente("Pedro","22233311100","pedro@pedro.com","pedro.c");
		//System.out.println(cliente2);
		
	}

}

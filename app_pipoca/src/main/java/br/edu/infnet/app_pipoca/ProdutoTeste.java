package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.controller.ProdutoController;
import br.edu.infnet.app_pipoca.model.domain.Premium;
import br.edu.infnet.app_pipoca.model.domain.Produto;
import br.edu.infnet.app_pipoca.model.domain.Salgado;

@Component
public class ProdutoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Produto produto1 = new Premium();
		produto1.setCodigo(110022);
		produto1.setNome("Pipoca doce albino");
		produto1.setValor(20.30);
		ProdutoController.incluir(produto1);		
					
		Produto produto2 = new Salgado();
		produto2.setCodigo(110023);
		produto2.setNome("Pipoca salgada mexicana");
		produto2.setValor(20.30);
		ProdutoController.incluir(produto2);
		
	}

}

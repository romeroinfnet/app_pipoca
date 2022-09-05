package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.controller.PremiumController;
import br.edu.infnet.app_pipoca.model.domain.Premium;


@Component
public class PremiumTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Premium  p1 = new Premium();
		p1.setCodigo(301);
		p1.setNome("Cremution");
		p1.setSabor("Chocolate cremoso");
		p1.setTamanho(1);
		p1.setValor(22.50);
		PremiumController.incluir(p1);
		
		Premium p2 = new Premium();
		p2.setCodigo(303);
		p2.setNome("");
		p2.setSabor("Musse de Limão");
		p2.setTamanho(2);
		p2.setValor(22.50);
		PremiumController.incluir(p2);
		
		AppProduto.relatorio("Produto adicionado:", p1);
		
	}

}

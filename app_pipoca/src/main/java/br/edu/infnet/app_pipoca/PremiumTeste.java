package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.model.domain.Premium;


@Component
public class PremiumTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Premium  p1 = new Premium();
		p1.setSabor("Chocolate cremoso");
		p1.setTamanho(1);
		

		AppProduto.relatorio("Produto adicionado:", p1);
		
	}

}

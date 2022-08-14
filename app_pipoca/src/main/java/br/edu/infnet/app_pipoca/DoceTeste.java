package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.model.domain.Ligth;


@Component
public class DoceTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Ligth l1 = new Ligth();
		l1.setSabor("Chocolate branco");
		l1.setTamanho(500);
		
		AppProduto.relatorio("Produto adicionado:", l1);
		
		System.out.println(l1);
		
	}

}
package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.controller.LigthController;
import br.edu.infnet.app_pipoca.model.domain.Ligth;


@Component
public class LigthTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Ligth l1 = new Ligth();
		l1.setCodigo(409);
		l1.setNome("Choco 80");
		l1.setSabor("Chocolate 80% com menta");
		l1.setTamanho(3);
		l1.setValor(25.00);
		LigthController.incluir(l1);
		
		AppProduto.relatorio("Produto adicionado:", l1);
		//System.out.println(l1);
		
	}

}
package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.model.domain.Salgado;

@Component
public class SalgadoTeste implements ApplicationRunner{


	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Salgado s1 = new Salgado();
		s1.setSabor("Calabresa apimentada");
		s1.setTamanho(200);
		
		//Devido ser STATIC não precisa ser instanciado
		AppProduto.relatorio("Produto adicionado:",s1);
		
		
	}

}

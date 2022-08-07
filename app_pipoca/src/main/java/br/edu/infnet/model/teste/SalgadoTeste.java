package br.edu.infnet.model.teste;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Salgado;

@Component
public class SalgadoTeste implements ApplicationRunner{


	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Salgado s1 = new Salgado();
		s1.setSabor("Calabresa apimentada");
		s1.setTamanho(200);
		
	}

}

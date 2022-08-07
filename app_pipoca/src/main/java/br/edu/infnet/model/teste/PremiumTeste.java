package br.edu.infnet.model.teste;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Premium;


@Component
public class PremiumTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Premium  p1 = new Premium();
		p1.setSabor("Chocolate cremoso");
		p1.setTamanho(300);
		
		System.out.println(p1);
		
	}

}

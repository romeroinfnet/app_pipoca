package br.edu.infnet.model.teste;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Ligth;


@Component
public class DoceTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Ligth l1 = new Ligth();
		l1.setSabor("Chocolate branco");
		l1.setTamanho(500);
		
		System.out.println(l1);
		
	}

}
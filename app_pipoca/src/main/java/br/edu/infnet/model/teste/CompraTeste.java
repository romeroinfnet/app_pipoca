package br.edu.infnet.model.teste;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Compra;


@Component
public class CompraTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Compra compra = new Compra();
		
		compra.setCodigo(991120);
		compra.setData(LocalDateTime.now());
		compra.setDescricao("Compra pipoca salgada promoção");
		
		System.out.println(compra);
	}

}

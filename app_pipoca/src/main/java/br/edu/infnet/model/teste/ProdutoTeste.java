package br.edu.infnet.model.teste;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.model.domain.Produto;


@Component
public class ProdutoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Produto produto1 = new Produto();
		produto1.setCodigo(110022);
		produto1.setNome("Pipoca doce albino");
		produto1.setTipo(1);
		produto1.setValor(20.30);
		
		Produto produto2 = new Produto();
		produto2.setCodigo(110023);
		produto2.setNome("Pipoca salgada mexicana");
		produto2.setTipo(1);
		produto2.setValor(20.30);
		
		Produto produto3 = new Produto();
		produto3.setCodigo(110022);
		produto3.setNome("Pipoca ligth leveza");
		produto3.setTipo(1);
		produto3.setValor(22.00);
		
		Produto produto4 = new Produto();
		produto4.setCodigo(110022);
		produto4.setNome("Pipoca doce cremosinho");
		produto4.setTipo(1);
		produto4.setValor(25.00);
	}

}

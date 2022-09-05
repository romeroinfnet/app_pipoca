package br.edu.infnet.app_pipoca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.app_pipoca.controller.DoceCotroller;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;
import br.edu.infnet.app_pipoca.model.Exception.TamanhoInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Doce;

@Component
public class DoceTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) {
		
		Doce d2;
		d2 = new Doce();
		d2.setCodigo(101);
		d2.setNome("Floresta Negra");
		d2.setSabor("Chocolate negro");
		d2.setTamanho(1);
		d2.setValor(20.00);
		DoceCotroller.incluir(d2);
		
		Doce d3 = new Doce();
		d3.setCodigo(102);
		d3.setNome("La creme");
		d3.setSabor("Chocolate ao leite");
		d3.setTamanho(3);
		d3.setValor(20.00);
		DoceCotroller.incluir(d3);
		
	}

}
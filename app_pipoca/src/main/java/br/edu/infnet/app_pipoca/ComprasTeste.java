package br.edu.infnet.app_pipoca;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.controller.CompraController;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Cliente;
import br.edu.infnet.app_pipoca.model.domain.Compra;
import br.edu.infnet.app_pipoca.model.domain.Doce;
import br.edu.infnet.app_pipoca.model.domain.Premium;
import br.edu.infnet.app_pipoca.model.domain.Produto;


@Component
public class ComprasTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws CpfInvalidoException {	
	
		Cliente cliente = new  Cliente("maria.v","Maria Veloso","00011133321","maria.veloso@gmail.com");
		Compra compra = new Compra(cliente);
		
		List<Produto> listaProduto = new ArrayList<Produto>();
		
		Produto s1 = new Premium();
		s1.setCodigo(001121);
		s1.setId(991122);
		s1.setNome("Super hipertensão");
		s1.setSabor("Pipoca com sal grosso e pimenta");
		s1.setTamanho(2);
		s1.setValor(30.00);
		
		Produto d1 = new Doce();
		
		d1.setCodigo(002231);
		d1.setId(881121);
		d1.setNome("Super diabetes");
		d1.setSabor("Pipoca coberta com 3 camadas de açucar");
		d1.setTamanho(3);
		d1.setValor(25.00);
		
		
		listaProduto.add(s1);
		listaProduto.add(d1);
		
		compra.setId(99012);
		compra.setCodigo("99883312");
		compra.setDescricao("Compra 3");
		compra.setProdutos(listaProduto);
		AppProduto.relatorio("Compras -->>", compra);
		CompraController.incluir(compra);
	}
}

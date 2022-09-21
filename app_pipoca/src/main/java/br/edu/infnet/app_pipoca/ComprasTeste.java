package br.edu.infnet.app_pipoca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.controller.AppProduto;
import br.edu.infnet.app_pipoca.controller.CompraController;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;
import br.edu.infnet.app_pipoca.model.Exception.TamanhoInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Cliente;
import br.edu.infnet.app_pipoca.model.domain.Compra;
import br.edu.infnet.app_pipoca.model.domain.Doce;
import br.edu.infnet.app_pipoca.model.domain.Ligth;
import br.edu.infnet.app_pipoca.model.domain.Premium;
import br.edu.infnet.app_pipoca.model.domain.Produto;
import br.edu.infnet.app_pipoca.model.domain.Salgado;
import br.edu.infnet.app_pipoca.model.service.CompraService;
import br.edu.infnet.app_pipoca.model.service.DoceService;
import br.edu.infnet.app_pipoca.model.service.LigthService;
import br.edu.infnet.app_pipoca.model.service.PremiumService;
import br.edu.infnet.app_pipoca.model.service.ProdutoService;
import br.edu.infnet.app_pipoca.model.service.SalgadoService;

@Component
public class ComprasTeste implements ApplicationRunner{

	@Autowired
	private CompraService compraService = new CompraService();
	
	@Autowired
	private ProdutoService produtoService = new ProdutoService();
	
	@Autowired
	private SalgadoService salgadoService = new SalgadoService();
	
	@Autowired
	private LigthService ligthService = new LigthService();
	
	@Autowired
	private PremiumService premiumService = new PremiumService();
	
	@Autowired
	private DoceService doceService = new DoceService();
	
	@Override
	public void run(ApplicationArguments args) throws CpfInvalidoException {	
	
		Cliente cliente = new  Cliente("maria.v","Maria Veloso","00011133321","maria.veloso@gmail.com");
		
		Premium p1 = new Premium();
		p1.setCodigo(001121);
		p1.setId(991122);
		p1.setNome("Super hipertensão");
		p1.setSabor("Pipoca com sal grosso e pimenta");
		p1.setTamanho(2);
		p1.setValor(30.00);
		
		Doce d1 = new Doce();
		
		d1.setCodigo(002231);
		d1.setId(881121);
		d1.setNome("Super diabetes");
		d1.setSabor("Pipoca coberta com 3 camadas de açucar");
		d1.setTamanho(3);
		d1.setValor(25.00);
		
	/*	Set<Produto> listaProduto = new HashSet<Produto>();
		
		listaProduto.add(d1);
		listaProduto.add(p1);
		
		Compra compra = new Compra(cliente);
		
		compra.setId(99012);
		compra.setCodigo("99883312");
		compra.setDescricao("Compra 3");
		compra.setProdutos(listaProduto);
		AppProduto.relatorio("Compras -->>", compra);
		CompraController.incluir(compra);
	*/	
		File dir = new File("C:/dev/");
		File arq = new File(dir, "produto.txt");
		
		try {
			
			try {
				FileReader fileReader = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				Set<Produto> produtos = null;
				List<Compra> compras = new ArrayList<Compra>();
				
				String linha = leitura.readLine();
				while (linha != null) {
			
					String[] campos = linha.split(";"); 
					
					switch (campos[0].toUpperCase()) {
					case "COMPRA":
		
						produtos = new HashSet<Produto>();
						
						produtos.add(d1);
						produtos.add(p1);
						
						Cliente cliente1 = new  Cliente(campos[0],campos[1],campos[2],campos[3]);
						
						Compra compra = new Compra(cliente1, produtos);
				
						compra.setId(Integer.parseInt(campos[4]));
						compra.setCodigo(campos[5]);
						compra.setDescricao(campos[6]);
						compras.add(compra);
						
						AppProduto.relatorio("Compras -->>", compra);
						compraService.incluir(compra);
						
						break;

					case "SALGADO":
						
						Salgado salgado = new Salgado();
						salgado.setSabor(campos[0]);
						
						if("SALGADO".equalsIgnoreCase(campos[0])) {
							salgado.setCodigo(Integer.parseInt(campos[1]));
							salgado.setNome(campos[2]);
							salgado.setTamanho(Integer.parseInt(campos[3]));
							salgado.setValor(Double.parseDouble(campos[4]));
							salgadoService.incluir(salgado);
							produtos.add(salgado);
							
							System.out.println(linha);
							linha = leitura.readLine();
							System.out.println(leitura.readLine());
						}
						
						break;

					case "PREMIUM":
						
						Premium premium = new Premium();
						premium.setSabor(campos[0]);
						
						if("PREMIUM".equalsIgnoreCase(campos[0])) {
						premium.setCodigo(Integer.parseInt(campos[1]));
						premium.setNome(campos[2]);
						premium.setTamanho(Integer.parseInt(campos[3]));
						premium.setValor(Double.parseDouble(campos[4]));
						premiumService.incluir(premium);
						
						System.out.println(linha);
						linha = leitura.readLine();
						System.out.println(leitura.readLine());
						}
						
						break;

					case "LIGTH":
						
						Ligth ligth = new Ligth();
						ligth.setSabor(campos[0]);
						
						if("LIGTH".equalsIgnoreCase(campos[0])) {
						ligth.setCodigo(Integer.parseInt(campos[1]));
						ligth.setNome(campos[2]);
						ligth.setTamanho(Integer.parseInt(campos[3]));
						ligth.setValor(Double.parseDouble(campos[4]));
						ligthService.incluir(ligth);
						produtos.add(ligth);
						
						System.out.println(linha);
						linha = leitura.readLine();
						System.out.println(leitura.readLine());
						}
						
						break;

					case "DOCE":
						
						Doce dc = new Doce();
						dc.setSabor(campos[0]);
						
						if("DOCE".equalsIgnoreCase(campos[0])) {	
							dc.setCodigo(Integer.parseInt(campos[1]));
							dc.setNome(campos[2]);
							dc.setTamanho(Integer.parseInt(campos[3]));
							dc.setValor(Double.parseDouble(campos[4]));
							doceService.incluir(dc);
							produtos.add(dc);
							
							System.out.println(linha);
							linha = leitura.readLine();
							System.out.println(leitura.readLine());
						}
						break;

					default:
						break;
					}	
					linha = leitura.readLine();
				}
				for(Compra c : compras) {
					System.out.println("------>> "+ c.getId());
					System.out.println("------>> "+ c.getCodigo());
					System.out.println("------>> "+ c.getProdutos().size());
					compraService.incluir(c);
				}
				
			}catch (FileNotFoundException e) {
					System.out.println("##>>>>[ERRO]<<<<## O arquivo não existe.");
			}catch (IOException e) {
				System.out.println("##>>>>[ERRO]<<<<## Problemas na leitura do arquivo.");
			}			
		} finally {
			System.out.println("Terminuo.");
		}
	}
}
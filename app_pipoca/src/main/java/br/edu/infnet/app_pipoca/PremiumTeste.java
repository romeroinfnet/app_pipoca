package br.edu.infnet.app_pipoca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.app_pipoca.controller.AppProduto;

import br.edu.infnet.app_pipoca.model.domain.Premium;
import br.edu.infnet.app_pipoca.model.service.PremiumService;

@Component
public class PremiumTeste implements ApplicationRunner {

	@Autowired
	private PremiumService premiumService = new PremiumService();
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Premium  p1 = new Premium();
		p1.setCodigo(301);
		p1.setNome("Cremution");
		p1.setSabor("Chocolate cremoso");
		p1.setTamanho(1);
		p1.setValor(22.50);
		premiumService.incluir(p1);
		
		Premium p2 = new Premium();
		p2.setCodigo(303);
		p2.setNome("");
		p2.setSabor("Musse de Limão");
		p2.setTamanho(2);
		p2.setValor(22.50);
		premiumService.incluir(p2);
		
		AppProduto.relatorio("Produto adicionado:", p1);
		
		File dir = new File("C:/dev/");
		File arq = new File(dir, "produtos.txt");
		
		try {
			
			try {
				FileReader fileReader = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
			
					String[] campos = linha.split(";"); 
					
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
					}
				}	
				System.out.println(leitura.readLine());
				
				leitura.close();
				fileReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("##>>>>[ERRO]<<<<## O arquivo não existe.");
			} catch (IOException e) {
				System.out.println("##>>>>[ERRO]<<<<## Problemas na leitura do arquivo.");
			}			
		} finally {
			System.out.println("Terminuo.");
		}	 
	}
}

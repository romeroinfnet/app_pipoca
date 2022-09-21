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
import br.edu.infnet.app_pipoca.model.domain.Ligth;
import br.edu.infnet.app_pipoca.model.service.LigthService;


@Component
public class LigthTeste implements ApplicationRunner{
	
	@Autowired
	private LigthService ligthService = new LigthService();

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Ligth l1 = new Ligth();
		l1.setCodigo(409);
		l1.setNome("Choco 80");
		l1.setSabor("Chocolate 80% com menta");
		l1.setTamanho(3);
		l1.setValor(25.00);
		ligthService.incluir(l1);
		
		AppProduto.relatorio("Produto adicionado:", l1);
		
		File dir = new File("C:/dev/");
		File arq = new File(dir, "produtos.txt");
		
		try {
			
			try {
				FileReader fileReader = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
			
					String[] campos = linha.split(";"); 
					
					Ligth ligth = new Ligth();
					ligth.setSabor(campos[0]);
					
					if("LIGTH".equalsIgnoreCase(campos[0])) {
					ligth.setCodigo(Integer.parseInt(campos[1]));
					ligth.setNome(campos[2]);
					ligth.setTamanho(Integer.parseInt(campos[3]));
					ligth.setValor(Double.parseDouble(campos[4]));
					ligthService.incluir(ligth);
					
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
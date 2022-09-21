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

import br.edu.infnet.app_pipoca.model.domain.Salgado;
import br.edu.infnet.app_pipoca.model.service.SalgadoService;

@Component
public class SalgadoTeste implements ApplicationRunner{

	@Autowired
	private SalgadoService salgadoService = new SalgadoService();
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Salgado s1 = new Salgado();
		s1.setCodigo(200);
		s1.setNome("Mexicana");
		s1.setSabor("Calabresa apimentada");
		s1.setTamanho(1);
		s1.setValor(20.00);
		salgadoService.incluir(s1);
		
		//Devido ser STATIC não precisa ser instanciado
		AppProduto.relatorio("Produto adicionado:",s1);
		
		File dir = new File("C:/dev/");
		File arq = new File(dir, "produtos.txt");
		
		try {
			
			try {
				FileReader fileReader = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				
				while (linha != null) {
			
					String[] campos = linha.split(";"); 		
					
					Salgado salgado = new Salgado();
					salgado.setSabor(campos[0]);
					
					if("SALGADO".equalsIgnoreCase(campos[0])) {
						salgado.setCodigo(Integer.parseInt(campos[1]));
						salgado.setNome(campos[2]);
						salgado.setTamanho(Integer.parseInt(campos[3]));
						salgado.setValor(Double.parseDouble(campos[4]));
						salgadoService.incluir(salgado);
						
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

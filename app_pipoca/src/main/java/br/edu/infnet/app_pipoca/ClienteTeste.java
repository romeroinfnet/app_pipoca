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
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Cliente;
import br.edu.infnet.app_pipoca.model.service.ClienteService;

@Component
public class ClienteTeste implements ApplicationRunner{

	@Autowired
	private ClienteService cls = new ClienteService();
	
	@Override
	public void run(ApplicationArguments args) {
		
		
		Cliente cliente1;
		try {
			cliente1 = new Cliente("Marina","00011122230","marina@marina.com","marina.v");
			AppProduto.relatorio("Inclusão realizada do cliente:", cliente1);
			cls.incluir(cliente1);
			
			cliente1 = new Cliente("Romero","00011122240","romero@romero.com","romero.v");
			AppProduto.relatorio("Inclusão realizada do cliente:", cliente1);
			cls.incluir(cliente1);
			
			
			File dir = new File("C:/dev/");
			File arq = new File(dir, "cliente.txt");
			
			try {
				
				try {
					FileReader fileReader = new FileReader(arq);
					BufferedReader leitura = new BufferedReader(fileReader);
					
					String linha = leitura.readLine();
					while (linha != null) {
				
						String[] campos = linha.split(";"); 
						
						Cliente cl = new Cliente(campos[0], campos[1], campos[2], campos[3]);
						cls.incluir(cl);
						
						System.out.println(linha);
						linha = leitura.readLine();
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
				
		} catch (CpfInvalidoException e) {
			System.out.println("Erro ao incluir cliente!" + e.getMessage());
		}
	} 
		
}

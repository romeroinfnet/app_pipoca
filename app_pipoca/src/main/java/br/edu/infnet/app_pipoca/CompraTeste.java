package br.edu.infnet.app_pipoca;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


/*
@Component
public class CompraTeste implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	List<Produto> listaProduto = new ArrayList<Produto>();
		
		String dir = "c:/dev/";
		//String dir = "C:/Users/romer/Documents/BOLETOS_PÓS_2022/script/";
		String arq = "compra.txt";
		
		try {
			
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
			
					String[] campos = linha.split(" ");
					
					Cliente cliente = new Cliente(campos[2],campos[3],campos[4],campos[5]);
					
					Cliente cliente2 = new Cliente("r.veloso","Veloso", "01011122233","veloso@gmail.com");
					
					Salgado s1 = new Salgado();
					s1.setCodigo(110022);
					s1.setNome("Pipoca mexicana");
					s1.setTamanho(2);
					s1.setValor(20.50);
					
					Produto l1 = new Ligth();
					l1.setCodigo(110023);
					l1.setNome("Choco Zero");
					l1.setTamanho(1);
					l1.setValor(23.50);
					
					Produto d1 = new Doce();
					d1.setCodigo(110023);
					d1.setNome("Choco Negro");
					d1.setTamanho(3);
					d1.setValor(23.50);
					
					listaProduto.add(s1);
					listaProduto.add(l1);
					listaProduto.add(d1);
					
					Compra compra = new Compra(cliente);
					compra.setCodigo(campos[0]);
					compra.setDescricao(campos[1]);
					compra.setProdutos(listaProduto);
					AppProduto.relatorio("Relatório compras: ", compra);
					CompraController.incluir(compra);
					
					Compra compra2 = new Compra(cliente2);
					compra.setCodigo("000213");
					compra.setDescricao("Compra 2");
					compra.setProdutos(listaProduto);
					AppProduto.relatorio("Relatório de compras: ", compra2);
					CompraController.incluir(compra2);
					
					
					System.out.println(linha);
					linha = leitura.readLine();
				}
				System.out.println(leitura.readLine());
				
				leitura.close();
				fileReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("[ERRO] O arquivo não existe.");
			} catch (IOException e) {
				System.out.println("[ERRO] Problemas na leitura do arquivo.");
			}			
		} finally {
			System.out.println("Terminuo.");
		}
	} 
 
} */
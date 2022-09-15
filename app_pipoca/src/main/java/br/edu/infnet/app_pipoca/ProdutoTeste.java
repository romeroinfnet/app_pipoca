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

import br.edu.infnet.app_pipoca.controller.ProdutoController;
import br.edu.infnet.app_pipoca.model.Exception.TamanhoInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Premium;
import br.edu.infnet.app_pipoca.model.domain.Produto;
import br.edu.infnet.app_pipoca.model.domain.Salgado;
import br.edu.infnet.app_pipoca.model.domain.Usuario;
import br.edu.infnet.app_pipoca.model.service.ProdutoService;
import br.edu.infnet.app_pipoca.model.service.UsuarioService;

@Component
public class ProdutoTeste implements ApplicationRunner{

	@Autowired
	private ProdutoService pr = new ProdutoService();
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Produto produto1 = new Premium();
		produto1.setCodigo(110022);
		produto1.setNome("Pipoca doce albino");
		produto1.setValor(20.30);
		pr.incluir(produto1);		
					
		Produto produto2 = new Salgado();
		produto2.setCodigo(110023);
		produto2.setNome("Pipoca salgada mexicana");
		produto2.setValor(20.30);
		pr.incluir(produto2);
	
	//String dir = "C:/Users/romer/Documents/BOLETOS_PÓS_2022/script"; 	
		//	String arq = "Usuarios.txt";
	
	File dir = new File("C:/dev/");
	File arq = new File(dir, "produto.txt");
	
	try {
		
		try {
			FileReader fileReader = new FileReader(arq);
			BufferedReader leitura = new BufferedReader(fileReader);
			
			String linha = leitura.readLine();
			while (linha != null) {
		
				String[] campos = linha.split(";"); 
				
				Produto produto = new Produto() {
					
					@Override
					public double calcularValor() throws TamanhoInvalidoException {
						// TODO Auto-generated method stub
						return 0;
					}
				};
				produto.setCodigo(110023);
				produto.setNome("Pipoca salgada mexicana");
				produto.setValor(20.30);
				pr.incluir(produto);
				
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

	}
}
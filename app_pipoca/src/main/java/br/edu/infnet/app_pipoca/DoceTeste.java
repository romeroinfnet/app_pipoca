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
import br.edu.infnet.app_pipoca.controller.DoceCotroller;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;
import br.edu.infnet.app_pipoca.model.Exception.TamanhoInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Doce;
import br.edu.infnet.app_pipoca.model.domain.Usuario;
import br.edu.infnet.app_pipoca.model.service.DoceService;
import br.edu.infnet.app_pipoca.model.service.UsuarioService;

@Component
public class DoceTeste implements ApplicationRunner{


	@Autowired
	private DoceService dcs = new DoceService();
	
	@Override
	public void run(ApplicationArguments args) {
		
		Doce d2;
		d2 = new Doce();
		d2.setCodigo(101);
		d2.setNome("Floresta Negra");
		d2.setSabor("Chocolate negro");
		d2.setTamanho(1);
		d2.setValor(20.00);
		dcs.incluir(d2);
		
		Doce d3 = new Doce();
		d3.setCodigo(102);
		d3.setNome("La creme");
		d3.setSabor("Chocolate ao leite");
		d3.setTamanho(3);
		d3.setValor(20.00);
		dcs.incluir(d3);
		
		File dir = new File("C:/dev/");
		File arq = new File(dir, "Usuarios.txt");
		
		try {
			
			try {
				FileReader fileReader = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
			
					String[] campos = linha.split(";"); 
					
					Doce dc = new Doce();
					//dc.setCodigo(campos[0]);
					dc.setNome(campos[1]);
					//dc.setSabor(campos[2]);
					//dc.setTamanho(campos[3]);
					//dc.setValor(campos[4]);
					//usuario.incluir(u);
					
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

}
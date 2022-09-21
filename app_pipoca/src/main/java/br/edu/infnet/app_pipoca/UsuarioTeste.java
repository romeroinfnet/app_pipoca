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


import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;
import br.edu.infnet.app_pipoca.model.domain.Usuario;
import br.edu.infnet.app_pipoca.model.service.UsuarioService;

@Component
public class UsuarioTeste implements ApplicationRunner{
	
	@Autowired
	private UsuarioService usuario = new UsuarioService();

	@Override
	public void run(ApplicationArguments args) throws CpfInvalidoException, IOException {

		Usuario us = new Usuario();
		us.setEmail("adm@gmail.com");
		us.setNome("adm");
		us.setSenha("123");
		usuario.incluir(us); 
		
		//String dir = "C:/Users/romer/Documents/BOLETOS_PÓS_2022/script"; 	
		//String arq = "Usuarios.txt";
		//String arq = Files.readString(Paths.get("C:/Users/romer/Documents/BOLETOS_PÓS_2022/script/usuario.txt"), StandardCharsets.UTF_8);

		File dir = new File("C:/dev/");
		File arq = new File(dir, "usuarios.txt");
		
		try {
			
			try {
				FileReader fileReader = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
			
					String[] campos = linha.split(";"); 
					
					Usuario u = new Usuario();
					u.setEmail(campos[0]);
					u.setNome(campos[1]);
					u.setSenha(campos[2]);
					usuario.incluir(u);
					
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

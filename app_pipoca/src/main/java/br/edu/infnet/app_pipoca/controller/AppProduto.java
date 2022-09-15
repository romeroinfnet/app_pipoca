package br.edu.infnet.app_pipoca.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;

public class AppProduto {
	
	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		printer.impressao();
	}
	
	public static void main(String[] args) {
		String dir = "C:/dev/";
		String arq = "";
		
		try {
			try {
				FileReader fileReader = new FileReader(dir);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
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
}



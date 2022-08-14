package br.edu.infnet.app_pipoca;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;

public class AppProduto {
	
	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		printer.impressao();
	}
}

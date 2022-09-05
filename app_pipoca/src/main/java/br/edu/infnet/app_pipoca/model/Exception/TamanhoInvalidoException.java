package br.edu.infnet.app_pipoca.model.Exception;

public class TamanhoInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TamanhoInvalidoException(String mensagem) {
		super(mensagem);
	}
}

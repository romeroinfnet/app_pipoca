package br.edu.infnet.app_pipoca.model.Exception;

public class CpfInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CpfInvalidoException(String mensagem) {
		super(mensagem);
	}

}

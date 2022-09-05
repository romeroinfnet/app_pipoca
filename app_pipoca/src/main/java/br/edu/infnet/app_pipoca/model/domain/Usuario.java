package br.edu.infnet.app_pipoca.model.domain;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;

public class Usuario implements IPrinter{

	private String nome;
	private String email;
	private String senha;
	
	
	@Override
	public void impressao() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return nome + " " + email + " " + senha;  
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}

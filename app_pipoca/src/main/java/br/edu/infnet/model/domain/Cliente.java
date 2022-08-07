package br.edu.infnet.model.domain;

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private String usuario;
	
	public Cliente( String usuario, String nome, String cpf, String  email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return usuario + " " + nome + " " + cpf + " " + email;  
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}

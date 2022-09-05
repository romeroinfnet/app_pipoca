package br.edu.infnet.app_pipoca.model.domain;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;

public class Cliente implements IPrinter{

	private String nome;
	private String cpf;
	private String email;
	private String usuario;
	private Integer id;
	
	public Cliente( String usuario, String nome, String cpf, String  email) throws CpfInvalidoException {
		
		if(cpf == null) {
			throw new CpfInvalidoException("Não é possível aceitar o CPF nulo.");
		}
		
		if(cpf.isEmpty()){
			throw new CpfInvalidoException("O CPF deve ser informado.");
		}
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.usuario = usuario;
	}
	
	@Override
	public void impressao() {
		// TODO Auto-generated method stub
		
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

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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

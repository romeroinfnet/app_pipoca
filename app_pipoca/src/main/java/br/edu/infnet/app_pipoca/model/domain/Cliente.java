package br.edu.infnet.app_pipoca.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;
import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;


@Entity
@Table(name = "TCliente")
public class Cliente implements IPrinter{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private String usuario;

	public Cliente() {
	
	}
	
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
		return "Usuário: " + usuario + " Nome: " + nome + " CPF: " + cpf + " E-mail: " + email;  
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

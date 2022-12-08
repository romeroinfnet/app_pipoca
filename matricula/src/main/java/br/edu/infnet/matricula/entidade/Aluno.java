package br.edu.infnet.matricula.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Integer matricula;
	
	private String CPF;
	
	private String endereço;
	
	private String nome;

	
	public Aluno() {
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		matricula = matricula;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

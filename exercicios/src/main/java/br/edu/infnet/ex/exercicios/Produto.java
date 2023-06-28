package br.edu.infnet.ex.exercicios;

import java.math.BigDecimal;
import java.nio.file.Path;

public class Produto {

	String nome;
	BigDecimal preco;
	
	public Produto(String nome, double preco) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}

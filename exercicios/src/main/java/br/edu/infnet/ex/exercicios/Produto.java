package br.edu.infnet.ex.exercicios;

import java.math.BigDecimal;
import java.nio.file.Path;

public class Produto {

	String nome;
	Path file;
	BigDecimal preco;
	
	public Produto(String string, Path of, BigDecimal valueOf) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Path getfile() {
		return file;
	}

	public void setFile(Path file) {
		this.file = file;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}

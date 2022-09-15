package br.edu.infnet.app_pipoca.model.domain;

import java.util.Objects;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;
import br.edu.infnet.app_pipoca.model.Exception.TamanhoInvalidoException;

public abstract class Produto implements IPrinter{

	private String nome;
	private int tamanho;
	private double valor;
	private int codigo;
	private Integer id;
	private String sabor;
	
	public abstract double calcularValor() throws TamanhoInvalidoException;
	
	@Override
	public void impressao() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString(){
		return nome + " " + tamanho + " " + valor + " " + codigo;  
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private int retornaTamanho(int tamanho) {
		if(tamanho == 1) {
			tamanho = 100;
		}else 
			if(tamanho == 2) {
			tamanho = 300;
		}else 
			if(tamanho == 3) {
			tamanho = 500;			
		  	}
		return tamanho;
	}
	
	public int getTamanho() {
		return retornaTamanho(tamanho);
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;	
	}
}
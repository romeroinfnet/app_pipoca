package br.edu.infnet.app_pipoca.model.domain;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;

public abstract class Produto implements IPrinter {

	private String nome;
	private int tipo;
	private double valor;
	private int codigo;
	private int tamanho;
	
	public abstract void impressao(); 
	
	public abstract double calcularValor();
	
	@Override
	public String toString() {
		return nome + " " + tipo + " " + valor + " " + codigo + " " + calcularValor();  
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTipo() {
		if(tipo == 1) {
			new Doce();
		}else if(tipo == 2){
			new Salgado();
		}else if(tipo == 3) {
			new Premium();
		}else if (tipo == 4) {
			new Ligth();
		}
		
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
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
	
	public int getTamanho() {
		if(tamanho == 1) {
			tamanho = 200;
		}else if(tamanho == 2) {
			tamanho = 300;
		}else if(tamanho == 3) {
			tamanho = 500;
		}
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public double CalcularValorComImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

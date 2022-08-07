package br.edu.infnet.model.domain;

public class Ligth {

	private String sabor;
	private int tamanho;
	
	
	@Override
	public String toString() {
		return sabor + " " + tamanho;  
	}
	
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}

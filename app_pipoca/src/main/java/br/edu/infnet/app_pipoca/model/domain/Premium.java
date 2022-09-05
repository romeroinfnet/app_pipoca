package br.edu.infnet.app_pipoca.model.domain;

import br.edu.infnet.app_pipoca.model.Exception.CpfInvalidoException;

public class Premium extends Produto{

	private String sabor;
	
	@Override
	public double calcularValor(){
		
		double valorPromocao = 0;
		if(getTamanho() == 1) {
			valorPromocao = getValor() * 0.05;
		}else if (getTamanho() == 2) {
			valorPromocao = getValor() * 0.10;
		}else if (getTamanho() == 3) {
			valorPromocao = getValor() * 0.15;
		}
		return getValor() - valorPromocao;
	}
	
	
	@Override
	public String toString() {
		
		return "Nome: " + getNome() + " || Sabor: " + getSabor() + " || " + getTamanho() + "g ||  Valor com desconto: " + calcularValor();  
	}
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	@Override
	public void impressao() {
		System.out.println(this.toString());
		
	}
	 
}

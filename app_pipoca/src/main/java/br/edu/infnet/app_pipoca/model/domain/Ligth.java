package br.edu.infnet.app_pipoca.model.domain;

public class Ligth extends Produto{

	private String sabor;	
	
	@Override
	public double calcularValor() {
		double valorPromocao = 0;
		if(getTamanho() == 1) {
			valorPromocao = getValor() * 0.15;
		}else if(getTamanho() == 2) {
			valorPromocao = getValor() * 0.25;
		}else if(getTamanho() == 3) {
			valorPromocao = getValor() * 0.35;
		}
		return getValor() - valorPromocao;
	}
	
	@Override
	public String toString() {
		return sabor + " " + getTamanho();  
	}
	
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	@Override
	public void impressao() {
		// TODO Auto-generated method stub
		
	}
	
}

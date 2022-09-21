package br.edu.infnet.app_pipoca.model.domain;

public class Doce extends Produto{
	
	private String sabor;
	
	@Override
	public double calcularValor() {
		
		double valorPromocao = 0;
		
			if(getTamanho() == 1) {
				valorPromocao = getValor() * 0.10;
			}else if (getTamanho() == 2) {
				valorPromocao = getValor() * 0.20;
			}else if (getTamanho() == 3) {
				valorPromocao = getValor() * 0.30;
			}
			 
		return getValor() - valorPromocao;
	}	
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " || Sabor: " + getSabor() + " || " + getTamanho() + "g ||  Valor com desconto: " + calcularValor();
	}

	@Override
	public void impressao() {
		// TODO Auto-generated method stub	
	}
	
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}			
	
	
}

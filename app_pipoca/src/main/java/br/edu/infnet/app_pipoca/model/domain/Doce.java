package br.edu.infnet.app_pipoca.model.domain;

import br.edu.infnet.app_pipoca.model.Exception.TamanhoInvalidoException;

public class Doce extends Produto{
	
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
	
}

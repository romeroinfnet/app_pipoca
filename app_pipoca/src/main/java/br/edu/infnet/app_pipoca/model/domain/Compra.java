package br.edu.infnet.app_pipoca.model.domain;

import java.time.LocalDateTime;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;

public class Compra implements IPrinter{

	private String descricao;
	private LocalDateTime data;
	private int codigo;
	
	@Override
	public void impressao() {
		// TODO Auto-generated method stub	
	}
	
	@Override
	public String toString() {
		return descricao + " " + data + " " + codigo;  
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}

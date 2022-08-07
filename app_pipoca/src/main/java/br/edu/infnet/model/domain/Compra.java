package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Compra {

	private String descricao;
	private LocalDateTime data;
	private int codigo;
	
	
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

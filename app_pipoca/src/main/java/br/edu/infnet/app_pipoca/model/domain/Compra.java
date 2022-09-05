package br.edu.infnet.app_pipoca.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import br.edu.infnet.app_pipoca.interfaces.IPrinter;

public class Compra implements IPrinter{

	private String descricao;
	private String codigo;
	private Cliente cliente;
	private LocalDateTime data;
	private List<Produto> produtos;
	private Integer id;
	

	public Compra(Cliente cliente) {
		this.data = LocalDateTime.now();
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return " Cliente: "+ cliente + " Data: " + data + " Descrição: " + descricao + " Código do Produto:  " + codigo + " Lista de produtos: " + produtos;  
	}
	
	@Override
	public void impressao() {
		System.out.println(" ");
		System.out.println("############# PEPIDO ###############");
		System.out.println(this.toString());
		System.out.println(" ");
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}

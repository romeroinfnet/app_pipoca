package br.edu.infnet.ex.exercicios;

import java.math.BigDecimal;
import java.util.*;

public class Pagamento {

	List<Produto> produtos;
	Date dataCompra;
	Cliente cliente;
	
	public Pagamento(List<Produto> produtos2, Date date, Cliente cliente1) {
		// TODO Auto-generated constructor stub
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public BigDecimal calcularValorTotal() {
		// TODO Auto-generated method stub
		return null;
	}
}

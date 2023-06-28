package br.edu.infnet.ex.exercicios;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Assinatura {
	  private BigDecimal mensalidade;
	    private LocalDate dataFinal;
		private LocalDate dataInicial;

	    public Assinatura(BigDecimal mensalidade, LocalDate dataInicial) {
	        this.mensalidade = mensalidade;
	        this.dataInicial = dataInicial;
	    }

	    public Assinatura(BigDecimal mensalidade, LocalDate dataInicial, LocalDate dataFinal) {
	        this.mensalidade = mensalidade;
	        this.dataInicial = dataInicial;
	        this.dataFinal = dataFinal;
	    }

	    public BigDecimal getMensalidade() {
	        return mensalidade;
	    }

	    public void setMensalidade(BigDecimal mensalidade) {
	        this.mensalidade = mensalidade;
	    }

	    public LocalDate getDataInicial() {
	        return dataInicial;
	    }

	    public void setDataInicial(LocalDate dataInicial) {
	        this.dataInicial = dataInicial;
	    }

	    public LocalDate getDataFinal() {
	        return dataFinal;
	    }

	    public void setDataFinal(LocalDate dataFinal) {
	        this.dataFinal = dataFinal;
	    }

	    public boolean Encerrada() {
	        return dataFinal != null;
	    }
	    
}
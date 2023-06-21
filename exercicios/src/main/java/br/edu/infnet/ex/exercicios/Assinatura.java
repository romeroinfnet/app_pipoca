package br.edu.infnet.ex.exercicios;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Assinatura {
	  private BigDecimal mensalidade;
	    private LocalDate begin;
	    private LocalDate end;

	    public Assinatura(BigDecimal mensalidade, LocalDate begin) {
	        this.mensalidade = mensalidade;
	        this.begin = begin;
	    }

	    public Assinatura(BigDecimal mensalidade, LocalDate begin, LocalDate end) {
	        this.mensalidade = mensalidade;
	        this.begin = begin;
	        this.end = end;
	    }

	    public BigDecimal getMensalidade() {
	        return mensalidade;
	    }

	    public void setMensalidade(BigDecimal mensalidade) {
	        this.mensalidade = mensalidade;
	    }

	    public LocalDate getBegin() {
	        return begin;
	    }

	    public void setBegin(LocalDate begin) {
	        this.begin = begin;
	    }

	    public LocalDate getEnd() {
	        return end;
	    }

	    public void setEnd(LocalDate end) {
	        this.end = end;
	    }

	    public boolean isEncerrada() {
	        return end != null;
	    }
	    
}
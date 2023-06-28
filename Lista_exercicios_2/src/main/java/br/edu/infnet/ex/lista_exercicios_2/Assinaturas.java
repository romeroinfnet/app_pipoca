package br.edu.infnet.ex.lista_exercicios_2;

import java.time.LocalDate;

public class Assinaturas {
    private String tipoDeAssinatura;
    private LocalDate data;
    private boolean atrasoPagamento;

    public String getTipoDeAssinatura() {
        return tipoDeAssinatura;
    }

    public void setTipoDeAssinatura(String tipoDeAssinatura) {
        this.tipoDeAssinatura = tipoDeAssinatura;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean getAtrasoPagamento() {
        return atrasoPagamento;
    }

    public void setAtrasoPagamento(boolean atrasoPagamento) {
        this.atrasoPagamento = atrasoPagamento;
    }

    public LocalDate getDataFim() {
        LocalDate dataFim = data;
        switch (tipoDeAssinatura) {
            case "ANUAL":
                dataFim = dataFim.plusYears(1);
                break;
            case "SEMESTRAL":
                dataFim = dataFim.plusMonths(6);
                break;
            case "TRIMESTRAL":
                dataFim = dataFim.plusMonths(3);
                break;
        }
        return dataFim;
    }
}
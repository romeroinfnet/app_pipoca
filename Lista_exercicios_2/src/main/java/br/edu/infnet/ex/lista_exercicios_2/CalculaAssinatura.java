package br.edu.infnet.ex.lista_exercicios_2;

import java.time.LocalDate;

public class CalculaAssinatura {
	

	Assinaturas assinatura = new Assinaturas();
	
    double calcularTaxa(String tipo) {
        double taxa = 0.0;
		switch (assinatura.getTipoDeAssinatura()) {
            case "ANUAL":
                taxa = 100.0;
                break;
            case "SEMESTRAL":
                taxa = 60.0;
                break;
            case "TRIMESTRAL":
                taxa = 30.0;
                break;
        }
        return taxa;
    }
    
    public boolean validarPagamento() {
        if (assinatura.getAtrasoPagamento()) {
            System.out.println("Assinatura em atraso. Não é possível fazer compras.");
            return false;
        }
        return true;
    }
   
}

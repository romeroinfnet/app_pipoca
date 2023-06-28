package br.edu.infnet.ex.lista_exercicios_2;

import java.time.LocalDate;

public class App {

	 public static void main( String[] args ){
	
		         // Criando um objeto de assinatura
		         Assinaturas assinatura = new Assinaturas();
		         CalculaAssinatura calcula = new CalculaAssinatura();
		         
		         // Definindo os atributos do objeto
		         assinatura.setTipoDeAssinatura("ANUAL");
		         assinatura.setData(LocalDate.of(2023, 1, 1));
		         assinatura.setAtrasoPagamento(false);
 
		         // Obtendo informações da assinatura
		         String tipoDeAssinatura = assinatura.getTipoDeAssinatura();
		         LocalDate dataInicial = assinatura.getData();
		         LocalDate dataFim = assinatura.getDataFim();
		         calcula.calcularTaxa("Anual");
		         boolean validacao = calcula.validarPagamento();

		         // Exibindo as informações da assinatura
		         System.out.println("Tipo de assinatura: " + tipoDeAssinatura);
		         System.out.println("Data de início: " + dataInicial);
		         System.out.println("Data de término: " + dataFim);
		         System.out.println("Taxa: " + calcula.calcularTaxa(tipoDeAssinatura));
		         System.out.println("Validação de pagamento: " + validacao);
		         
		         
		         
		         
		         
    } 
}


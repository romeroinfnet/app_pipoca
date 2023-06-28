package br.edu.infnet.ex.exercicios;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class App {

    public static void main(String[] args) {
       
        Produto produto1 = new Produto("Pão de forma", 10.99);
        Produto produto2 = new Produto("Pizza", 19.99);
        Produto produto3 = new Produto("farofa", 9.00);

       
        Cliente cliente1 = new Cliente("Maria Silva");
        Cliente cliente2 = new Cliente("Jose silva");
        Cliente cliente3 = new Cliente("Malva Silva");
  
        
        List<Produto> produtos1 = new ArrayList<Produto>();
        produtos1.add(produto1);
        produtos1.add(produto2);
        Pagamento pagamento1 = new Pagamento(produtos1, new Date(), cliente1);

        List<Produto> produtos2 = new ArrayList<Produto>();
        produtos2.add(produto2);
        produtos2.add(produto3);
        Pagamento pagamento2 = new Pagamento(produtos2, getDataDiaAnterior(), cliente3);

        List<Produto> produtos3 = new ArrayList<Produto>();
        produtos3.add(produto3);
        produtos2.add(produto1);
        Pagamento pagamento3 = new Pagamento(produtos3, getDataMesAnterior(), cliente2);

        List<Pagamento> pagamentos = new ArrayList<Pagamento>();
        pagamentos.add(pagamento1);
        pagamentos.add(pagamento2);
        pagamentos.add(pagamento3);

       // CRIANDO ASSINATURAS
       //=======================================================================
        
        BigDecimal valorMensalidade = new BigDecimal("99.98");

        // Assinatura 1 - Em andamento
        Assinatura assinatura1 = new Assinatura(valorMensalidade, LocalDate.now());
        System.out.println("Assinatura 1 - Mensalidade: " + assinatura1.getMensalidade()
                + " - Início: " + assinatura1.getDataInicial()
                + " - Encerrada: " + assinatura1.Encerrada());

        // Assinatura 2 - Encerrada
        LocalDate dataInicial1 = LocalDate.now().minusMonths(3);
        LocalDate dataFinal1 = LocalDate.now().minusMonths(1);
        Assinatura assinatura2 = new Assinatura(valorMensalidade, dataInicial1, dataFinal1);
        System.out.println("Assinatura 2 - Mensalidade: " + assinatura2.getMensalidade()
                + " - Início: " + assinatura2.getDataInicial()
                + " - Fim: " + assinatura2.getDataFinal()
                + " - Encerrada: " + assinatura2.Encerrada());

        // Assinatura 3 - Encerrada
        LocalDate dataInicial2 = LocalDate.now().minusMonths(6);
        LocalDate dataFinal2 = LocalDate.now().minusMonths(4);
        Assinatura assinatura3 = new Assinatura(valorMensalidade, dataInicial2, dataFinal2);
        System.out.println("Assinatura 3 - Mensalidade: " + assinatura3.getMensalidade()
                + " - Início: " + assinatura3.getDataInicial()
                + " - Fim: " + assinatura3.getDataFinal()
                + " - Encerrada: " + assinatura3.Encerrada());
        
        //Uso do  Collection e lambda para aprimir pagamentos
        Collections.sort(pagamentos, (p1, p2) -> p1.getDataCompra().compareTo(p2.getDataCompra()));


        for (Pagamento pagamento : pagamentos) {
            System.out.println("Total com collections:" + pagamento);
        }
        
        //============================================================
        // Sumarizado com Optional
		Optional<Double> soma1 = pagamento1.getProdutos().stream()
                .map(produto -> produto.getPreco().doubleValue())
                .reduce(Double::sum);
		
		soma1.ifPresent(soma_1 -> System.out.println("Total com optional: " + soma_1));
		
		Optional<Double> soma2 = pagamento2.getProdutos().stream()
                .map(produto -> produto.getPreco().doubleValue())
                .reduce(Double::sum);
		
		soma2.ifPresent(soma_2 -> System.out.println("Total: " + soma_2));

		Optional<Double> soma3 = pagamento3.getProdutos().stream()
                .map(produto -> produto.getPreco().doubleValue())
                .reduce(Double::sum);
		
		soma3.ifPresent(soma_3 -> System.out.println("Total: " + soma_3));
		
		//  ===================================================================
		// Imprimindo o valor total dos pagamentos
		 BigDecimal valorTotal = BigDecimal.ZERO;
	        for (Pagamento pagamento : pagamentos) {
	            valorTotal = valorTotal.add((pagamento).calcularValorTotal());
	        }
	        System.out.println("O valor total dos pagamentos é: " + valorTotal);
	        
	    //=======================================================================
	    //Lista dos produtos vendidos
	        
	        List<Produto> produtosVendidos = new ArrayList<>();
	        for (Pagamento pagamento : pagamentos) {
	            produtosVendidos.addAll(pagamento.getProdutos());
	        }

	        // Mostra a quantidade de produtos vendidos
	        
	        for (Produto produto : produtosVendidos) {
	            int quantidade = Collections.frequency(produtosVendidos, produto);
	            System.out.println("Produto: " + produto.getNome() + ", Quantidade vendida: " + quantidade);
	        }
	        
	     //===========================================================================
	     // Criando o mapa de Cliente para List<Produto>
	        Map<Cliente, List<Produto>> mapaClienteProdutos = new HashMap<>();

	        // Associando cada cliente à lista de produtos vendidos
	        for (Pagamento pagamento : pagamentos) {
	            cliente1 = pagamento.getCliente();
	            List<Produto> listaProdutos = mapaClienteProdutos.getOrDefault(cliente1, new ArrayList<>());
	            produtosVendidos.addAll(pagamento.getProdutos());
	            mapaClienteProdutos.put(cliente1, produtosVendidos);
	        }

	        // Imprimindo o mapa de Cliente para List<Produto>
	        for (Map.Entry<Cliente, List<Produto>> entry : mapaClienteProdutos.entrySet()) {
	            cliente1 = entry.getKey();
	            List<Produto> listaProdutos = entry.getValue();

	            System.out.println("Cliente: " + cliente1.getNome());
	            System.out.println("Produtos Vendidos:");
	            for (Produto produto : listaProdutos) {
	                System.out.println("- " + produto.getNome());
	            }
	        }
	        
	     // Associando cada cliente à lista de produtos vendidos
	        for (Pagamento pagamento : pagamentos) {
	            cliente2 = pagamento.getCliente();
	            List<Produto> listaProdutos = mapaClienteProdutos.getOrDefault(cliente2, new ArrayList<>());
	            produtosVendidos.addAll(pagamento.getProdutos());
	            mapaClienteProdutos.put(cliente2, produtosVendidos);
	        }

	        // Imprimindo o mapa de Cliente para List<Produto>
	        for (Map.Entry<Cliente, List<Produto>> entry : mapaClienteProdutos.entrySet()) {
	            cliente2 = entry.getKey();
	            List<Produto> listaProdutos = entry.getValue();

	            System.out.println("Cliente: " + cliente1.getNome());
	            System.out.println("Produtos Vendidos:");
	            for (Produto produto : listaProdutos) {
	                System.out.println("- " + produto.getNome());
	            }
	        }
	        
		     // Associando cada cliente à lista de produtos vendidos
	        for (Pagamento pagamento : pagamentos) {
	            cliente3 = pagamento.getCliente();
	            List<Produto> listaProdutos = mapaClienteProdutos.getOrDefault(cliente3, new ArrayList<>());
	            produtosVendidos.addAll(pagamento.getProdutos());
	            mapaClienteProdutos.put(cliente3, produtosVendidos);
	        }

	        // Imprimindo o mapa de Cliente para List<Produto>
	        for (Map.Entry<Cliente, List<Produto>> entry : mapaClienteProdutos.entrySet()) {
	            cliente3 = entry.getKey();
	            List<Produto> listaProdutos = entry.getValue();

	            System.out.println("Cliente: " + cliente3.getNome());
	            System.out.println("Produtos Vendidos:");
	            for (Produto produto : listaProdutos) {
	                System.out.println("- " + produto.getNome());
	            }
	        }
	        
	        //
	        // Encontrando o cliente que gastou mais
	        Cliente clienteQueGastouMais = null;
	        BigDecimal maiorValorGasto = BigDecimal.ZERO;
	        Map<Cliente, List<Produto>> gastosPorCliente = null;
			for (Entry<Cliente, List<Produto>> entry : gastosPorCliente.entrySet()) {
	            Cliente cliente = entry.getKey();
	            BigDecimal valorGasto = (BigDecimal) entry.getValue();
	            if (valorGasto.compareTo(maiorValorGasto) > 0) {
	                clienteQueGastouMais = cliente;
	                maiorValorGasto = valorGasto;
	            }
	        }

	        // Imprimindo o cliente que gastou mais
	        if (clienteQueGastouMais != null) {
	            System.out.println("Cliente que gastou mais: " + clienteQueGastouMais.getNome());
	            System.out.println("Valor gasto: " + maiorValorGasto);
	        } else {
	            System.out.println("Nenhum cliente encontrado.");
	        }
	        
	     //==============================================================================
	     // Calculando o faturamento total em um determinado mês
	        BigDecimal faturamentoTotal = BigDecimal.ZERO;
	        Month mesDesejado = Month.JUNE; // Defina o mês desejado

	        for (Pagamento pagamento : pagamentos) {
	            LocalDate dataCompra = pagamento.getDataCompra().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	            if (dataCompra.getMonth() == mesDesejado) {
	                faturamentoTotal = faturamentoTotal.add(pagamento.calcularValorTotal());
	            }
	        }

	        // Imprimindo o faturamento total no mês desejado
	        System.out.println("Faturamento total no mês " + mesDesejado + ": " + faturamentoTotal);
	        	        
	     //===================================================================
	     //
	     // Calcular o tempo em meses da assinatura ainda ativa
	        LocalDate dataAtual = LocalDate.now();
	        Assinatura assinatura = null;
			Period periodo = Period.between(assinatura.getDataInicial(), dataAtual);
	        int mesesAtivos = periodo.getMonths();

	        // Imprimir o tempo em meses da assinatura ativa
	        System.out.println("Tempo em meses da assinatura ativa: " + mesesAtivos + " meses");
	        
	     //====================================================================
	   	 //Imprima o tempo de meses entre o start e end de todas assinaturas.
	        System.out.println(calcularTempoEmMeses(assinatura));
	        System.out.println(calcularTempoEmMeses(assinatura1));
	        System.out.println(calcularTempoEmMeses(assinatura2));
	        System.out.println(calcularTempoEmMeses(assinatura3));
	        
	        
	     //===========================================================================
	   	 //Cacular assinaturas pagas
	        System.out.println(calcularValorPago(assinatura));
	        System.out.println(calcularValorPago(assinatura1));
	        System.out.println(calcularValorPago(assinatura2));
	        System.out.println(calcularValorPago(assinatura3));
  }
    
  //====================================================================
  //Imprima o tempo de meses entre o start e end de todas assinaturas.
  private static long calcularTempoEmMeses(Assinatura assinatura) {
	  LocalDate inicio = assinatura.getDataInicial();
	  LocalDate fim = assinatura.getDataFinal();

	  LocalDateTime DataInicial = inicio.atStartOfDay();
	  LocalDateTime DataFinal = fim != null ? fim.atStartOfDay() : LocalDateTime.now();

	  Duration duracao = Duration.between(DataInicial, DataFinal);
	  return duracao.toDays() / 30;
  }
       
  //===========================================================================
  //Cacular assinaturas pagas
  private static BigDecimal calcularValorPago(Assinatura assinatura) {
     BigDecimal mensalidade = assinatura.getMensalidade();
     LocalDate inicio = assinatura.getDataInicial();
     LocalDate hoje = LocalDate.now();

     Period periodo = Period.between(inicio, hoje);
     int meses = periodo.getMonths();

     BigDecimal valorPago = mensalidade.multiply(BigDecimal.valueOf(meses));
     return valorPago;
  }

    
    private static Date getDataDiaAnterior() {
        LocalDate yesterday = LocalDate.now().minus(1, ChronoUnit.DAYS);
        return java.sql.Date.valueOf(yesterday);
    }

    private static Date getDataMesAnterior() {
        LocalDate oneMonthAgo = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        return java.sql.Date.valueOf(oneMonthAgo);
    }
}
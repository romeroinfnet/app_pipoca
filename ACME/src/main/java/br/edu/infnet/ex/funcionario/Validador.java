package br.edu.infnet.ex.funcionario;

public class Validador{
	
	public static void AplicarReajuste(Funcionario funcionario, double taxaReajuste) {
        if (funcionario instanceof Terceirizado) {
            System.out.println("Não é possível aplicar reajuste para funcionários terceirizados.");
        } else {
                double salarioAtual = funcionario.getSalario();
                double Reajuste = salarioAtual * taxaReajuste;
                double novoSalario = salarioAtual + Reajuste;
                funcionario.setSalario(novoSalario);
                System.out.println("Reajuste aplicado para o funcionário " + funcionario.getNome() + ". Novo salário: " + novoSalario);
        }
    }
}

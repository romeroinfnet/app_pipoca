package br.edu.infnet.ex.funcionario;

public class App {

	    public static void main(String[] args) {
	        
	        Funcionario funcionario = new Funcionario("João Silva", "Rua A, 123", 5000.0, "Departamento de Vendas", "Vendedor");

	        funcionario.adicionarTelefone("9999-9999");
	        funcionario.adicionarTelefone("8888-8888");

	        System.out.println("Nome: " + funcionario.getNome());
	        System.out.println("Telefones: " + funcionario.getTelefones());
	        System.out.println("Endereço: " + funcionario.getEndereco());
	        System.out.println("Salário: " + funcionario.getSalario());
	        System.out.println("Setor: " + funcionario.getSetor());
	        System.out.println("Cargo: " + funcionario.getCargo());
	    }
}

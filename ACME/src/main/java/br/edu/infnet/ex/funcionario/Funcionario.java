package br.edu.infnet.ex.funcionario;

import java.util.ArrayList;
import java.util.List;

class Funcionario {
    private String nome;
    protected List<String> telefones;
    private String endereco;
    private double salario;
    private String setor;
    private String cargo;

    public Funcionario(String nome, String endereco, double salario, String setor, String cargo) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public void adicionarTelefone(String telefone) {
        this.telefones.add(telefone);
    }

    public void removerTelefone(String telefone) {
        this.telefones.remove(telefone);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

package br.edu.infnet.ex.funcionario;

import java.util.ArrayList;
import java.util.List;

class Terceirizado extends Funcionario {
    private String empresaContratada;
    private int tempoDePermanencia;

    public Terceirizado(String nome, String endereco, double salario, String setor, String cargo,
                        String empresaContratada, int tempoDePermanencia) {
        super(nome, endereco, salario, setor, cargo);
        this.empresaContratada = empresaContratada;
        this.tempoDePermanencia = tempoDePermanencia;
    }

    // Getters e Setters específicos para a entidade Terceirizado
    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    public int getTempoDePermanencia() {
        return tempoDePermanencia;
    }

    public void setTempoDePermanencia(int tempoDePermanencia) {
        this.tempoDePermanencia = tempoDePermanencia;
    }
}


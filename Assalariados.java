/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.rh.modelos;

import java.time.LocalDate;

/**
 *
 * @author kiel
 */
public class Assalariados extends Funcionario {
    
    private float salario;

    public Assalariados(float salario, String cpf, String nome, LocalDate nascimento) {
        super(cpf, nome, nascimento);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    public float calcularPagamento(){
        return salario;
    }
    
}

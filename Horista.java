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
public class Horista extends Funcionario{
    
    private int totalHoras;
    private float valorHora;

    public Horista(int totalHoras, float valorHora, String cpf, String nome, LocalDate nascimento) {
        super(cpf, nome, nascimento);
        this.totalHoras = totalHoras;
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    public float calcularPagamento(){
        return totalHoras*valorHora;
    }
    
}

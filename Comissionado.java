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
public class Comissionado extends Funcionario {
    
    private int totalVendas;
    private float comissao;

    public Comissionado(int totalVendas, float comissao, String cpf, String nome, LocalDate nascimento) {
        super(cpf, nome, nascimento);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    public float calcularPagamento(){
        return totalVendas*comissao;
    }
}

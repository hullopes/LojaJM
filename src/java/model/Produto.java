/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JM7087-Notbook
 */
public class Produto {
    private int PRO_ID;
    private String PRO_NOME;
    private String PRO_DESCRICAO;
    private int SUB_ID;
    private Double PRO_VALOR;
    private int PRO_QUANTIDADE;
    private int PRO_FOTOS;
    private int MARCAS_MAR_ID;

    public Produto(int PRO_ID, String PRO_NOME, String PRO_DESCRICAO, int SUB_ID, Double PRO_VALOR, int PRO_QUANTIDADE, int PRO_FOTOS, int MARCAS_MAR_ID) {
        this.PRO_ID = PRO_ID;
        this.PRO_NOME = PRO_NOME;
        this.PRO_DESCRICAO = PRO_DESCRICAO;
        this.SUB_ID = SUB_ID;
        this.PRO_VALOR = PRO_VALOR;
        this.PRO_QUANTIDADE = PRO_QUANTIDADE;
        this.PRO_FOTOS = PRO_FOTOS;
        this.MARCAS_MAR_ID = MARCAS_MAR_ID;
    }

    public int getPRO_ID() {
        return PRO_ID;
    }

    public void setPRO_ID(int PRO_ID) {
        this.PRO_ID = PRO_ID;
    }

    public String getPRO_NOME() {
        return PRO_NOME;
    }

    public void setPRO_NOME(String PRO_NOME) {
        this.PRO_NOME = PRO_NOME;
    }

    public String getPRO_DESCRICAO() {
        return PRO_DESCRICAO;
    }

    public void setPRO_DESCRICAO(String PRO_DESCRICAO) {
        this.PRO_DESCRICAO = PRO_DESCRICAO;
    }

    public int getSUB_ID() {
        return SUB_ID;
    }

    public void setSUB_ID(int SUB_ID) {
        this.SUB_ID = SUB_ID;
    }

    public Double getPRO_VALOR() {
        return PRO_VALOR;
    }

    public void setPRO_VALOR(Double PRO_VALOR) {
        this.PRO_VALOR = PRO_VALOR;
    }

    public int getPRO_QUANTIDADE() {
        return PRO_QUANTIDADE;
    }

    public void setPRO_QUANTIDADE(int PRO_QUANTIDADE) {
        this.PRO_QUANTIDADE = PRO_QUANTIDADE;
    }

    public int getPRO_FOTOS() {
        return PRO_FOTOS;
    }

    public void setPRO_FOTOS(int PRO_FOTOS) {
        this.PRO_FOTOS = PRO_FOTOS;
    }

    public int getMARCAS_MAR_ID() {
        return MARCAS_MAR_ID;
    }

    public void setMARCAS_MAR_ID(int MARCAS_MAR_ID) {
        this.MARCAS_MAR_ID = MARCAS_MAR_ID;
    }
    
    
}

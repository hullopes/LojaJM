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
public class Usuario {
    private int USU_ID;
    private String USU_NOME;
    private String USU_TELEFONE;
    private String USU_TIPO;
    private String USU_SEXO;
    private String USU_ENDERECO;
    private String USU_CEP;
    private int USU_CID_ID;

    public Usuario(int USU_ID, String USU_NOME, String USU_TELEFONE, String USU_TIPO, String USU_SEXO, String USU_ENDERECO, String USU_CEP, int USU_CID_ID) {
        this.USU_ID = USU_ID;
        this.USU_NOME = USU_NOME;
        this.USU_TIPO = USU_TIPO;
        this.USU_TELEFONE = USU_TELEFONE;
        this.USU_SEXO = USU_SEXO;
        this.USU_ENDERECO = USU_ENDERECO;
        this.USU_CEP = USU_CEP;
        this.USU_CID_ID = USU_CID_ID;
    }

    public int getUSU_ID() {
        return USU_ID;
    }

    public void setUSU_ID(int USU_ID) {
        this.USU_ID = USU_ID;
    }

    public String getUSU_NOME() {
        return USU_NOME;
    }

    public void setUSU_NOME(String USU_NOME) {
        this.USU_NOME = USU_NOME;
    }

    public String getUSU_TELEFONE() {
        return USU_TELEFONE;
    }

    public void setUSU_TELEFONE(String USU_TELEFONE) {
        this.USU_TELEFONE = USU_TELEFONE;
    }

    public String getUSU_SEXO() {
        return USU_SEXO;
    }

    public void setUSU_SEXO(String USU_SEXO) {
        this.USU_SEXO = USU_SEXO;
    }

    public String getUSU_ENDERECO() {
        return USU_ENDERECO;
    }

    public void setUSU_ENDERECO(String USU_ENDERECO) {
        this.USU_ENDERECO = USU_ENDERECO;
    }

    public String getUSU_CEP() {
        return USU_CEP;
    }

    public void setUSU_CEP(String USU_CEP) {
        this.USU_CEP = USU_CEP;
    }

    public int getUSU_CID_ID() {
        return USU_CID_ID;
    }

    public void setUSU_CID_ID(int USU_CID_ID) {
        this.USU_CID_ID = USU_CID_ID;
    }

    /**
     * @return the USU_TIPO
     */
    public String getUSU_TIPO() {
        return USU_TIPO;
    }

    /**
     * @param USU_TIPO the USU_TIPO to set
     */
    public void setUSU_TIPO(String USU_TIPO) {
        this.USU_TIPO = USU_TIPO;
    }
    
    
}

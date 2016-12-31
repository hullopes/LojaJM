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
public class SubCategoria {
    private int SUB_ID;
    private String SUB_NOME;
    private int CAT_ID;

    public SubCategoria(int SUB_ID, String SUB_NOME, int CAT_ID) {
        this.SUB_ID = SUB_ID;
        this.SUB_NOME = SUB_NOME;
        this.CAT_ID = CAT_ID;
    }

    public int getSUB_ID() {
        return SUB_ID;
    }

    public void setSUB_ID(int SUB_ID) {
        this.SUB_ID = SUB_ID;
    }

    public String getSUB_NOME() {
        return SUB_NOME;
    }

    public void setSUB_NOME(String SUB_NOME) {
        this.SUB_NOME = SUB_NOME;
    }

    public int getCAT_ID() {
        return CAT_ID;
    }

    public void setCAT_ID(int CAT_ID) {
        this.CAT_ID = CAT_ID;
    }
    
    
    
}

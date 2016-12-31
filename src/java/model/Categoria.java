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
public class Categoria {
    private int CAT_ID;
    private String CAT_NOME;

    public Categoria(int CAT_ID, String CAT_NOME) {
        this.CAT_ID = CAT_ID;
        this.CAT_NOME = CAT_NOME;
    }

    public int getCAT_ID() {
        return CAT_ID;
    }

    public void setCAT_ID(int CAT_ID) {
        this.CAT_ID = CAT_ID;
    }

    public String getCAT_NOME() {
        return CAT_NOME;
    }

    public void setCAT_NOME(String CAT_NOME) {
        this.CAT_NOME = CAT_NOME;
    }
    
    
}

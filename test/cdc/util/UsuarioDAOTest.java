/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdc.util;

import java.util.List;
import model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tatuapu
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }

//    /**
//     * Test of atualizar method, of class UsuarioDAO.
//     */
//    @Test
//    public void testAtualizar() throws Exception {
//    }
//
//    /**
//     * Test of excluir method, of class UsuarioDAO.
//     */
//    @Test
//    public void testExcluir() throws Exception {
//    }
//
//    /**
//     * Test of listaTodos method, of class UsuarioDAO.
//     */
//    @Test
//    public void testListaTodos() throws Exception {
//    }

    /**
     * Test of procura method, of class UsuarioDAO.
     */
    @Test
    public void testProcura() throws Exception {
        Usuario usr = new Usuario(0, "Nome", "", "", "", "", "", 0);
        UsuarioDAO dao = new UsuarioDAO();
        List<Usuario> lista = dao.procura(usr);
        assertTrue(lista.size() > 0);
        System.out.println(lista.size());
    }

    /**
     * Test of salvar method, of class UsuarioDAO.
     */
//    @Test
//    public void testSalvar() throws Exception {
//    }
    
}

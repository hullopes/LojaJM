/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cdc.util.LoginDAO;
import cdc.util.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Login;
import model.Usuario;

/**
 *
 * @author JM7087-Notbook
 */
@WebServlet(name = "controladorCadastro", urlPatterns = {"/controladorCadastro"})
public class controladorCadastroNovoUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException, Exception {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet NovoServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet NovoServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        
        out.println("<h1>passo 1</h1>");
        String inputNome = request.getParameter("inputNome");
        String inputTelefone = request.getParameter("inputTelefone");
        String inputSexo = request.getParameter("inputSexo");
        String inputEndereco = request.getParameter("inputEndereco");
        String inputCep = request.getParameter("inputCep");
        
        String inputEmail = request.getParameter("inputEmail");
        String inputPassword = request.getParameter("inputPassword");
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        LoginDAO loginDAO = new LoginDAO();
        out.println("<h1>passo 2</h1>");
        
        out.println(inputNome + "--" + inputTelefone+"--"+inputSexo+"--"+inputEndereco+"--"+inputCep);

        Usuario usr  = new Usuario(0,inputNome,inputTelefone,"4",inputSexo,inputEndereco,inputCep,1);
       
        usuarioDAO.salvar(usr);     
        out.println("<h1>passo 3</h1>");

        List<Usuario> lista = usuarioDAO.procura(usr);//buscando o usuário recém criado para obter seu id para cadastrar o login 
        
        out.println("<h1>passo 4</h1>");
        int i = lista.get(0).getUSU_ID();
        loginDAO.salvar(new Login(0,inputEmail,inputPassword,lista.get(0).getUSU_ID()));
                
        out.println("<h1>passo 5</h1>");


        }
        
        RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(controladorCadastroNovoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(controladorCadastroNovoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

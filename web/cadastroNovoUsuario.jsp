<%-- 
    Document   : cadastrar
    Created on : 31/10/2016, 14:36:29
    Author     : JM7087-Notbook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Loja Cadastro</title>


        <%@include file="template/head.jsp" %>

    </head>
    <body>

        <form action="./controladorCadastro" method="POST">

            <div class="container">

                <%@include file="template/cabecalho.jsp" %>

                <div class="form-group">
                    <label for="inputNome">Seu Nome</label>
                    <input type="text" class="form-control" name="inputNome" placeholder="Seu Nome" required>
                </div>

                <div class="form-signin">
                    <label for="inputEmail" class="sr-only">Seu Email</label>
                    <input type="email" id="inputEmail" name="inputEmail" class="form-control" placeholder="Seu Email" required autofocus>

                    <label for="inputPassword" class="sr-only">Senha</label>
                    <input type="password" id="inputPassword" name="inputPassword" class="form-control" placeholder="Sua Senha" required>
                </div>

                <div class="form-group">
                    <label for="inputTelefone">Seu Telefone</label>
                    <input type="text" class="form-control" name="inputTelefone" placeholder="Seu Telefone" required>

                   
                    <label for="inputSexo">Seu Sexo</label>
                    <select class="form-control" id="inputSoxo" name="inputSexo">
                        <option>Selecione</option>
                        <option value="m">M</option>
                        <option value="f">F</option>                                            
                    </select>             
                    
                    <label for="inputEndereco">Seu Endereço</label>
                    <input type="text" class="form-control" name="inputEndereco" placeholder="Seu Endereço" required>

                    <label for="inputCep">Seu CEP</label>
                    <input type="text" class="form-control" name="inputCep" placeholder="Seu Cep" required>
                       
                </div>
               <button class="btn btn-lg btn-primary " type="submit">Cadastrar</button>

        </form>

    </div>
                <br></br>
    <%@include file="template/rodape.jsp" %>

</body>
</html>

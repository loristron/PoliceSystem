<%-- 
    Document   : remove-fichapolicial
    Created on : 13/11/2014, 08:06:18
    Author     : Carina
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="negocios.MelianteDao"%>
<%@page import="negocios.Meliante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remoção de Meliantes</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="col-sm-offset-1 col-sm-10">
                <div class="jumbotron">                   
                    <h1>Delegacia </h1>
                </div>
            </div>
            <div class="col-sm-offset-1 col-sm-10">
                <h1>Remoção de Meliantes</h1>

                <table class="table">                  
                    <c:forEach var ="meliante" items ="${meliante}">
                        <tr>                            
                            <td><a href = "mvc?logica=RemoveMelianteLogica&id=${meliante.id}">${meliante.id} - Remover</a></td>
                            <td>${meliante.nome}<br><br></td >
                            <td>${meliante.cpf}<br><br></td>
                            <td>${meliante.endereco}&nbsp;&nbsp;<br><br></td>
                            <td>${meliante.delito}&nbsp;&nbsp;<br><br></td>
                            <td><fmt:formatDate value="${meliante.data.time}" pattern="dd/MM/yyyy"/><br><br></td>
                            <td>${meliante.hora}&nbsp;&nbsp;<br><br></td>
                            <td>${meliante.local}&nbsp;&nbsp;<br><br></td>   
                            <td>${meliante.estado}&nbsp;&nbsp;<br><br></td> 
                            <td><img src="${meliante.foto}" style="height:90px;"/></td>
                        </tr>
                    </c:forEach>
                </table>

                <div class="list-group">
                    <a href="#" class="list-group-item active">
                        Ações da Delegacia:
                    </a>
                    <a href="#" class="list-group-item">
                        <form method="post" action="cadastra-fichapolicial.jsp">
                            <button type="submit" class="btn btn-default">Cadastro</button>
                        </form>
                    </a>
                    <a href="#" class="list-group-item">
                        <form method="post" action="mvc?logica=ListaMelianteLogica">
                            <button type="submit" class="btn btn-default">Lista de meliantes</button>
                        </form>
                    </a>
                    <a href="#" class="list-group-item">
                        <form method="post" action="mvc?logica=ListaParaRemoverMelianteLogica">
                            <button type="submit" class="btn btn-default">Remoção</button>
                        </form>
                    </a>
                    <a href="#" class="list-group-item">
                        <form method="post" action="mvc?logica=ListaForagidosLogica">
                            <button type="submit" class="btn btn-default">Foragidos</button>
                        </form>
                    </a>
                </div>
            </div>
        </div>
    </body>
</html>

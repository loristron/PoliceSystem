<%-- 
    Document   : index
    Created on : 10/11/2014, 15:05:55
    Author     : Carina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delegacia</title>
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="col-sm-offset-1 col-sm-10">
                <div class="jumbotron">                   
                    <h1>Delegacia</h1>
                </div>

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


<%-- 
    Document   : cadastra-fichapolicial
    Created on : 11/11/2014, 08:50:52
    Author     : Carina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <div class="container">
            <div class="jumbotron">                   
                <h1>Delegacia de Townsville</h1>
            </div>
            <div class="col-sm-offset-3 col-sm-6">
                <h1>Insira os dados do meliante</h1>
                <form action ="mvc?logica=AdicionaMelianteLogica" method="POST">
                    *todos os campos são obrigatórios
                    <table style="border: 2px solid transparent;">
                        <tr>
                            <td>Nome:<br><br></td>
                            <td><input type ="text" name ="nome" /><br><br></td>
                        </tr>
                        <tr>
                            <td>CPF:<br><br></td>
                            <td><input type ="text" name ="cpf" /><br><br></td>
                        </tr>
                        <tr>
                            <td>Endereço:<br><br></td>
                            <td><input type ="text" name ="endereco" /><br><br></td>
                        </tr>
                        <tr>
                            <td>Delito:<br><br></td>
                            <td><input type ="text" name ="delito" /><br><br></td>
                        </tr>
                        <tr>
                            <td>Data:&nbsp;<br><br></td>
                            <td><input type ="text" name ="data" /><br><br></td>
                        </tr>
                        <tr>
                            <td>Hora: <br><br></td>
                            <td><input type ="text" name ="hora" /><br><br></td>
                        </tr>
                        <tr>
                            <td>Local:<br><br></td>
                            <td><input type ="text" name ="local" /><br><br></td>
                        </tr>
                        <tr>
                            <td>Estado:<br><br></td>
                            <td><input type ="text" name ="estado" /> (preso, solto ou foragido)<br><br></td>
                        </tr>
                        <tr>
                            <td>Foto:<br><br></td>
                            <td><input type ="text" name ="foto" /> insira link<br><br></td>
                        </tr>
                        <tr><td> </td>
                            <td><input type ="submit" value ="Adicionar" /></td>
                        </tr>
                        <tr><td>&nbsp; </td>
                            <td>&nbsp; </td>
                        </tr>
                        
                    </table>                         
            </div>
            
        </div>
    </body>
</html>

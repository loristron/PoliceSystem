/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carina
 */
public class AdicionaMelianteLogica implements Logica {

    public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        PrintWriter out = response.getWriter();

        // pegando os parâmetros do request
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String endereco = request.getParameter("endereco");
        String delito = request.getParameter("delito");
        String dataString = request.getParameter("data");

        String hora = request.getParameter("hora");
        String local = request.getParameter("local");
        String estado = request.getParameter("estado");
        String foto = request.getParameter("foto");
        // monta um objeto meliante
        Meliante meliante = new Meliante();

        meliante.setNome(nome);
        meliante.setCpf(cpf);
        meliante.setEndereco(endereco);
        meliante.setDelito(delito);
            
        Calendar data = null;
        try { 
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
            data = Calendar.getInstance();
            data.setTime(date);
        } catch (ParseException e) { 
            throw new RuntimeException(e); 
        }
        
        meliante.setData(data);
        meliante.setHora(hora);
        meliante.setLocal(local);
        meliante.setEstado(estado);
        meliante.setFoto(foto);

        meliante.printaMeliante();

        // salva o meliante
        MelianteDao dao;

        dao = new MelianteDao();
        dao.adiciona(meliante);

        System.out.println("Adicionando meliante...");
        return "mvc?logica=ListaMelianteLogica";
    }
}

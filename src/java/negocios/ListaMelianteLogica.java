/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocios;

import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carina
 */
public class ListaMelianteLogica implements Logica {

    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
                
        // salva o meliante
        MelianteDao dao = new MelianteDao();        
        ArrayList<Meliante> listaMeliantes = dao.getListaOrdenadaDelito();

        System.out.println("Redirecionando...");
        request.setAttribute("meliante", listaMeliantes);
        return "lista-fichaspoliciais.jsp";        
    }    
}

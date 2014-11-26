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
public class ListaForagidosLogica implements Logica{
    @Override
    public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
                
        // salva o meliante
        MelianteDao dao = new MelianteDao();        
        ArrayList<Meliante> listaMeliantes = dao.getListaOrdenadaDelito();
        ArrayList<Meliante> listaForagidos = new ArrayList<Meliante>();
        
        for(Meliante m : listaMeliantes){
            if(m.getEstado().equalsIgnoreCase("foragido")){
                listaForagidos.add(m);
            }
        }

        System.out.println("Redirecionando...");
        request.setAttribute("meliante", listaForagidos);
        return "foragidos-fichaspoliciais.jsp";
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carina
 */
public class RemoveMelianteLogica implements Logica {

        public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
            int id = Integer.parseInt(req.getParameter("id"));
            Meliante meliante = new Meliante();
            meliante.setId(id);
            MelianteDao dao = new MelianteDao();
            dao.removeMeliante(meliante);
            System.out.println("Excluindo meliante...");
            return "index.jsp";
        }
    }


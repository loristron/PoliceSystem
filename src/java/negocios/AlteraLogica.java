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
public class AlteraLogica implements Logica {

        public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
            int id = Integer.parseInt(request.getParameter("id"));

            request.setAttribute("id", id);
            return "altera-fichapolicial.jsp";
        }
    }

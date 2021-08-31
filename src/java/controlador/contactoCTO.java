/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.contactoDAO;
import modelo.dto.contactoDTO;

/**
 *
 * @author USER
 */
public class contactoCTO extends HttpServlet {

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
            throws ServletException, IOException {
         String accion = request.getParameter("accion");
        contactoDAO dao = new contactoDAO();
        switch (accion) {
            case "crear": {
                String nombre = request.getParameter("txtNombre");
                String correo = request.getParameter("txtCorreo");
                String asunto = request.getParameter("txtAsunto");
                String mensaje = request.getParameter("txtDesc");

                contactoDTO dto = new contactoDTO(nombre, correo, asunto, mensaje);

                boolean a = dao.crear(dto);
                if (a) {
                    PrintWriter out = response.getWriter();
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Respuesta</title>");
                    out.println("<body> <h1>Su comentario fue enviado con exito </h1>"
                            + "<a href=index.jsp >Volver</a> </body>");
                    out.println("</html>");
                }
                break;
            }
            case "listar": {
               // asi se redirecciona a otra pagina
               //request.getRequestDispatcher("Link de la pagina a redireccionar").forward(request, response);
                List<contactoDTO> list = dao.readAll();
                PrintWriter out = response.getWriter();
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Respuesta</title>");
                out.println("<style>" + "table, th, td{"
                        + "border: 1px solid black;"+"  border-collapse: collapse;"+"}"
                        + "th, td{"+
"                        padding: 15px; }"
                        + "</style>");
               
                out.println("</head>");
                out.println("<body>");
                out.println("<table>");
                out.println("<caption>Lista de mensajes</caption>");
                out.println("<th>Nombre</th> <th>Correo</th> <th>Asunto</th> <th>Comentario</th>");
                        
                        for (contactoDTO i : list) {
                            out.println("<tr>");
                        out.println("<td>"+i.getNombre());
                        out.println("</td>");
                        out.println("<td>"+i.getCorreo());
                        out.println("</td> ");
                        out.println("<td>"+i.getAsunto());
                        out.println("</td> ");
                        out.println("<td>"+i.getComentario());
                        out.println("</td> ");
                    }
                out.println("</body>");
                out.println("</html>");

            }
        }

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
        processRequest(request, response);
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
        processRequest(request, response);
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

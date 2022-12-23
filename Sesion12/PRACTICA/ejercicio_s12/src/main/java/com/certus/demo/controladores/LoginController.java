
package com.certus.demo.controladores;

import com.certus.demo.modelos.entidades.Administrador;
import com.certus.demo.servicios.AdministradorService;
import com.certus.demo.servicios.impl.AdministradorServiceImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jhordie
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

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
        /**response.setContentType("text/html;charset=UTF-8");
        String us = request.getParameter("txtUsuario");
        String ps = request.getParameter("txtPassword");
        
        AdministradorService servicio = new AdministradorServiceImpl();
        Administrador adm = servicio.validar(us, ps);
        
        try ( PrintWriter out = response.getWriter()) {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ingreso</title>");            
            out.println("</head>");
            out.println("<body>");
            if(adm!=null)
                out.println("<h1>Bienvenido "+adm.getNombre()+"</h1>");
            else 
                out.println("<h1>Credenciales incorrectas</h1>");
            out.println("</body>");
            out.println("</html>");
        }**/
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
        //processRequest(request, response);
        String us = request.getParameter("txtUsuario");
        String ps = request.getParameter("txtPassword");
        
        AdministradorService servicio = new AdministradorServiceImpl();
        Administrador adm = servicio.validar(us, ps);
        
        HttpSession sesion = request.getSession();
        
        if(adm!=null){
            sesion.setAttribute("elAdministrador", adm);
            response.sendRedirect("principal.jsp");
        }else{
            response.sendRedirect("error.html");
        }
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

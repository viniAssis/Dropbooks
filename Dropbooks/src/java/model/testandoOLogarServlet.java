package model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author thiago
 */
public class testandoOLogarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
       
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String usuemail = request.getParameter("email");
                String ususenha=request.getParameter("senha");
                
                if(usuemail.equals("teste@teste.com")&&ususenha.equals("teste")){
                    HttpSession sessao=request.getSession();
                    sessao.setAttribute("email", usuemail);
                    response.sendRedirect("home.jsp");
                }
                else{
                    response.sendRedirect("login.jsp");
                }
        
    }



}

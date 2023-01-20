package Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginAmdinController",value = "/LoginAmdinController")
public class LoginAmdinController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            if(request.getParameter("password").equals("123")){
                RequestDispatcher dispat = request.getRequestDispatcher("accueil.jsp");
                dispat.forward(request,response);
            } else{
                throw new Exception("Login invalid");
            }
        } catch (Exception ex) {
            request.setAttribute("exception", ex.getMessage());
            RequestDispatcher dispat = request.getRequestDispatcher("index.jsp");
            dispat.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

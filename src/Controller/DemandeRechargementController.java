package Controller;

import Model.Demande_rechargement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DemandeRechargementController",value = "/DemandeRechargementController")
public class DemandeRechargementController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {


            Demande_rechargement[] listeDemande = new Demande_rechargement().listeDemandeNonValider();
            request.setAttribute("listeDemande", listeDemande);
        } catch (Exception ex) {
            request.setAttribute("exception", ex.getMessage());
        } finally {
            RequestDispatcher dispat = request.getRequestDispatcher("demande_rechargement.jsp");
            dispat.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Demande_rechargement[] listeDemande = new Demande_rechargement().listeDemandeNonValider();
            request.setAttribute("listeDemande", listeDemande);
        } catch (Exception ex) {
            request.setAttribute("exception", ex.getMessage());
        } finally {
            RequestDispatcher dispat = request.getRequestDispatcher("demande_rechargement.jsp");
            dispat.forward(request,response);
        }
    }
}

package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MatchDao;

/**
 * Servlet implementation class Match
 */
@WebServlet("/ajouter_player_match")
public class Match extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Match() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Afficher la liste de player_contest
		MatchDao matchD = new MatchDao();
		ArrayList<model.Match> ListeMatch = (ArrayList<model.Match>)matchD.read();
		request.setAttribute("ListeMatch", ListeMatch);
		request.getRequestDispatcher("/form/match.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JE DOIS FAIRE LE POST POUR ENVOYER LES DONNEES
		doGet(request, response);
	}

}

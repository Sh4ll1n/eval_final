package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GameDao;
import dao.PlayerDao;
import model.Game;
import model.Player;

/**
 * Servlet implementation class Accueil
 */
@WebServlet("/accueil")
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accueil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Ce qu'il faut pour afficher les infos d'une classe, ici Player
		// Instancier le DAO
		//Creer la liste a parcourir
		// soumettre la requete au serveur
		PlayerDao playerD = new PlayerDao();
		ArrayList<Player> ListePlayer = (ArrayList<Player>) playerD.read();
		request.setAttribute("ListePlayer", ListePlayer);
		GameDao gameD = new GameDao();
		ArrayList<Game> ListeGame = (ArrayList<Game>) gameD.read();
		request.setAttribute("ListeGame", ListeGame);
		request.getRequestDispatcher("/accueil/accueil.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

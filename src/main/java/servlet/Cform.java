package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContestDao;
import dao.GameDao;
import model.Contest;
import model.Game;

/**
 * Servlet implementation class Cform
 */
@WebServlet("/ajouter_match")
public class Cform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// A mettre avant le request
		GameDao gameD = new GameDao();
		ArrayList<Game> listeGame = (ArrayList<Game>) gameD.read();
		// Permet a la jsp d'acceder la variable
		System.out.println(listeGame.size());
		request.setAttribute("listeGame",listeGame);
		// Je peux appeler cette liste grace ${listeGame} dans ma JSP
		request.getRequestDispatcher("/form/cadd.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération de saisies
		int game = Integer.parseInt(request.getParameter("select_game"));
		// INSERT INTO 
		Contest match = new Contest(game);
		ContestDao contestD = new ContestDao();
		
		contestD.create(match);
		System.out.println(match);
		doGet(request, response);
	}

}

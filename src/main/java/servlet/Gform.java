package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GameDao;
import model.Game;

/**
 * Servlet implementation class Gform
 */
@WebServlet("/ajouter_jeu")
public class Gform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/form/gadd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Récupération de saisies
		String title = request.getParameter("title_game");
		int min_players = Integer.parseInt(request.getParameter("min_players"));
		int max_players = Integer.parseInt(request.getParameter("max_players"));
		
		// INSERT INTO 
		Game game = new Game(title,min_players,max_players);
		GameDao gameD = new GameDao();
		
		gameD.create(game);
		System.out.println(game);
		doGet(request, response);
	}

}

package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlayerDao;
import model.Player;

/**
 * Servlet implementation class Pform
 */
@WebServlet("/ajouter_joueur")
public class Pform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/form/padd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recupère la session (Cela force a être connecté pour post, ici on ne veut pas cela) 
		//HttpSession session = request.getSession();
		
		// Recupération des saisies
		String email = request.getParameter("email");
		String nickname = request.getParameter("nickname");
		
		// INSERT INTO
		Player joueur = new Player(email,nickname);
		PlayerDao playerD = new PlayerDao();
		
		playerD.create(joueur);
		System.out.println(joueur);
//		if(playerD.create(joueur)) {
//			request.getRequestDispatcher("/accueil/accueil.jsp").forward(request, response);
//		} else {
//			
//			request.getRequestDispatcher("/form/padd.jsp").forward(request, response);
//		}
		doGet(request,response);
	}

}

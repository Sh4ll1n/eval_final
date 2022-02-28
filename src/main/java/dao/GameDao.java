package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Game;
import servlet.GetConnection;


public class GameDao implements Idao<Game> {
	Connection connect = GetConnection.getConnection();
	
	@Override
	public boolean create(Game jeu) {
		boolean msg = false;
		PreparedStatement req;
		try {
			req = connect.prepareStatement("INSERT INTO game"+
		"(title, min_players, max_players) VALUES (?,?,?) ");
			req.setString(1, jeu.getTitle());
			req.setInt(2, jeu.getMinPlayers());
			req.setInt(3, jeu.getMaxPlayers());
			req.executeUpdate();
			System.out.println("Jeu enregistré");
			msg = true;
		} catch (Exception e) {
			System.out.println("Jeu non enregistré");
		}
		return msg;
	}

	@Override
	public List<Game> read() {
		List<Game> jeu = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM game" );
			
			ResultSet rs = req.executeQuery();
			while(rs.next()) {
				Game game = new Game(
						rs.getInt("id"),
						rs.getString("title"),
						rs.getInt("min_players"),
						rs.getInt("max_players")
						);
				jeu.add(game);
			};
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jeu;
	}

	@Override
	public Game findById(int id) {
		Game jeu = new Game();
		try {
PreparedStatement req = connect.prepareStatement("SELECT * FROM game WHERE id = ?");
			req.setInt(1, id);
			ResultSet rs = req.executeQuery();
			while(rs.next()) {
					jeu = new Game(
						rs.getInt("id"),
						rs.getString("title"),
						rs.getInt("min_players"),
						rs.getInt("max_players")
						);
			};
		} catch (Exception e) {
			// TODO: handle exception
		}
		return jeu;
	}

}

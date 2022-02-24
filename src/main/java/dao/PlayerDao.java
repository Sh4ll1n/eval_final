package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import servlet.GetConnection;

public class PlayerDao implements Idao<Player> {
	Connection connect = GetConnection.getConnection();
	ResultSet rs = null;
	List<Player> listeJoueur = new ArrayList<>();
	
	@Override
	public boolean create(Player joueur) {
		boolean msg = false;
		try {
			PreparedStatement sql = connect.prepareStatement("INSERT INTO player"+
		"(email, nickname) VALUES (?,?) ");
			sql.setString(1, joueur.getEmail());
			sql.setString(2, joueur.getNickname());
			System.out.println(sql);
			sql.executeUpdate();
			System.out.println("Joueur enregistré");
			msg = true;
		} catch (Exception e) {
			System.out.println("Joueur non enregistré");
		}
		return msg;
	}

	@Override
	public List<Player> read() {
		PreparedStatement sql;
		try {
			sql = connect.prepareStatement("SELECT * FROM player" );
			
			rs = sql.executeQuery();
			while(rs.next()) {
				Player joueur = new Player(
				rs.getInt("id"),
				rs.getString("email"),
				rs.getString("nickname"));
			listeJoueur.add(joueur);
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listeJoueur;
	}

	@Override
	public Player findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Contest;
import model.Match;
import model.Player;
import servlet.GetConnection;

public class MatchDao implements Idao<Match> {
	Connection connect = GetConnection.getConnection();
	//List<Match> listMatch = new ArrayList<>();
	
	@Override
	public boolean create(Match match) {
		boolean msg = false;
		try {
			PreparedStatement sql = connect.prepareStatement("INSERT INTO player_contest"+
					"(player_id,contest_id) VALUES (?,?)" );
			sql.setInt(1, match.getPlayerIdMatch().getId());
			sql.setInt(2, match.getContestIdMatch().getId());
			sql.executeQuery();
			System.out.println(sql+"Données ajoutées");
			msg = true;
			} catch (Exception e) {
				System.out.println("Données non enregistrées"+e.getMessage());
		}
		return false;
	}

	@Override
	public List<model.Match> read() {
		List<model.Match> listeMatch = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement
					("SELECT * FROM player_contest"
					+ " LEFT JOIN player ON player.id = player_contest.player_id"
					+ " LEFT JOIN contest ON contest.id = player_contest.contest_id"
					+ " ORDER BY contest_id ASC"
					);
			ResultSet rs = req.executeQuery();
			while(rs.next()) {
				Match match = new Match(
				rs.getInt("id"),
				rs.getInt("contest_id"),
						  	  new Player(
				rs.getInt("id"),
				rs.getString("email"),
				rs.getString("nickname")
						),
						  new Contest(
				rs.getInt(1),
				rs.getString("game_id"),
				rs.getInt("winner_id")
						)
				);
			listeMatch.add(match);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listeMatch;
	}

	@Override
	public Match findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

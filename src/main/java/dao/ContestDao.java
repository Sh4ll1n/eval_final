package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Contest;
import model.Game;
import model.Player;
import servlet.GetConnection;

public class ContestDao implements Idao<Contest> {
	Connection connect = GetConnection.getConnection();
	//List<Contest> listeContest = new ArrayList<>();
	
	@Override
	public boolean create(Contest match) {
		boolean msg = false;
		try {
			PreparedStatement sql = connect.prepareStatement
					("INSERT INTO contest(game_id,start_date)"
					+"VALUES (?,NOW())"
					);
			// Comme j'ai viré mon attribut gameID en int. Ne fonctionne pus.
			sql.setInt(1, match.getGameId().getId());
			sql.executeUpdate();
			System.out.println(sql+"Match enregistré");
			msg = true;
		} catch ( Exception e) {
			System.out.println("Match non enregistré"+e.getMessage());
		}
		return false;
	}

	@Override
	public List<Contest> read() {
		List<Contest> listeContest = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement
					("SELECT * FROM contest"
					+" LEFT JOIN game ON game.id = contest.game_id"
					+" LEFT JOIN player ON player.id = contest.winner_id" 
					+" ORDER BY start_date DESC"
					);
			ResultSet rs = req.executeQuery();
			while(rs.next()) {
				Contest contest = new Contest(
						rs.getInt("id"),
								  new Game(
						// Je peux mettre directement le nom de la colonne de ma requete sql comme rs.getInt(3)
						rs.getInt("id"),
						rs.getString("title"),
						rs.getInt("min_players"),
						rs.getInt("max_players")
								),
						rs.getDate("start_date"),
								  new Player(
						rs.getInt("id"),
						rs.getString("email"),
						rs.getString("nickname")
								)
						);
				listeContest.add(contest);
			};
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listeContest;
	}

	@Override
	public Contest findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

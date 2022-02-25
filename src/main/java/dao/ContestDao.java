package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Contest;
import servlet.GetConnection;

public class ContestDao implements Idao<Contest> {
	
	Connection connect = GetConnection.getConnection();
	List<Contest> listeContest = new ArrayList<Contest>();
	
	@Override
	public boolean create(Contest match) {
		boolean msg = false;
		try {
			PreparedStatement sql = connect.prepareStatement("INSERT INTO contest"+
		"(game_id,start_date) VALUES (?,NOW()");
			sql.setInt(1, match.getGameId().getId());
			//sql.setDate(2, match.getStart_date());
			sql.executeUpdate();
			System.out.println("Match enregistré");
			msg = true;
		} catch ( Exception e) {
			System.out.println("Match non enregistré");
		}
		return false;
	}

	@Override
	public List<Contest> read() {
		List<Contest> match = new ArrayList<>();
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM contest ORDER BY start_date DESC ");
			ResultSet rs = req.executeQuery();
			while(rs.next()) {
				Contest contest = new Contest(
						rs.getInt("id"),
						rs.getInt("game_id"),
						rs.getDate("start_date"),
						rs.getInt("winner_id")
						);
				match.add(contest);
			};
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Contest findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

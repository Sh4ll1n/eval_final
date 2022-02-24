package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
			sql.setInt(1, match.getGame_id().getId());
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contest findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

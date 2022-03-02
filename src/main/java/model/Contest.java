package model;

import java.util.Date;

public class Contest {
	private int id;
	private Game gameId;
	private Date start_date;
	private Player winnerId;
	
	public Contest(int id, Game gameId, Date start_date, Player winnerId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.start_date = start_date;
		this.winnerId = winnerId;
	}
	
	public Contest(int id, Game gameId, Player winnerId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.winnerId = winnerId;
	}
	

	public Contest() {
		super();
	}

	public Contest(int id) {
		super();
		this.id = id;
	}
	

	public Contest(Game gameId) {
		super();
		this.gameId = gameId;
	}


	public Contest(int int1, String string, int int2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	
	public Game getGameId() {
		return gameId;
	}
	public void setGameId(Game gameId) {
		this.gameId = gameId;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Player getWinnerId() {
		return winnerId;
	}
	public void setWinnerId(Player winnerId) {
		this.winnerId = winnerId;
	}
	@Override
	public String toString() {
		return "Contest [id=" + id + ", gameId=" + gameId + ", start_date=" + start_date + ", winnerId=" + winnerId
				+ "]";
	}
	
	
	
	

	
}

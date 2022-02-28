package model;

import java.util.Date;

public class Contest {
	private int id;
	private Game gameId;
	private int game_id;
	private Date start_date;
	private int winner_id;
	private Player winnerId;
	
	public Contest(int id, Game gameId, int game_id, Date start_date, int winner_id, Player winnerId) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.game_id = game_id;
		this.start_date = start_date;
		this.winner_id = winner_id;
		this.winnerId = winnerId;
	}
	public Contest(int id, int game_id, Date start_date, int winner_id) {
		super();
		this.id = id;
		this.game_id = game_id;
		this.start_date = start_date;
		this.winner_id = winner_id;
	}
	
	public Contest(Game gameId) {
		super();
		this.gameId = gameId;
	}
	public Contest() {
		super();
	}
	public Contest(int game) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGameId() {
		return gameId;
	}
	public void setGameId(Game gameId) {
		this.gameId = gameId;
	}
	public int getGame_id() {
		return game_id;
	}
	public void setGame_id(int game_id) {
		this.game_id = game_id;
	}
	public java.sql.Date getStart_date() {
		return (java.sql.Date) start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public int getWinner_id() {
		return winner_id;
	}
	public void setWinner_id(int winner_id) {
		this.winner_id = winner_id;
	}
	public Player getWinnerId() {
		return winnerId;
	}
	public void setWinnerId(Player winnerId) {
		this.winnerId = winnerId;
	}
	@Override
	public String toString() {
		return "Contest [id=" + id + ", gameId=" + gameId + ", game_id=" + game_id + ", start_date=" + start_date
				+ ", winner_id=" + winner_id + ", winnerId=" + winnerId + "]";
	}
	
	

	
}

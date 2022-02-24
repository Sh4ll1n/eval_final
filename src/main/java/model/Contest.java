package model;

import java.util.Date;

public class Contest {
	private int id;
	private Game game_id;
	private Date start_date;
	private Player winner_id;
	
	
// Constructors
	public Contest(Game game_id, Date start_date, Player winner_id) {
		super();
		this.game_id = game_id;
		this.start_date = start_date;
		this.winner_id = winner_id;
	}


	public Contest(int id, Game game_id, Date start_date, Player winner_id) {
		super();
		this.id = id;
		this.game_id = game_id;
		this.start_date = start_date;
		this.winner_id = winner_id;
	}


	public Contest() {
		super();
	}


	public Contest(Game game_id, Player winner_id) {
		super();
		this.game_id = game_id;
		this.winner_id = winner_id;
	}


	public Contest(int game) {
		// TODO Auto-generated constructor stub
	}


	// Getter Setter
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public Game getGame_id() {
		return game_id;
	}
	
	
	public void setGame_id(Game game_id) {
		this.game_id = game_id;
	}
	
	
	public Date getStart_date() {
		return start_date;
	}
	
	
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
	
	public Player getWinner_id() {
		return winner_id;
	}
	
	
	public void setWinner_id(Player winner_id) {
		this.winner_id = winner_id;
	}


	
// toString
	@Override
	public String toString() {
		return "Contest [id=" + id + ", game_id=" + game_id + ", start_date=" + start_date + ", winner_id=" + winner_id
				+ "]";
	}
	
	
	
	
	
}

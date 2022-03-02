package model;

public class Match {
	private int id;
	private Player playerIdMatch;
	private Contest contestIdMatch;
	private int contest_id;
	public Match(int id, int contest_id,Player playerIdMatch, Contest contestIdMatch) {
		super();
		this.id = id;
		this.contest_id = contest_id;
		this.playerIdMatch = playerIdMatch;
		this.contestIdMatch = contestIdMatch;
	}
	public Match(Player playerIdMatch, Contest contestIdMatch) {
		super();
		this.playerIdMatch = playerIdMatch;
		this.contestIdMatch = contestIdMatch;
	}
	public Match(int id) {
		super();
		this.id = id;
	}
	
	public int getContest_id() {
		return contest_id;
	}
	public void setContest_id(int contest_id) {
		this.contest_id = contest_id;
	}
	public int getId() {
		return id;
	}
	public Player getPlayerIdMatch() {
		return playerIdMatch;
	}
	public Contest getContestIdMatch() {
		return contestIdMatch;
	}
	public void setPlayerIdMatch(Player playerIdMatch) {
		this.playerIdMatch = playerIdMatch;
	}
	public void setContestIdMatch(Contest contestIdMatch) {
		this.contestIdMatch = contestIdMatch;
	}
	@Override
	public String toString() {
		return "Match [id=" + id + ", playerIdMatch=" + playerIdMatch + ", contestIdMatch=" + contestIdMatch
				+ ", contest_id=" + contest_id + "]";
	}
	
	
	
	
	
}

package model;

public class Game {
	private int id;
	private String title;
	private int minPlayers;
	private int maxPlayers;
// Constructors
	public Game(String title, int minPlayers, int maxPlayers) {
		super();
		this.title = title;
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
	}
	
	public Game(int id, String title, int minPlayers, int maxPlayers) {
		super();
		this.id = id;
		this.title = title;
		this.minPlayers = minPlayers;
		this.maxPlayers = maxPlayers;
	}
	
	public Game(int id) {
		super();
		this.id = id;
	}

	public Game() {
		super();
	}

	// Getter Setter
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMinPlayers() {
		return minPlayers;
	}
	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}
	public int getMaxPlayers() {
		return maxPlayers;
	}
	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
// toString
	@Override
	public String toString() {
		return "Game [title=" + title + ", minPlayers=" + minPlayers + ", maxPlayers=" + maxPlayers + "]";
	}
	
}

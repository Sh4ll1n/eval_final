package model;

public class Player {
	private int id;
	private String email;
	private String nickname;

// Constuctors
	public Player(String email, String nickname) {
		super();
		this.email = email;
		this.nickname = nickname;
	}
	
	

public Player(int id, String email, String nickname) {
		super();
		this.id = id;
		this.email = email;
		this.nickname = nickname;
	}



	// Getter Setter
	public int getId() {
		return id;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

// toString

	@Override
	public String toString() {
		return "Player [email=" + email + ", nickname=" + nickname + "]";
	}

	
}

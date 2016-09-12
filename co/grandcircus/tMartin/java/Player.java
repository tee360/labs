package co.grandcircus.tMartin.java;
public abstract class Player 
{
	private String playerName;

	public Player(String playerName) {
		super();
		this.playerName = playerName;
	}

	public abstract Roshambo generateRoshambo();

	public void setPlayerName(String playerName) 
	{
		this.playerName = playerName;
	}

	public String getPlayerName() 
	{
		return playerName;
	}

//	@Override
//	public String toString() {
//		return "Player [playerName=" + playerName + "]";
//	}

}
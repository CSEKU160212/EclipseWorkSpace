package problemSet2;

import java.util.ArrayList;

public class MatchType extends FarCry implements Result {
	String gameName;
	String gameType;
	String matchType;
	String play;
	int firstPlayer, secondPlayer;

	static ArrayList<MatchType> player=new ArrayList<MatchType>();
	public MatchType(String gameName, String gameType, String matchType) {
		super(gameName);
		this.gameType = gameType;
		this.matchType = matchType;
	}
	public MatchType(String gameName, String play, int firstPlayer, int secondPlayer)
	{
		super(gameName);
		this.play=play;
		this.firstPlayer=firstPlayer;
		this.secondPlayer=secondPlayer;
	}
	
	public String winner()
	{
		if(firstPlayer > secondPlayer)
			return "Player one won";
		else
			return "Player two won";
	}
	
	public String getGameDetail() {
		return "Game Name: "+gameName+"\nGame Type: "+gameType+"\nMatch Type: "+matchType+"\n";
	}
	
	public String toString()
	{
		return "\nPlayers: "+play+"\nKill(1st Player): "+firstPlayer+"\nKill(2nd Player): "+secondPlayer+"\nWinner: "+winner()+"\nKill Ratio(1st/2nd): "+(double)firstPlayer/secondPlayer+"\n";
	}
	
	
	

}

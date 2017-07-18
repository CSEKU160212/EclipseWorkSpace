package Problem_2;

import java.util.ArrayList;

import javax.security.auth.kerberos.KerberosKey;

public class MatchType extends FarCry  implements Reasult{

	public String mtype;
	public String plr;
	public double fplayer;
	public double splayer;
	
	
	
	
	
	static ArrayList<MatchType>player=new ArrayList<MatchType>();
	public MatchType(String gameName, String gtype,String mtype) {
		super(gameName);
		super.setType(gtype);
		this.mtype=mtype;
		
	}
	
	public MatchType(String gameName, String plr, double fplayer, double splayer) {
		super(gameName);
		this.plr=plr;
		this.fplayer = fplayer;
		this.splayer=splayer;
	}
	public double calc()
	{
		if(fplayer>splayer)
			return fplayer/splayer;
		else
			return splayer/fplayer;
			
		
	}
	public String K()
	{
		String a="player one won";
		String bString="player two won";
		if(fplayer>splayer)
			return a;
		else
			return bString;
	}
	

	
	@Override
	public String toString() {
	
		return "\nplayers:"+this.plr+"\nKill(1st player):"+this.fplayer+"\nKill(2nd player):"+this.splayer+"\nWinner:"+K()+"\nKill ratio:"+calc();
	}

	@Override
	public String getGameDetails() {
		
		return super.toString()+"\nMatch Type:"+this.mtype;
	}
	
	

}

package Problem_2;

import java.util.Random;

public class ScoreDemo {
	public static void main(String[] args) {
		Random random=new Random();
		MatchType match1=new MatchType("Far Cry 2", "Multiplayer", "DeathMatch");
		
		MatchType.player.add(new MatchType("Far Cry 2","Nephilim(Grenade Launcher) vs SKF(Assult Rifle)",71,17));
		MatchType.player.add(new MatchType("Far Cry 2","Creatine(Assult Rifle) vs Spider(Assult Rifle)",random.nextInt(50),random.nextInt(50)));
		MatchType.player.add(new MatchType("Far Cry 2","rCr(Sniper Rifle) vs Dijkstra(Shotgun)",random.nextInt(60),random.nextInt(60)));

		System.out.println(match1.getGameDetails());
		for(MatchType i:MatchType.player){
			System.out.println(i);
		}
	}
}

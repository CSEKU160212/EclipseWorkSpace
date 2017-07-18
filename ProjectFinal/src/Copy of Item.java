import java.io.Serializable;

public class Item implements Serializable,Comparable<Item>{
    private String title;
    private int playingTime;

   public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
    }
   
   public String getTitle() {
	return title;
}

public int getPlayingTime() {
	return playingTime;
}

public int compareTo(Item aThat){
	return this.title.compareTo(aThat.title);
   }

   public String  toString()
    {
        return title + " (" + playingTime + " mins)\n";
    }
}

package cd.video;

import java.io.Serializable;

public class Item implements Serializable{
    private String title;
    private int playingTime;

    public Item() {
    }
    
   public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
    }

   public String  toString()
    {
        return title + " (" + playingTime + " mins)\n";
    }
}

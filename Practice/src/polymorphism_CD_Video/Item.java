package polymorphism_CD_Video;

public class Item {
    private String title;
    private int playingTime;

   public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
    }

   public String  toString()
    {
        return title + " (" + playingTime + " mins)\n";
    }
}

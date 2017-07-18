package CD_iTEM;

public class Item implements Comparable<Item>,Title{
    private String title;
    private int playingTime;

   public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
    }

 public int compareTo(Item athat){
  if(this.playingTime>athat.playingTime)
   {
     return 1;
   }
  if(this.playingTime<athat.playingTime ){
    return -1;
  }
  else{
  return this.title.compareTo(athat.title);
  }
   }
     //@override
   public String getTitle(){
   return this.title;
   }
   //@override
   public void setTitle(String tile){
   this.title=title;
   }
   
   
   public String  toString()
    {
        return title + " (" + playingTime + " mins)\n";
    }
}



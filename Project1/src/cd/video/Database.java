
package cd.video;

import java.util.*;
public class Database {
    private ArrayList<CD> cdItems;
    private ArrayList<Video> videoItems;


   public Database()  {
        cdItems = new ArrayList();
        videoItems = new ArrayList();
    }

   public void addCDItem(CD theItem)  {
        cdItems.add(theItem);
    }
   public void addVideoItem(Video theItem)  {
        videoItems.add(theItem);
    }
   public ArrayList<CD> getCD()
   {
       return cdItems;
   }
   public ArrayList<Video> getVideo()
   {
       return videoItems;
   }
   public String getCDs() {
     String result = "";
        for(Iterator iter = cdItems.iterator(); iter.hasNext(); )  {
            CD item = (CD)iter.next();
            result += item.toString();
        }
        return result;
    }
   
   public String getVideos() {
     String result = "";
          for(Iterator iter = videoItems.iterator(); iter.hasNext(); )  {
            Video item = (Video)iter.next();
            result += item.toString();
        }
    return result;
    }
    @Override
   public String toString() {
   String result = "";
        for(Iterator iter = cdItems.iterator(); iter.hasNext(); )  {
            CD item = (CD)iter.next();
            result += item.toString();
        }
        for(Iterator iter = videoItems.iterator(); iter.hasNext(); )  {
            Video item = (Video)iter.next();
            result += item.toString();
        }
    return result;
    }
}

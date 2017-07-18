import java.io.Serializable;
import java.util.*;

import javax.swing.JTextArea;


public class Database implements Serializable{
    public ArrayList<CD> cdItems;
    public ArrayList<Video> videoItems;

 public Database()  {
        cdItems = new ArrayList<CD>();
        videoItems = new ArrayList<Video>();
    }

   public void addCDItem(CD theItem)  {
        cdItems.add(theItem);
    }
   public void addVideoItem(Video theItem)  {
        videoItems.add(theItem);
    }
   public void sortItem() {
		Collections.sort(cdItems);
		Collections.sort(videoItems);
	}
   public CD getCdItem(int n){
	   CD c=cdItems.get(n-1);
	return c;
   }
   public String getVideoItem(int n){
	   Video c=videoItems.get(n-1);
	   String s=c.toString();
	return s;
   }
   public int cdListArrayLength(){
	   return cdItems.size();
   }
   public int videoListArrayLength(){
	   return videoItems.size();
   }
   public CD getFirstCdItem(){
	  CD c=cdItems.get(0);
	  return c;
   }
   public CD getLastCdItem(){
	   int t=cdItems.size();
		  CD c=cdItems.get(t-1);
		  return c;
	   }
   public Video getFirstVideoItem(){
		  Video c=videoItems.get(0);
		  return c;
	   }
   public Video getLastVideoItem(){
	   int t=videoItems.size();
		  Video c=videoItems.get(t-1);
		  return c;
	   }
   public CD previousCdItem(int n){
	   CD c=cdItems.get(n-2);
	   return c;
   }
   public Video previousVideoItem(int n){
	   Video c=videoItems.get(n-2);
	   return c;
   }
   public CD nextCdItem(int n){
	   CD c=cdItems.get(n);
	   return c;
   }
   public Video nextVideoItem(int n){
	   Video c=videoItems.get(n);
	   return c;
   }
   public CD editCdItem(CD item,int n){
	   CD c=cdItems.set(n-1,item);
	   return c;
   }
   public Video editVideoItem(Video item,int n){
	   Video v=videoItems.set(n-1,item);
	   return v;
   }
   public void removeCdItem(String s){
	   try{
       for(Iterator iter = cdItems.iterator(); iter.hasNext(); ) 
     {
         CD item = (CD)iter.next();
         String se= item.getTitle();
         if (se.contains(s)) 
           cdItems.remove(item);
     }
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
 }
   public void removeVideoItem(String s){
       for(Iterator iter = videoItems.iterator(); iter.hasNext(); ) 
     {
         Video item = (Video)iter.next();
         String se= item.getTitle();
         if (se.contains(s)) 
           videoItems.remove(item);
     }
 }
   public String searchCdItem(String s) {
	      String result = "";
	          for(Iterator iter = cdItems.iterator(); iter.hasNext(); ) 
	        {
	            CD item = (CD)iter.next();
	            String se= item.getTitle();
	            if (se.contains(s)) 
	            {
	              result += item.toString();
	            }
	        }
	          return result;
	    }
   public String searchVideoItem(String s) {
	      String result = "";
	          for(Iterator iter = videoItems.iterator(); iter.hasNext(); ) 
	        {
	            Video item = (Video)iter.next();
	            String se= item.getTitle();
	            if (se.contains(s)) 
	            {
	              result += item.toString();
	            }
	        }
	          return result;
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

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
   public void sort() {
		Collections.sort(cdItems);
		Collections.sort(videoItems);
	}
   public CD getcd(int n){
	   CD c=cdItems.get(n-1);
	return c;
   }
   public String getvideo(int n){
	   Video c=videoItems.get(n-1);
	   String s=c.toString();
	return s;
   }
   public int cdlength(){
	   return cdItems.size();
   }
   public int videolngth(){
	   return videoItems.size();
   }
   public CD getfirstcd(){
	  CD c=cdItems.get(0);
	  return c;
   }
   public CD getlastcd(){
	   int t=cdItems.size();
		  CD c=cdItems.get(t-1);
		  return c;
	   }
   public Video getfirstvideo(){
		  Video c=videoItems.get(0);
		  return c;
	   }
   public Video getlastvideo(){
	   int t=videoItems.size();
		  Video c=videoItems.get(t-1);
		  return c;
	   }
   public CD previouscd(int n){
	   CD c=cdItems.get(n-2);
	   return c;
   }
   public Video previousvideo(int n){
	   Video c=videoItems.get(n-2);
	   return c;
   }
   public CD nextcd(int n){
	   CD c=cdItems.get(n);
	   return c;
   }
   public Video nextvideo(int n){
	   Video c=videoItems.get(n);
	   return c;
   }
   public CD editcd(CD item,int n){
	   CD c=cdItems.set(n-1,item);
	   return c;
   }
   public Video editvideo(Video item,int n){
	   Video v=videoItems.set(n-1,item);
	   return v;
   }
   public void removecd(String s){
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
   public void removevideo(String s){
       for(Iterator iter = videoItems.iterator(); iter.hasNext(); ) 
     {
         Video item = (Video)iter.next();
         String se= item.getTitle();
         if (se.contains(s)) 
           videoItems.remove(item);
     }
 }
   public String searchcd(String s) {
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
   public String searchvideo(String s) {
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

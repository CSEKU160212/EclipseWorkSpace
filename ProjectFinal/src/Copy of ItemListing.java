import javax.swing.*;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class ItemListing implements Serializable {
 JTextArea text;
 Database database;
 
 public ItemListing(JTextArea text, Database database) {
  this.text = text;
  this.database = database;
 }
 
 public void addCDItem(CD item) {
  database.addCDItem (item);
 }
 public void addVideoItem(Video item) {
  database.addVideoItem (item);
 }
 public void showCDItem() {
      text.setText (database.getCDs());
 }
 public void showVideoItem() {
  text.setText (database.getVideos());
 }
 public void showAllItem() {
  text.setText (database.getCDs()+database.getVideos());
 }
 public int cdlength(){
	 return database.cdlength();
 }
 public int videolength(){
	 return database.videolngth();
 }
 public void removecd(String item){
	 database.removecd(item);
	 text.setText("done");
 }
 public void removevideo(String item){
	 database.removevideo(item);
	 text.setText("done");
 }
 public CD getcd(int n){
	 text.setText("Showed "+n+" no CD.");
	 return database.getcd(n);
 }
 public void getvideo(int n){
	 String s=database.getvideo(n);
	 text.setText(s);
 }
 public CD firstcd(){
	 text.setText("Showed First CD");
	 return database.getfirstcd();
 }
 public Video firstvideo(){
	 text.setText("Showed First Video.");
	 return database.getfirstvideo();
 }
 public CD lastcd(){
	 text.setText("Showed last CD");
	 return database.getlastcd();
 }
 public Video lastvideo(){
	 text.setText("Showed last Video");
	 return database.getlastvideo();
 }
 public CD previouscd(int n){
	 text.setText("Showed Previous CD.");
	 return database.previouscd(n);
 }
 public CD nextcd(int n){
	 text.setText("Showed next CD.");
	 return database.nextcd(n);
 }
 public Video nextvideo(int n){
	 text.setText("Showed next Video.");
	 return database.nextvideo(n);
 }
 public Video previousvideo(int n){
	 text.setText("Showed Previous CD.");
	 return database.previousvideo(n);
 }
 public CD EditCD(CD item,int n){
	 text.setText("Edited");
	 return database.editcd(item,n);

 }
 public Video EditVideo(Video item,int n){
	 text.setText("Edited");
	  return database.editvideo(item,n);
 }
 public void sort(){
	 database.sort();
	 text.setText("done");
 }
 public void searchcd(String item){
	String s=database.searchcd(item);
	text.setText(s);
	 System.out.println(s);
 }
 public void searchvideo(String item) {
		String s=database.searchvideo(item);
		text.setText(s);
		 System.out.println(s);
		
	}
 public void saveAllItem(){
	   try{
	   FileOutputStream in = new FileOutputStream("stu.ser");
	      ObjectOutputStream out = new ObjectOutputStream(in);
	      out.writeObject(database);
	      out.close();
	      text.setText("done");
	   }
	   catch(Exception e){                    
	     e.printStackTrace();
	   }
	   
	 }
public void loadAllItem(){
	   try{   
	   FileInputStream iin = new FileInputStream("stu.ser");
	      ObjectInputStream in = new ObjectInputStream(iin);
	     database=(Database)in.readObject();
	     text.setText(database+"");
	      in.close();
	   }
	   catch(Exception e){
	     e.printStackTrace();
	   }
	 }
}

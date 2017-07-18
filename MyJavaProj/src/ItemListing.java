import javax.swing.*;

import java.io.EOFException;
import java.io.File;
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
 public int cdListArrayLength(){
	 return database.cdListArrayLength();
 }
 public int videoListArrayLength(){
	 return database.videoListArrayLength();
 }
 public void removeCdItem(String item){
	 database.removeCdItem(item);
	 text.setText("Done");
 }
 public void removeVideoItem(String item){
	 database.removeVideoItem(item);
	 text.setText("Done");
 }
 public CD getCdItem(int n){
	 text.setText("Showed "+n+" no CD.");
	 return database.getCdItem(n);
 }
 public void getVideoItem(int n){
	 String s=database.getVideoItem(n);
	 text.setText(s);
 }
 public CD firstCdItem(){
	 text.setText("Showed CD");
	 return database.getFirstCdItem();
 }
 public Video firstVideoItem(){
	 text.setText("Showed Video.");
	 return database.getFirstVideoItem();
 }
 public CD lastCdItem(){
	 text.setText("Showed CD");
	 return database.getLastCdItem();
 }
 public Video lastVideoItem(){
	 text.setText("Showed Video");
	 return database.getLastVideoItem();
 }
 public CD previousCdItem(int n){
	 text.setText("Showed CD.");
	 return database.previousCdItem(n);
 }
 public CD nextCdItem(int n){
	 text.setText("Showed CD.");
	 return database.nextCdItem(n);
 }
 public Video nextVideoItem(int n){
	 text.setText("Showed Video.");
	 return database.nextVideoItem(n);
 }
 public Video previousVideoItem(int n){
	 text.setText("Showed CD.");
	 return database.previousVideoItem(n);
 }
 public CD editCDItem(CD item,int n){
	 text.setText("Edited");
	 return database.editCdItem(item, n);

 }
 public Video EditVideo(Video item,int n){
	 text.setText("Edited");
	  return database.editVideoItem(item, n);
 }
 public void sortItem(){
	 database.sortItem();
	 text.setText("Done");
 }
 public void searchCdItem(String item){
	String s=database.searchCdItem(item);
	text.setText(s);
	 System.out.println(s);
 }
 public void searchVideoItem(String item) {
		String s=database.searchVideoItem(item);
		text.setText(s);
		 System.out.println(s);
		
	}
 public void saveAllItem(){
	   try{
	   FileOutputStream in = new FileOutputStream("Cd_video.ser");
	      ObjectOutputStream out = new ObjectOutputStream(in);
	      out.writeObject(database);
	      out.close();
	      text.setText("Done");
	   }
	   catch(Exception e){                    
	     e.printStackTrace();
	   }
	   
	 }
public void loadAllItem(){
	   try{   
	   FileInputStream iin = new FileInputStream("Cd_video.ser");
	      ObjectInputStream in = new ObjectInputStream(iin);
	     database=(Database)in.readObject();
	     text.setText("Loaded");
	      in.close();
	   }
	   catch(Exception e){
	     e.printStackTrace();
	   }
	 }
}

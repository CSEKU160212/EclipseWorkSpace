import javax.swing.*;

class ItemListing {
 JTextArea text;
 Database database;
 
 public ItemListing(JTextArea text, Database database) {
  this.text = text;
  this.database = database;
 }
 
 public void addCDItem(CD item) {
  database.addCDItem (item);
  text.setText (database.getCDs());
 }
 public void addVideoItem(Video item) {
  database.addVideoItem (item);
  text.setText (database.getVideos());
 }
}
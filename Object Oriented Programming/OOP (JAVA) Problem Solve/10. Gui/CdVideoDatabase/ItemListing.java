import javax.swing.*;

class ItemListing {
 JTextArea text;
 Database database;
 
 public ItemListing(JTextArea text, Database database) {
  this.text = text;
  this.database = database;
 }
 
 public void addItem(Item item) {
  database.addItem (item);
  text.setText (database.toString());
 }
}
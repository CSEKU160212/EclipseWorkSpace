import javax.swing.*;

import java.awt.event.*;

class CDPanel extends ItemPanel  implements ActionListener {
	TextEntry artist = new TextEntry("Enter the artist ");
	 IntEntry nTracks = new IntEntry("Enter the number of tracks ");
 JTextField sEnterBox=new JTextField(3);
 
 public CDPanel(ItemListing listing) {
  super("CD Entry", listing);
  add(artist);
  add(nTracks);
  JPanel panel=new JPanel();
  
  JButton addButton = new JButton("Add");
  addButton.setActionCommand("Add");
  addButton.addActionListener(this);
  panel.add(addButton);
  
  JButton editButton = new JButton("Edit");
  editButton.setActionCommand("Edit");
  editButton.addActionListener(this);
  panel.add(editButton);
  
  JButton deleteButton = new JButton("Delete");
  deleteButton.setActionCommand("Delete");
  deleteButton.addActionListener(this);
  panel.add(deleteButton);
  
  JButton searchButton = new JButton("Search");
  searchButton.setActionCommand("Search");
  searchButton.addActionListener(this);
  panel.add(searchButton);
  
  JPanel panel2=new JPanel();
  
  JButton b1 = new JButton("|<");
  b1.setActionCommand("|<");
  b1.addActionListener(this);
  panel2.add(b1);
  
  JButton b2 = new JButton("<");
  b2.setActionCommand("<");
  b2.addActionListener(this);
  panel2.add(b2);
  
  panel2.add(sEnterBox);
  
  JButton b3 = new JButton(">");
  b3.setActionCommand(">");
  b3.addActionListener(this);
  panel2.add(b3);
  
  JButton b4 = new JButton(">|");
  b4.setActionCommand(">|");
  b4.addActionListener(this);
  panel2.add(b4);
  
  add(panel2);
  add(panel);
 }
 public void setArrayValue(int n){
	 sEnterBox.setText(Integer.toString(n));
 }
 public int getArrayValue(){
	 return Integer.parseInt(sEnterBox.getText());
 }
 public void getNextValue(){
	 int j=listing.videoListArrayLength();
	 int i=Integer.parseInt(sEnterBox.getText());
	 if(i<j){
	 i+=1;
	 sEnterBox.setText(Integer.toString(i));
	 }
	 else
		 sEnterBox.setText(Integer.toString(i));
 }
 public void getPreviousValue(){
	 int i=Integer.parseInt(sEnterBox.getText());
	 if(i>1){
		 i-=1;
		 sEnterBox.setText(Integer.toString(i));
	 }
	 else
		 sEnterBox.setText(Integer.toString(i));
 }
 public void setItem(CD c){
	title.setValue(c.getTitle());
	artist.setValue(c.getArtist());
	nTracks.setIntValue(c.getNumberOfTracks());
	playingTime.setIntValue(c.getPlayingTime());
 }
 public CD getItem() {
  return new CD(title.getValue(),artist.getValue(),nTracks.getIntValue(),
   playingTime.getIntValue ());
 }
 public void actionPerformed(ActionEvent ae) {
	 if ("Add".equals(ae.getActionCommand()))
              listing.addCDItem (getItem());
	 else if ("Search".equals(ae.getActionCommand()))
              listing.searchCdItem(title.getValue());
	 else if ("Delete".equals(ae.getActionCommand()))
         listing.removeCdItem(title.getValue());
	 else if ("Edit".equals(ae.getActionCommand()))
         listing.editCDItem(getItem(),getArrayValue());
	 else if ("|<".equals(ae.getActionCommand())){
         setItem(listing.firstCdItem());
         setArrayValue(1);
	 }
	 else if ("<".equals(ae.getActionCommand())){
         setItem(listing.previousCdItem(getArrayValue()));
         getPreviousValue();
	 }
	 else if (">".equals(ae.getActionCommand())){
         setItem(listing.nextCdItem(getArrayValue()));
         getNextValue();
	 }
	 else if (">|".equals(ae.getActionCommand())){
         setItem(listing.lastCdItem());
         setArrayValue(listing.cdListArrayLength());
	 }
	 
 }
}

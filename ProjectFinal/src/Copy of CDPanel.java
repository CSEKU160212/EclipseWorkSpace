import javax.swing.*;

import java.awt.event.*;

class CDPanel extends ItemPanel  implements ActionListener {
	TextEntry artist = new TextEntry("Enter the artist ");
	 IntEntry nTracks = new IntEntry("Enter the number of tracks ");
 JTextField jn=new JTextField(3);
 
 public CDPanel(ItemListing listing) {
  super("CD Entry", listing);
  add(artist);
  add(nTracks);
  JPanel j=new JPanel();
 
  JButton aButton = new JButton("ADD");
  aButton.setActionCommand("ADD");
  aButton.addActionListener(this);
  j.add(aButton);
  JButton s = new JButton("SEARCH");
  s.setActionCommand("SEARCH");
  s.addActionListener(this);
  j.add(s);
  add(j);
 }
 public void setarrayvalue(int n){
	 jn.setText(Integer.toString(n));
 }
 public int getarrayvalue(){
	 return Integer.parseInt(jn.getText());
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
	 if ("ADD".equals(ae.getActionCommand()))
              listing.addCDItem (getItem());
	 else if ("SEARCH".equals(ae.getActionCommand()))
              listing.searchcd(title.getValue());
 }
}

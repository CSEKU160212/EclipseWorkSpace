import javax.swing.*;
import java.awt.event.*;

class commandPanel extends JPanel implements ActionListener {
  ItemListing listing;
  
 public commandPanel(ItemListing n_listing) {
  this.listing = n_listing;
  
  JButton CDbutton = new JButton("CD");
  CDbutton.setActionCommand("CD");
  CDbutton.addActionListener(this);
  add(CDbutton);
  
  JButton Videobutton = new JButton("Video");
  Videobutton.setActionCommand("Video");
  Videobutton.addActionListener(this);
  add(Videobutton);
  
  JButton allbutton = new JButton("All");
  allbutton.setActionCommand("All");
  allbutton.addActionListener(new myListener(listing));
  add(allbutton);
  
  JButton save = new JButton("SAVE");
  save.setActionCommand("SAVE");
  save.addActionListener(this);
  add(save);
  
  JButton load = new JButton("LOAD");
  load.setActionCommand("LOAD");
  load.addActionListener(this);
  add(load);
  
  JButton sort = new JButton("SORT");
  sort.setActionCommand("SORT");
  sort.addActionListener(this);
  add(sort);
 }
 public void actionPerformed(ActionEvent e) {
   if ("CD".equals(e.getActionCommand()))
     listing.showCDItem ();
   else if ("Video".equals(e.getActionCommand())) 
     listing.showVideoItem ();
   else if ("All".equals(e.getActionCommand()))
     listing.showAllItem ();
   else if ("SAVE".equals(e.getActionCommand()))
     listing.saveAllItem();
   else if ("LOAD".equals(e.getActionCommand()))
	 listing.loadAllItem();
   else if ("SORT".equals(e.getActionCommand()))
		 listing.sort();


 }
}

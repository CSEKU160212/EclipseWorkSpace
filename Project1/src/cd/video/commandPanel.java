package cd.video;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class commandPanel extends JPanel implements ActionListener {
  ItemListing listing;
  
 public commandPanel(ItemListing n_listing) {
  this.listing = n_listing;
  
  JButton save = new JButton("Save");
  save.setActionCommand("save");
  save.addActionListener(new myListener(listing));
  add(save);
  
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
  
  JButton load = new JButton("Load");
  load.setActionCommand("load");
  load.addActionListener(new myListener(listing));
  add(load);
 }
 public void actionPerformed(ActionEvent e) {
   if ("CD".equals(e.getActionCommand()))
     listing.showCDItem ();
   else if ("Video".equals(e.getActionCommand())) 
     listing.showVideoItem ();
//   else if ("save".equals(e.getActionCommand()))
//   {
//     Database data = listing.getDatabase();
//     
//   }
  // else if ("All".equals(e.getActionCommand()))
   //  listing.showAllItem ();
 }
}

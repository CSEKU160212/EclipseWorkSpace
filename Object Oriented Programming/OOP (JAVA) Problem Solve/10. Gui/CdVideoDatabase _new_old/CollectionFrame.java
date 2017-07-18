import javax.swing.*;
import java.awt.*;

public class CollectionFrame extends JFrame{
 VideoPanel videoPanel;
 CDPanel cdPanel;
 Database database = new Database();
 JTextArea listing = new JTextArea(10,30);
 
 public CollectionFrame () {
  ItemListing itemListing = new ItemListing(listing, database);
  videoPanel = new VideoPanel(itemListing);
  cdPanel = new CDPanel(itemListing);

  Container cp = getContentPane();
  cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));

  JPanel entryPanel = new JPanel();
  entryPanel.add(cdPanel); 
  entryPanel.add(videoPanel);
  cp.add(entryPanel);
    
  JScrollPane sp = new JScrollPane(listing);
  cp.add(sp);
  
  pack();
  setVisible(true);
 }
}

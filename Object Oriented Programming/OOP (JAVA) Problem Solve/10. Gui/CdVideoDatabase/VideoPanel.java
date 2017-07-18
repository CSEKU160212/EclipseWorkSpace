import javax.swing.*;
import java.awt.*;

class VideoPanel extends ItemPanel {
 TextEntry director = new TextEntry("Enter the director ");
 
 public VideoPanel(ItemListing listing) {
  super("Video Entry", listing);
  add(director);
  JButton button = new JButton("Create the Video");
  button.addActionListener(this);
  add(button);
 }
 
 public Item getItem() {
  return new Video(title.getValue(), 
   director.getValue(),playingTime.getIntValue ());
 }
}
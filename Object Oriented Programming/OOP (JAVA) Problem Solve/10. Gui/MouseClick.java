import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseClick extends JFrame implements MouseListener { 
  private JLabel statusBar; 
  
  public MouseClick() { 
    statusBar = new JLabel(); 
    getContentPane().add( statusBar, BorderLayout.SOUTH );         
    addMouseListener( this ); //listens own mouse and 
    setSize(300,300); 
    setVisible(true); 
  } 
  public void mouseClicked(MouseEvent event) { 
    statusBar.setText("Clicked at [" + event.getX() + ", " + event.getY() + "]"); 
  } 
  public void mousePressed(MouseEvent event) {statusBar.setText("Mouse Pressed");}
  public void mouseReleased(MouseEvent event) {statusBar.setText("Mouse released");}
  public void mouseEntered(MouseEvent event) {statusBar.setText("Mouse Entered"); }
  public void mouseExited(MouseEvent event) {statusBar.setText("Mouse Exited");}
  
  public static void main(String[] args) { 
    MouseClick application = new MouseClick(); 
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  } 
}

import javax.swing.*;
import java.awt.*;
class GridLayoutDemo extends JFrame { 
   public GridLayoutDemo() { 
     setTitle("Borer Layout Demo");
     setSize(300, 200);
     Container contentPane = getContentPane();
       
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     contentPane.setLayout(new GridLayout(0,2));
     contentPane.add(new JButton("Button 1"));
     contentPane.add(new JButton("2"));
     contentPane.add(new JButton("Button 3"));
     contentPane.add(new JButton("Long-Named Button 4")); 
     contentPane.add(new JButton("Button 5")); 

    }
}
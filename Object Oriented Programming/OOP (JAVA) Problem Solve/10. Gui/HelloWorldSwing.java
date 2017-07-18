import javax.swing.*; 
public class HelloWorldSwing { 
 public static void main(String[] args) {  
  JFrame frame = new JFrame("HelloWorld"); 
  JLabel label = new JLabel("Hello World");  
  frame.getContentPane().add(label);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  frame.setBounds(200, 200, 100, 80);
  frame.setVisible(true);  
 } 
} 

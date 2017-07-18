import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MC extends JFrame implements ActionListener {
    private int noClicks = 0;
    private JButton button = new JButton("click me !");
    private JTextArea textArea = new JTextArea(5, 40);
    private JLabel label = new JLabel("Here you can see the number of button clicks") ;
    private JProgressBar progressBar =  new JProgressBar(JProgressBar.HORIZONTAL);

    public MC(String title) {
        super(title);
        setSize(300, 200);
        Container cp = getContentPane();
        cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));
        cp.add(button);
        JScrollPane scrollPane = new JScrollPane(textArea);
        cp.add(scrollPane);cp.add(label); cp.add(progressBar);
        button.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) { 
        noClicks++;
        textArea.append("Button clicked  " + noClicks + 
      "  times so far  \n");
        label.setText("You clicked " + noClicks + " times");
        progressBar.setValue(noClicks);
    } 
}

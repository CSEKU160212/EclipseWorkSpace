//********************************************************************
//  ButtonBar.java       Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #1
//
//  Represents the primary toolbar of controls for PaintBox.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonBar extends JToolBar
{
   private JRadioButton selectButton, lineButton, ovalButton;
   private JRadioButton rectButton, polyButton;
   private JButton strokeButton;

   //-----------------------------------------------------------------
   //  Sets up the panel of buttons.
   //-----------------------------------------------------------------
   public ButtonBar ()
   {
      ButtonListener listener = new ButtonListener ();

      ButtonGroup shapeGroup = new ButtonGroup ();

      selectButton = new JRadioButton (
                            new ImageIcon ("../images/selectOn.gif"));
      selectButton.addActionListener (listener);

      lineButton = new JRadioButton (
                                new ImageIcon ("../images/line.gif"));
      lineButton.addActionListener (listener);

      ovalButton = new JRadioButton (
                                new ImageIcon ("../images/oval.gif"));
      ovalButton.addActionListener (listener);

      rectButton = new JRadioButton (
                                new ImageIcon ("../images/rect.gif"));
      rectButton.addActionListener (listener);

      polyButton = new JRadioButton (
                                new ImageIcon ("../images/poly.gif"));
      polyButton.addActionListener (listener);

      strokeButton = new JButton (" Stroke ");
      strokeButton.setBackground (Color.black);
      strokeButton.setForeground (Color.white);
      strokeButton.addActionListener (listener);

      add (selectButton);
      add (new JToolBar.Separator ());
      add (lineButton);
      add (ovalButton);
      add (rectButton);
      add (polyButton);
      add (new JToolBar.Separator ());
      add (strokeButton);

      setFloatable (false);
   }

   //*****************************************************************
   //  An inner class to handle button events.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Responds to action events caused by buttons.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         //  to be implemented
      }
   }
}

//********************************************************************
//  ButtonBar.java       Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Represents the primary toolbar of controls for PaintBox.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonBar extends JToolBar
{
   public static final int LINE = 0;
   public static final int OVAL = 1;
   public static final int RECT = 2;
   public static final int POLY = 3;
   public static final int COLOR = -1;
   public static final int SELECT = -2;

   private JRadioButton selectButton, lineButton, ovalButton;
   private JRadioButton rectButton, polyButton;
   private JButton strokeButton;

   private int currentButton;
   private Color currentStrokeColor;

   //-----------------------------------------------------------------
   //  Sets up the panel of buttons.
   //-----------------------------------------------------------------
   public ButtonBar ()
   {
      currentButton = SELECT;
      currentStrokeColor = Color.black;

      ButtonListener listener = new ButtonListener ();

      ButtonGroup shapeGroup = new ButtonGroup ();

      selectButton = new JRadioButton (
                              new ImageIcon ("../images/select.gif"));
      selectButton.setSelectedIcon (
                            new ImageIcon ("../images/selectOn.gif"));
      selectButton.setToolTipText ("Select tool");
      selectButton.addActionListener (listener);
      selectButton.setSelected(true);

      lineButton = new JRadioButton (
                                new ImageIcon ("../images/line.gif"));
      lineButton.setSelectedIcon (
                              new ImageIcon ("../images/lineOn.gif"));
      lineButton.setToolTipText ("Line tool");
      lineButton.addActionListener (listener);

      ovalButton = new JRadioButton (
                                new ImageIcon ("../images/oval.gif"));
      ovalButton.setSelectedIcon (
                              new ImageIcon ("../images/ovalOn.gif"));
      ovalButton.setToolTipText ("Oval tool");
      ovalButton.addActionListener (listener);

      rectButton = new JRadioButton (
                                new ImageIcon ("../images/rect.gif"));
      rectButton.setSelectedIcon (
                              new ImageIcon ("../images/rectOn.gif"));
      rectButton.setToolTipText ("Rectangle tool");
      rectButton.addActionListener (listener);

      polyButton = new JRadioButton (
                                new ImageIcon ("../images/poly.gif"));
      polyButton.setSelectedIcon (
                              new ImageIcon ("../images/polyOn.gif"));
      polyButton.setToolTipText ("Polyline tool");
      polyButton.addActionListener (listener);

      strokeButton = new JButton (" Stroke ");
      strokeButton.setToolTipText ("Stroke color tool");
      strokeButton.setBackground (Color.black);
      strokeButton.setForeground (Color.white);
      strokeButton.addActionListener (listener);

      shapeGroup.add (selectButton);
      shapeGroup.add (lineButton);
      shapeGroup.add (ovalButton);
      shapeGroup.add (rectButton);
      shapeGroup.add (polyButton);

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

   //-----------------------------------------------------------------
   //  Returns the currently toggled button.
   //-----------------------------------------------------------------
   public int getButton ()
   {
      return currentButton;
   }

   //-----------------------------------------------------------------
   //  Returns the current stroke color.
   //-----------------------------------------------------------------
   public Color getStrokeColor ()
   {
      return currentStrokeColor;
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
         Object source = event.getSource ();

         if (source == selectButton)
            currentButton = SELECT;

         else if (source == lineButton)
            currentButton = LINE;

         else if (source == ovalButton)
            currentButton = OVAL;

         else if (source == rectButton)
            currentButton = RECT;

         else if (source == polyButton)
            currentButton = POLY;

         else if (source == strokeButton)
         {
            Color returnedColor = JColorChooser.showDialog (
                (Component) event.getSource (),
                "Set the stroke color:",  Color.black);

            if (returnedColor != null)
            {
                currentStrokeColor = returnedColor;

                int rgbValue = returnedColor.getRed () +
                               returnedColor.getGreen () +
                               returnedColor.getBlue ();

                if (rgbValue < 250)
                    strokeButton.setForeground (Color.white);
                else
                    strokeButton.setForeground (Color.black);

                strokeButton.setBackground (currentStrokeColor);
            }
         }
      }
   }
}

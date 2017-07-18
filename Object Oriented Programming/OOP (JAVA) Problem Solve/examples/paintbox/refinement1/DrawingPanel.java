//********************************************************************
//  DrawingPanel.java     Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #1
//
//  Represents the primary drawing area for PaintBox.
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel
{
   public static final int DRAWAREA = 400;

   //-----------------------------------------------------------------
   //  Sets up the drawing area.
   //-----------------------------------------------------------------
   public DrawingPanel ()
   {
      setBackground (Color.white);
      setMinimumSize (new Dimension (DRAWAREA, DRAWAREA));
      setPreferredSize (new Dimension (DRAWAREA, DRAWAREA));
   }
}

//********************************************************************
//  PaintBox.java       Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Main driver of the PaintBox application.
//********************************************************************

import PaintFrame;
import java.awt.event.*;

public class PaintBox
{
   //-----------------------------------------------------------------
   //  Creates and displays the primary PaintBox window.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      PaintFrame frame = new PaintFrame ();
      frame.pack ();
      frame.setVisible (true);
      frame.setResizable (false);
   }
}

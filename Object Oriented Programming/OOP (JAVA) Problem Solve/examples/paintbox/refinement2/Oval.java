//********************************************************************
//  Oval.java       Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Represents and oval shape in the PaintBox application.
//********************************************************************

import java.io.*;
import java.awt.*;

public class Oval extends BoundedShape
{
   //-----------------------------------------------------------------
   //  Sets up the oval's color, position, and size.
   //-----------------------------------------------------------------
   public Oval (Color color, Point corner, int wide, int high)
   {
      super (color, corner, wide, high);
   }

   //-----------------------------------------------------------------
   //  Draws the oval.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      page.setColor (strokeColor);
      page.drawOval (upperLeft.x, upperLeft.y, width, height);
   }
}

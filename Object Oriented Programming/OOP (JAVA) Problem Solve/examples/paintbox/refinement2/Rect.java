//********************************************************************
//  Rect.java     Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Represents a rectangle shape io the PaintBox application.
//********************************************************************

import java.io.*;
import java.awt.*;

public class Rect extends BoundedShape
{
   //-----------------------------------------------------------------
   //  Sets up the rectangle's color, position, and size.
   //-----------------------------------------------------------------
   public Rect (Color color, Point corner, int wide, int high)
   {
      super (color, corner, wide, high);
   }

   //-----------------------------------------------------------------
   //  Draws the rectangle.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      page.setColor (strokeColor);
      page.drawRect (upperLeft.x, upperLeft.y, width, height);
   }
}

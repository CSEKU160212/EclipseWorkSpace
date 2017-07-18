//********************************************************************
//  BoundedShape.java     Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Represents any shape defined by a bounding rectangle.
//********************************************************************

import java.io.*;
import java.awt.*;

abstract class BoundedShape extends Shape
{
   protected Point upperLeft;
   protected int width, height;

   //-----------------------------------------------------------------
   //  Sets the color, position, and size of the shape.
   //-----------------------------------------------------------------
   public BoundedShape (Color color, Point corner, int wide, int high)
   {
      strokeColor = color;
      upperLeft = corner;
      width = wide;
      height = high;
   }

   //-----------------------------------------------------------------
   //  Sets the upper left point and the size of the shape. Allows
   //  for dragging in multiple directions.
   //-----------------------------------------------------------------
   public void setShape (Point firstPt, Point currentPt)
   {
      if (firstPt.x <= currentPt.x)
         if (firstPt.y <= currentPt.y)
            upperLeft = firstPt;
         else
            upperLeft = new Point (firstPt.x, currentPt.y);
      else
         if (firstPt.y <= currentPt.y)
            upperLeft = new Point (currentPt.x, firstPt.y);
         else
            upperLeft = currentPt;

      width = Math.abs (currentPt.x - firstPt.x);
      height = Math.abs (currentPt.y - firstPt.y);
   }
}

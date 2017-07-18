//********************************************************************
//  Shape.java       Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Represents a generic shape in the PaintBox application.
//********************************************************************

import java.awt.*;
import java.io.*;

abstract class Shape
{
   protected Color strokeColor;

   //-----------------------------------------------------------------
   //  Returns the current stroke color.
   //-----------------------------------------------------------------
   public Color getStrokeColor ()
   {
      return strokeColor;
   }

   //-----------------------------------------------------------------
   //  Abstract method for drawing a generic shape.
   //-----------------------------------------------------------------
   abstract public void draw (Graphics page);
}

//********************************************************************
//  Line.java       Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Represents a line shape in the PaintBox application.
//********************************************************************

import java.io.*;
import java.awt.*;

public class Line extends Shape
{
   protected Point firstPoint;
   protected Point secondPoint;

   //-----------------------------------------------------------------
   //  Sets up the line with a particular position and color.
   //-----------------------------------------------------------------
   public Line (Color color, Point p1, Point p2)
   {
      strokeColor = color;
      firstPoint = p1;
      secondPoint = p2;
   }

   //-----------------------------------------------------------------
   //  Sets the second point of the line.
   //-----------------------------------------------------------------
   public void setEndPoint (Point endPoint)
   {
     secondPoint = endPoint;
   }

   //-----------------------------------------------------------------
   //  Draws the line.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      page.setColor (strokeColor);
      page.drawLine (firstPoint.x, firstPoint.y, secondPoint.x,
                     secondPoint.y);
   }

}

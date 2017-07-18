//********************************************************************
//  Poly.java       Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Represents a polyline shape in the PaintBox application.
//********************************************************************

import java.io.*;
import java.awt.*;
import java.util.*;

public class Poly extends Shape
{
   private ArrayList xList = new ArrayList ();
   private ArrayList yList = new ArrayList ();

   //-----------------------------------------------------------------
   //  Sets the color of the polyline and adds a point to the list.
   //-----------------------------------------------------------------
   public Poly (Color color, int x, int y)
   {
      strokeColor = color;
      xList.add (new Integer (x));
      yList.add (new Integer (y));
   }

   //-----------------------------------------------------------------
   //  Adds a point to the list.
   //-----------------------------------------------------------------
   public void addPoint (int x, int y)
   {
      xList.add (new Integer (x));
      yList.add (new Integer (y));
   }

   //-----------------------------------------------------------------
   //  Changes the last point added to the list.
   //-----------------------------------------------------------------
   public void updateLastPoint (int x, int y)
   {
      xList.remove (xList.size ()-1);
      xList.add (new Integer (x));
      yList.remove (yList.size ()-1);
      yList.add (new Integer (y));
   }

   //-----------------------------------------------------------------
   //  Draws the polyline.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      int[] xtemp = new int[xList.size ()];
      int[] ytemp = new int[yList.size ()];

      //  Get the end points of the line segments and store them
      for (int index = 0; index < xList.size (); index++)
      {
         xtemp[index] = ((Integer) xList.get (index)).intValue ();
         ytemp[index] = ((Integer) yList.get (index)).intValue ();
      }

      //  Set the stroke color and draw the lines
      page.setColor (strokeColor);
      page.drawPolyline (xtemp, ytemp, xList.size ());
   }
}

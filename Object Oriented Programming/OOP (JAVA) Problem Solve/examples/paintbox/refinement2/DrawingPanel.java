//********************************************************************
//  DrawingPanel.java     Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #2
//
//  Represents the primary drawing area for PaintBox.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DrawingPanel extends JPanel implements MouseListener,
                                                MouseMotionListener
{
   public static final int DRAWAREA = 400;

   private ButtonBar buttonBar;
   private ArrayList drawnItems;
   private Shape currentShape;
   private Point basePoint, currentPoint;
   private int lastShape;

   //-----------------------------------------------------------------
   //  Sets up the drawing area.
   //-----------------------------------------------------------------
   public DrawingPanel (ButtonBar buttons)
   {
      buttonBar = buttons;

      drawnItems = new ArrayList ();

      lastShape = ButtonBar.SELECT;

      setBackground (Color.white);
      setMinimumSize (new Dimension (DRAWAREA, DRAWAREA));
      setPreferredSize (new Dimension (DRAWAREA, DRAWAREA));

      addMouseListener (this);
      addMouseMotionListener (this);
   }

   //-----------------------------------------------------------------
   //  Paints all shapes on the drawing panel.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);

      if (drawnItems.size () > 0)
         for (int index = 0; index <= drawnItems.size ()-1; index++)
            ((Shape) drawnItems.get (index)).draw (page);
   }

   //-----------------------------------------------------------------
   //  Handles a mouse pressed event by storing a new shape.
   //-----------------------------------------------------------------
   public void mousePressed (MouseEvent event)
   {
      int currentAction = buttonBar.getButton ();
      Color strokeColor = buttonBar.getStrokeColor ();

      basePoint = event.getPoint ();

      switch (currentAction)
      {
         case ButtonBar.SELECT:
            lastShape = ButtonBar.SELECT;
            break;

         case ButtonBar.LINE:
            currentShape = new Line (strokeColor, basePoint,
                                     basePoint);
            lastShape = ButtonBar.LINE;
            drawnItems.add (currentShape);
            break;

         case ButtonBar.OVAL:
            currentShape = new Oval (strokeColor, basePoint, 0, 0);
            lastShape = ButtonBar.OVAL;
            drawnItems.add (currentShape);
            break;

         case ButtonBar.RECT:
            currentShape = new Rect (strokeColor, basePoint, 0, 0);
            lastShape = ButtonBar.RECT;
            drawnItems.add (currentShape);
            break;

         case ButtonBar.POLY:
            if (lastShape == ButtonBar.POLY)
               ((Poly) currentShape).updateLastPoint (basePoint.x,
                                                      basePoint.y);
            else
            {
               lastShape = ButtonBar.POLY;
               currentShape = new Poly (strokeColor, basePoint.x,
                                        basePoint.y);
               drawnItems.add (currentShape);
            }

            ((Poly) currentShape).addPoint (basePoint.x, basePoint.y);
      }
      repaint ();
   }

   //-----------------------------------------------------------------
   //  Handles a mouse dragged event by rubberbanding the current
   //  shape being drawn.
   //-----------------------------------------------------------------
   public void mouseDragged (MouseEvent event)
   {
      int currentAction = buttonBar.getButton ();

      currentPoint = event.getPoint ();

      switch (currentAction)
      {
         case ButtonBar.LINE:
            ((Line) currentShape).setEndPoint (currentPoint);
            break;

         case ButtonBar.OVAL:
            ((Oval) currentShape).setShape (basePoint, currentPoint);
            break;

         case ButtonBar.RECT:
            ((Rect) currentShape).setShape (basePoint, currentPoint);
            break;

         case ButtonBar.POLY:
            ((Poly) currentShape).updateLastPoint (currentPoint.x,
                                                   currentPoint.y);
            break;
      }
      repaint ();
   }

   //-----------------------------------------------------------------
   //  Provide empty implementations for unused events.
   //-----------------------------------------------------------------
   public void mouseMoved (MouseEvent event) {}
   public void mouseReleased (MouseEvent event) {}
   public void mouseEntered (MouseEvent event) {}
   public void mouseExited (MouseEvent event) {}
   public void mouseClicked (MouseEvent event) {}
}

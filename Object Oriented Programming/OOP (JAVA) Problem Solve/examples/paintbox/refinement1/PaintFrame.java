//********************************************************************
//  PaintFrame.java       Author: Lewis and Loftus / Peter DePasquale
//
//  Refinement #1
//
//  Main driver of the PaintBox application.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PaintFrame extends JFrame
{
   private DrawingPanel drawingPanel;

   //-----------------------------------------------------------------
   //  Lays out and displays the primary PaintBox window.
   //-----------------------------------------------------------------
   public PaintFrame ()
   {
      super ("PaintBox - Refinement #1");

      ButtonBar buttons = new ButtonBar ();
      drawingPanel = new DrawingPanel ();
      JMenuBar menuBar = createMenuBar ();
      setJMenuBar (menuBar);

      JPanel appPanel = new JPanel ();
      appPanel.setLayout (new BorderLayout ());
      appPanel.add (drawingPanel, BorderLayout.CENTER);
      appPanel.add (buttons, BorderLayout.NORTH);

      getContentPane ().add (appPanel);
      addWindowListener (new WindowCloser ());
   }

   //-----------------------------------------------------------------
   //  Sets up the menu bar with File and Edit menus.
   //-----------------------------------------------------------------
   public JMenuBar createMenuBar ()
   {
      MenuListener menuListener = new MenuListener ();

      JMenu fileMenu = new JMenu ("File");

      JMenuItem newMenuItem = new JMenuItem ("New");
      newMenuItem.addActionListener (menuListener);
      newMenuItem.setEnabled (false);

      JMenuItem openMenuItem = new JMenuItem ("Open...");
      openMenuItem.addActionListener (menuListener);
      openMenuItem.setEnabled (false);

      JMenuItem saveMenuItem = new JMenuItem ("Save");
      saveMenuItem.addActionListener (menuListener);
      saveMenuItem.setEnabled (false);

      JMenuItem saveAsMenuItem = new JMenuItem ("Save As...");
      saveAsMenuItem.addActionListener (menuListener);
      saveAsMenuItem.setEnabled (false);

      JMenuItem aboutMenuItem = new JMenuItem ("About...");
      aboutMenuItem.addActionListener (menuListener);
      aboutMenuItem.setEnabled (false);

      JMenuItem exitMenuItem = new JMenuItem ("Exit");
      exitMenuItem.addActionListener (menuListener);
      exitMenuItem.setEnabled (false);

      fileMenu.add (newMenuItem);
      fileMenu.add (openMenuItem);
      fileMenu.add (saveMenuItem);
      fileMenu.add (saveAsMenuItem);
      fileMenu.addSeparator ();
      fileMenu.add (aboutMenuItem);
      fileMenu.addSeparator ();
      fileMenu.add (exitMenuItem);

      JMenu editMenu = new JMenu ("Edit");

      JMenuItem cutMenuItem = new JMenuItem ("Cut");
      cutMenuItem.addActionListener (menuListener);
      cutMenuItem.setEnabled (false);

      JMenuItem copyMenuItem = new JMenuItem ("Copy");
      copyMenuItem.addActionListener (menuListener);
      copyMenuItem.setEnabled (false);

      JMenuItem pasteMenuItem = new JMenuItem ("Paste");
      pasteMenuItem.addActionListener (menuListener);
      pasteMenuItem.setEnabled (false);

      editMenu.add (cutMenuItem);
      editMenu.add (copyMenuItem);
      editMenu.add (pasteMenuItem);

      JMenuBar bar = new JMenuBar ();
      bar.add (fileMenu);
      bar.add (editMenu);

      return bar;
   }

   //*****************************************************************
   //  An inner class to handle window events.
   //*****************************************************************
   public class WindowCloser extends WindowAdapter
   {
      //--------------------------------------------------------------
      //  Terminates the program when the window is closed.
      //--------------------------------------------------------------
      public void windowClosing (WindowEvent event)
      {
         System.exit (0);
      }
   }

   //*****************************************************************
   //  An inner class to handle menu events.
   //*****************************************************************
   public class MenuListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Handles action events caused by menu selections.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         //  to be implemented
      }
   }
}

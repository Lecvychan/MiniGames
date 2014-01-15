import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;


public class WhackAMole implements ActionListener{
   public JFrame frame;
     JButton start;
 

    public void go () {
    JFrame frame = new JFrame ();
    JButton start = new JButton ("Click to Start");
    start.addActionListener (this);     

    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // Allows program to stop after you close window
 
    frame.getContentPane().add (start); //Adds button to the content pane
    frame.setSize (600, 600);
    frame.setVisible(true); //Makes it visible

    }


    public void actionPerformed (ActionEvent e) { //Implement ActionListener interface's actionPerformed() method --> actualy event - handling method!

	start.setText ("hmmm");
    }





   public static void main (String [] args) {
       WhackAMole begin = new WhackAMole();
       begin.go();
   }
}
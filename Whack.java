import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Whack /*implements ActionListener*/{

    JButton hole0,hole1,hole2,hole3,hole4,hole5,hole6,hole7,hole8,hole9;
    ImageIcon image1 = new ImageIcon("mole.jpg");
    JLabel updates;

    int x = (int) (Math.random () * 10);
    int y = (int) (Math.random () * 10);


    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(new BoxLayout(totalGUI, BoxLayout.Y_AXIS));


        // Creation of a Panel to contain the title labels
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(300, 300);
        totalGUI.add(titlePanel);

        JLabel titleLabel = new JLabel("LET'S WHACK-a-MOLE!");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        titleLabel.setLocation(175, 0);
        titleLabel.setSize(400, 40);
        titleLabel.setHorizontalAlignment(0);
        titleLabel.setForeground(Color.black);
        titleLabel.setBackground(Color.pink);
        titleLabel.setOpaque(true);
        titlePanel.add(titleLabel);

        JLabel messages = new JLabel("<html><p>Instructions: To play Whack-a-Mole you must have quick reflexes and eyes.  When a mole pops up in a hole, hurry to whack it before it goes away.  The faster you play the more coins you make, so let's have some fun!" );
        messages.setLocation(125, 30);
        messages.setSize(500, 100);
        messages.setHorizontalAlignment(0);
        messages.setForeground(Color.blue);
        titlePanel.add(messages);


        // Creation of a label to contain all the JButtons.
        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(new BoxLayout(buttonPanel1, BoxLayout.X_AXIS));
        buttonPanel1.setLocation(0, 0);
        buttonPanel1.setSize(0, 0);
        totalGUI.add(buttonPanel1);

    JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.X_AXIS));
        buttonPanel2.setLocation(0, 0);
        buttonPanel2.setSize(0, 0);
        totalGUI.add(buttonPanel2);

        // We create a button and manipulate it using the syntax we have
        // used before.

        ImageIcon image = new ImageIcon("hole.jpg");

	hole0 = new JButton(image);
        hole0.setLocation(0, 0);
        hole0.setSize(0, 0);
        //hole0.addActionListener(this);
        buttonPanel1.add(hole0);


        hole1 = new JButton(image);
        hole1.setLocation(0, 0);
        hole1.setSize(0, 0);
        //hole1.addActionListener(this);
        buttonPanel1.add(hole1);

        hole2 = new JButton(image);
        hole2.setLocation(0, 0);
        hole2.setSize(0, 0);
        //hole2.addActionListener(this);
        buttonPanel1.add(hole2);

        hole3 = new JButton(image);
        hole3.setLocation(0, 0);
        hole3.setSize(0, 0);
        //hole3.addActionListener(this);
        buttonPanel1.add(hole3);

        hole4 = new JButton(image);
        hole4.setLocation(0, 0);
        hole4.setSize(0, 0);
        //hole4.addActionListener(this);
        buttonPanel1.add(hole4);

        hole5 = new JButton(image);
        hole5.setLocation(0, 0);
        hole5.setSize(0, 0);
        //hole5.addActionListener(this);
        buttonPanel2.add(hole5);

        hole6 = new JButton(image);
        hole6.setLocation(0, 0);
        hole6.setSize(0, 0);
        //hole6.addActionListener(this);
        buttonPanel2.add(hole6);

        hole7 = new JButton(image);
        hole7.setLocation(0, 0);
        hole7.setSize(0, 0);
        //hole7.addActionListener(this);
        buttonPanel2.add(hole7);

        hole8 = new JButton(image);
        hole8.setLocation(0, 0);
        hole8.setSize(0, 0);
        //hole8.addActionListener(this);
        buttonPanel2.add(hole8);


        hole9 = new JButton(image);
        hole9.setLocation(0, 0);
        hole9.setSize(0, 0);
        //hole9.addActionListener(this);
        buttonPanel2.add(hole9);


        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(null);
        bottomPanel.setLocation(10, 0);
        bottomPanel.setSize(250, 30);
        totalGUI.add(bottomPanel);

        updates = new JLabel("Try again...");
        updates.setFont(new Font("Times New Roman", Font.BOLD, 14));
        updates.setLocation(175, 0);
        updates.setSize(400, 40);
        updates.setHorizontalAlignment(0);
        updates.setForeground(Color.black);
        updates.setBackground(Color.pink);
        updates.setOpaque(true);
        bottomPanel.add(updates);

        JLabel coin = new JLabel("Coins: 10000");
        coin.setFont(new Font("Times New Roman", Font.BOLD, 14));
        coin.setLocation(100, 50);
        coin.setSize(250, 40);
        coin.setHorizontalAlignment(0);
        coin.setForeground(Color.black);
        coin.setBackground(Color.pink);
        coin.setOpaque(true);
        bottomPanel.add(coin);

        JButton exitButton = new JButton("EXIT");
        exitButton.setLocation(500, 50);
        exitButton.setSize(220, 30);
        bottomPanel.add(exitButton);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    /* public void actionPerformed(ActionEvent e) {
        //rope0
        if(e.getSource() == rope0 ) {
	    rope0.setIcon(image1);
	    if (0 == x || 0 == y) {
		updates.setText("Sad life");
	    }
	}
        //rope1
        if(e.getSource() == rope1 ) {
	    rope1.setIcon(image1);
	    if (1 == x || 1 == y) {
		updates.setText("Sad life");
	    }
        }
        //rope2
        if(e.getSource() == rope2) {
	    rope2.setIcon(image1);
	    if (2 == x || 2 == y) {
		updates.setText("Sad life");
		    }
	}
	//rope3
	if(e.getSource() == rope3 ) {
	    rope3.setIcon(image1);
	    if (3 == x || 3 == y) {
		updates.setText("Sad life");
		    }
	}
	//rope4
	if(e.getSource() == rope4 ) {
	    rope4.setIcon(image1);
	    if (4 == x || 4 == y) {
		updates.setText("Sad life");
		    }
	}
	//rope5
	if(e.getSource() == rope5 ) {
	    rope5.setIcon(image1);
	    if (5 == x || 5 == y) {
		updates.setText("Sad life");
		    }
	}
	//rope6
	if(e.getSource() == rope6 ) {
	    rope6.setIcon(image1);
	    if (6 == x || 6 == y) {
		updates.setText("Sad life");
		    }
	}
	//rope7
	if(e.getSource() == rope7 ) {
	    rope7.setIcon(image1);
	    if (7 == x || 7 == y) {
		updates.setText("Sad life");
		    }
	}
	//rope8
	if(e.getSource() == rope8 ) {
	    rope8.setIcon(image1);
	    if (8 == x || 8 == y) {
		updates.setText("Sad life");
		    }
	}
	//rope9
	if(e.getSource() == rope9 ) {
	    rope9.setIcon(image1);
	    if (9 == x || 9 == y) {
		updates.setText("Sad life");
		    }
	}




	} */

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("CUT THE ROPE");

        //Create and set up the content pane.
        Whack demo = new Whack();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLocation(250,75);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.


        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TitlePage  implements ActionListener {

    JButton rope, mole, scores;
    JLabel titleLabel, messages;

    public JPanel createContentPane () {

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
	totalGUI.setLayout(new BoxLayout(totalGUI, BoxLayout.Y_AXIS));

      JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 100);
        titlePanel.setSize(300, 100);
        totalGUI.add(titlePanel);

       	titleLabel = new JLabel("MiNiGAMES");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        titleLabel.setLocation(175, 0);
        titleLabel.setSize(400, 40);
        titleLabel.setHorizontalAlignment(0);
        titleLabel.setForeground(Color.black);
        titleLabel.setBackground(Color.pink);
        titleLabel.setOpaque(true);
        titlePanel.add(titleLabel);

        messages = new JLabel("<html><p>Pick between our two minigames, Cut the Rope or Whack-a-Mole and try to win the high score! \nCreated by: Sunnam Quispe, Lecvy Chan and Frances Shapiro" );
        messages.setLocation(125, 30);
        messages.setSize(500, 150);
        messages.setHorizontalAlignment(0);
        messages.setForeground(Color.blue);
        titlePanel.add(messages);

        // Creation of a label to contain all the JButtons.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setLocation(0, 0);
        buttonPanel.setSize(0, 0);
        totalGUI.add(buttonPanel);

        // We create a button and manipulate it using the syntax we have
        // used before.

        ImageIcon image = new ImageIcon("CUTTHEROPE.jpg");
        ImageIcon image1 = new ImageIcon("WHACKAMOLE.jpg");

        rope = new JButton(image);
        rope.setLocation(0, 0);
        rope.setSize(0, 0);
	rope.addActionListener(this);
        buttonPanel.add(rope);

        mole = new JButton(image1);
        mole.setLocation(0, 0);
        mole.setSize(0, 0);
	mole.addActionListener(this);
        buttonPanel.add(mole);
        
	  JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(null);
        bottomPanel.setLocation(10, 0);
        bottomPanel.setSize(250, 30);
        totalGUI.add(bottomPanel);


        scores = new JButton("HIGH SCORES");
        scores.setLocation(265, 50);
        scores.setSize(220, 60);
        bottomPanel.add(scores);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    public void actionPerformed(ActionEvent e) {
        //rope
        if(e.getSource() == rope ) {
	    ButtonDemo game = new ButtonDemo();
	    String[] args1 = {};
	    game.main(args1);
	}
        //mole
       if(e.getSource() == mole ) {
	   Whack game = new Whack();
	    String[] args2 = {};
	    game.main(args2);
	}

	/* //scores
        if(e.getSource() == rope2) {
	    rope2.setIcon(image1);
	    if (2 == x || 2 == y) {
		updates.setText("Sad life");
		    }
	*/


    
}


    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("MINI GAMES");

        //Create and set up the content pane.
        TitlePage demo = new TitlePage();
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
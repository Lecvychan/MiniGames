import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Home implements ActionListener{

    JButton cut, whack;
 
    public JPanel ContentPane () {
 JPanel totalGUI = new JPanel();
        totalGUI.setLayout(new BoxLayout(totalGUI, BoxLayout.Y_AXIS));


        // Creation of a Panel to contain the title labels
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(300, 300);
        totalGUI.add(titlePanel);

        JLabel titleLabel = new JLabel("LET'S PLAY!!!!!!");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        titleLabel.setLocation(175, 0);
        titleLabel.setSize(400, 40);
        titleLabel.setHorizontalAlignment(0);
        titleLabel.setForeground(Color.black);
        titleLabel.setBackground(Color.pink);
        titleLabel.setOpaque(true);
        titlePanel.add(titleLabel);

        JLabel messages = new JLabel("<html><p>Instructions: Pick a game to play!" );
        messages.setLocation(125, 30);
        messages.setSize(500, 100);
        messages.setHorizontalAlignment(0);
        messages.setForeground(Color.blue);
        titlePanel.add(messages);


        // Creation of a label to contain all the JButtons.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setLocation(0, 0);
        buttonPanel.setSize(0, 0);
        totalGUI.add(buttonPanel);

	cut = new JButton ("Cut the Rope");
	cut.setLocation(0, 0);
        cut.setSize(0,0);
	cut.addActionListener(this);
	buttonPanel.add(cut);


        whack = new JButton("Whack-a-Mole");
        whack.setLocation(0, 0);
        whack.setSize(50, 50);
	whack.addActionListener(this);
        buttonPanel.add(whack);

	JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(null);
        bottomPanel.setLocation(10, 0);
        bottomPanel.setSize(250, 30);
        totalGUI.add(bottomPanel);

	totalGUI.setOpaque(true);
        return totalGUI;

    }

    public void actionPerformed (ActionEvent e) {
	if (e.getSource () == cut) {
	    ;
	 
	}
	if (e.getSource () == whack) {
	    ;
	}
    }

    private static void ShowGUI () {
    JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("CUT THE ROPE");

        //Create and set up the content pane.
	Home demo = new Home();
        frame.setContentPane(demo.ContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLocation(250,75);
        frame.setVisible(true);
    }

    public static void main (String [] args) {
  SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               ShowGUI();
            }
      });
    }
}
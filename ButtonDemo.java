import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonDemo implements ActionListener{

    JButton rope0,rope1,rope2,rope3,rope4,rope5,rope6,rope7,rope8,rope9;
	ImageIcon image1 = new ImageIcon("cutrope0.jpg");
    int x = (int) (Math.random () * 10);
  


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

        JLabel titleLabel = new JLabel("LET'S PLAY CUT THE ROPE!");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
        titleLabel.setLocation(175, 0);
        titleLabel.setSize(400, 40);
        titleLabel.setHorizontalAlignment(0);
        titleLabel.setForeground(Color.black);
        titleLabel.setBackground(Color.pink);
        titleLabel.setOpaque(true);
        titlePanel.add(titleLabel);

        JLabel messages = new JLabel("<html><p>Instructions: To play Cut the Rope, you must be brave and lucky! Cut one of the ropes and see what happens, if it is a safe rope, you can continue on to test your luck or leave safely with your coins. If it is deadly unfortunatley you made a fatal mistake." );
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

        // We create a button and manipulate it using the syntax we have
        // used before.

        ImageIcon image = new ImageIcon("rope0.jpg");
	ImageIcon image1 = new ImageIcon("cutrope0.jpg");

        rope0 = new JButton(image);
        rope0.setLocation(0, 0);
        rope0.setSize(0, 0);
	rope0.addActionListener(this);
        buttonPanel.add(rope0);


        rope1 = new JButton(image);
        rope1.setLocation(0, 0);
        rope1.setSize(0, 0);
	rope1.addActionListener(this);
        buttonPanel.add(rope1);

	rope2 = new JButton(image);
        rope2.setLocation(0, 0);
        rope2.setSize(0, 0);
	rope2.addActionListener(this);
        buttonPanel.add(rope2);

        rope3 = new JButton(image);
        rope3.setLocation(0, 0);
        rope3.setSize(0, 0);
	rope3.addActionListener(this);
        buttonPanel.add(rope3);

	rope4 = new JButton(image);
        rope4.setLocation(0, 0);
        rope4.setSize(0, 0);
	rope4.addActionListener(this);
        buttonPanel.add(rope4);

	rope5 = new JButton(image);
        rope5.setLocation(0, 0);
        rope5.setSize(0, 0);
	rope5.addActionListener(this);
        buttonPanel.add(rope5);

        rope6 = new JButton(image);
        rope6.setLocation(0, 0);
        rope6.setSize(0, 0);
	rope6.addActionListener(this);
        buttonPanel.add(rope6);

        rope7 = new JButton(image);
        rope7.setLocation(0, 0);
        rope7.setSize(0, 0);
	rope7.addActionListener(this);
        buttonPanel.add(rope7);

        rope8 = new JButton(image);
        rope8.setLocation(0, 0);
        rope8.setSize(0, 0);
	rope8.addActionListener(this);
        buttonPanel.add(rope8);


        rope9 = new JButton(image);
        rope9.setLocation(0, 0);
        rope9.setSize(0, 0);
	rope9.addActionListener(this);
        buttonPanel.add(rope9);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(null);
        bottomPanel.setLocation(10, 0);
        bottomPanel.setSize(250, 30);
        totalGUI.add(bottomPanel);

        JLabel updates = new JLabel("Try again...");
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

    public void actionPerformed(ActionEvent e) {
	//rope0
	if(e.getSource() == rope0 && x != 0) {
	    rope0.setIcon(image1);
	 	}
	//rope1
	if(e.getSource() == rope1 && x != 1) {
	    rope1.setIcon(image1);
	}
	//rope2
	if(e.getSource() == rope2 && x != 2) {
	    rope2.setIcon(image1);
	}
	//rope3
	if(e.getSource() == rope3 && x != 3) {
	    rope3.setIcon(image1);
	}
	//rope4
	if(e.getSource() == rope4 && x != 4) {
	    rope4.setIcon(image1);
	}
	//rope5
	if(e.getSource() == rope5 && x != 5) {
	    rope5.setIcon(image1);
	}
	//rope6
	if(e.getSource() == rope6 && x != 6) {
	    rope6.setIcon(image1);
	   	}
	//rope7
	if(e.getSource() == rope7 && x != 7) {
	    rope7.setIcon(image1);

	}
	//rope8
	if(e.getSource() == rope8 && x != 8) {
	    rope8.setIcon(image1);
	}
	//rope9
	if(e.getSource() == rope9 && x != 9) {
	    rope9.setIcon(image1);
	}




    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("CUT THE ROPE");

        //Create and set up the content pane.
        ButtonDemo demo = new ButtonDemo();
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
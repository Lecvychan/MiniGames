import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.io.*;

public class Whack implements ActionListener{

    transient JButton hole0,hole1,hole2,hole3,hole4,hole5,hole6,hole7,hole8,hole9,exitButton;
    transient ImageIcon image = new ImageIcon("hole.jpg");
    transient ImageIcon image1 = new ImageIcon("mole.jpg");
    transient JLabel updates, coin, top;
    transient static JFrame frame;
    transient int coins = 0;
    transient int x;
    transient boolean running0, running1, running2, running3, running4, running5, running6, running7, running8, running9;
    transient private int num = 0;
    public int score;

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



	hole0 = new JButton(image);
        hole0.setLocation(0, 0);
        hole0.setSize(0, 0);
        hole0.addActionListener(this);
        buttonPanel1.add(hole0);


        hole1 = new JButton(image);
        hole1.setLocation(0, 0);
        hole1.setSize(0, 0);
        hole1.addActionListener(this);
        buttonPanel1.add(hole1);

        hole2 = new JButton(image);
        hole2.setLocation(0, 0);
        hole2.setSize(0, 0);
        hole2.addActionListener(this);
        buttonPanel1.add(hole2);

        hole3 = new JButton(image);
        hole3.setLocation(0, 0);
        hole3.setSize(0, 0);
        hole3.addActionListener(this);
        buttonPanel1.add(hole3);

        hole4 = new JButton(image);
        hole4.setLocation(0, 0);
        hole4.setSize(0, 0);
        hole4.addActionListener(this);
        buttonPanel1.add(hole4);

        hole5 = new JButton(image);
        hole5.setLocation(0, 0);
        hole5.setSize(0, 0);
        hole5.addActionListener(this);
        buttonPanel2.add(hole5);

        hole6 = new JButton(image);
        hole6.setLocation(0, 0);
        hole6.setSize(0, 0);
        hole6.addActionListener(this);
        buttonPanel2.add(hole6);

        hole7 = new JButton(image);
        hole7.setLocation(0, 0);
        hole7.setSize(0, 0);
        hole7.addActionListener(this);
        buttonPanel2.add(hole7);

        hole8 = new JButton(image);
        hole8.setLocation(0, 0);
        hole8.setSize(0, 0);
        hole8.addActionListener(this);
        buttonPanel2.add(hole8);


        hole9 = new JButton(image);
        hole9.setLocation(0, 0);
        hole9.setSize(0, 0);
        hole9.addActionListener(this);
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

        coin = new JLabel("Coins: 0");
        coin.setFont(new Font("Times New Roman", Font.BOLD, 14));
        coin.setLocation(20, 50);
        coin.setSize(250, 40);
        coin.setHorizontalAlignment(0);
        coin.setForeground(Color.black);
        coin.setBackground(Color.pink);
        coin.setOpaque(true);
        bottomPanel.add(coin);

        top = new JLabel("Highscore: " + score);
        top.setFont(new Font("Times New Roman", Font.BOLD, 14));
        top.setLocation(275, 50);
	top.setSize(250, 40);
        top.setHorizontalAlignment(0);
        top.setForeground(Color.black);
        top.setBackground(Color.orange);
        top.setOpaque(true);
        bottomPanel.add(top);

        exitButton = new JButton("EXIT");
	exitButton.setLocation(535, 50);
        exitButton.setSize(150, 40);
	exitButton.addActionListener(this);
        bottomPanel.add(exitButton);
        
        totalGUI.setOpaque(true);
        return totalGUI;	

    }
    
    public  void changeIcon() {
	long usedTime;
	long startTime;
	long usedTime1;
	long startTime1;

 	for (int num = 0; num < 30; num++) {

	    x = (int) (Math.random () * 10);

	    usedTime = 0;
	    startTime = System.currentTimeMillis();

	    //mole pops up
	    if (0 == x) {
		hole0.setIcon(image1);
		running0 = true;
	    }
	    if (1 == x) {
		hole1.setIcon(image1);
		running1 = true;
	    }
	    if (2 == x) {
		hole2.setIcon(image1);
		running2 = true;
	    }
	    if (3 == x) {
		hole3.setIcon(image1);
		running3 = true;
	    }
	    if (4 == x) {
		hole4.setIcon(image1);
		running4 = true;
	    }
	    if (5 == x) {
		hole5.setIcon(image1);
		running5 = true;
	    }
	    if (6 == x) {
		hole6.setIcon(image1);
		running6 = true;
	    }
	    if (7 == x) {
		hole7.setIcon(image1);
		running7 = true;
	    }
	    if (8 == x) {
		hole8.setIcon(image1);
		running8 = true;
	    }
	    if (9 == x) {
		hole9.setIcon(image1);
		running9 = true;
	    }
	       //when the time is up
       while (usedTime <= 777) {
	    	usedTime = System.currentTimeMillis() - startTime;
	    }


	    //mole goes bye bye
	    if (running0 == true) {
		hole0.setIcon(image);
		running0 = false;
	    }
	    if (running1 == true) {
		hole1.setIcon(image);
		running1 = false;
	    }
	    if (running2 == true) {
		hole2.setIcon(image);
		running2 = false;
	    }
	    if (running3 == true) {
		hole3.setIcon(image);
		running3 = false;
	    }
	    if (running4 == true) {
		hole4.setIcon(image);
		running4 = false;
	    }
	    if (running5 == true) {
		hole5.setIcon(image);
		running5 = false;
	    }
	    if (running6 == true) {
		hole6.setIcon(image);
		running6 = false;
	    }
	    if (running7 == true) {
		hole7.setIcon(image);
		running7 = false;
	    }
	    if (running8 == true) {
		hole8.setIcon(image);
		running8 = false;
	    }
	    if (running9 == true) {
		hole9.setIcon(image);
		running9 = false;	    
	    }
	    
	}

	usedTime1 = 0;
	startTime1 = System.currentTimeMillis();

       while (usedTime1 <= 3000) {
	    	usedTime1 = System.currentTimeMillis() - startTime1;
	    }

	frame.dispose();
	TitlePage page = new TitlePage();
	String[] args1 = {};
	page.main(args1);

    }
    
    


    public void actionPerformed(ActionEvent e) {

	try {
	    FileInputStream fileIn = new FileInputStream ("Whack.ser");
	    ObjectInputStream is = new ObjectInputStream (fileIn);
	    score = is.readInt(); 


	} catch(FileNotFoundException ex) {
	    System.out.println("No Score");
	}
	catch(Exception ex) {
	    System.out.println (ex.getMessage());	

	}



	if(e.getSource() == exitButton) {
	    frame.dispose();
	    TitlePage page = new TitlePage();
	    String[] args1 = {};
	    page.main(args1);	
	}   

	if ((e.getSource() == hole0) && running0 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if ((e.getSource() == hole1) && running1 == true) {
	coins += 10;
	coin.setText("" + coins);
	}
	if ((e.getSource() == hole2) && running2 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if ((e.getSource() == hole3) && running3 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if ((e.getSource() == hole4) && running4 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if ((e.getSource() == hole5) && running5 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if ((e.getSource() == hole6) && running6 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if ((e.getSource() == hole7) && running7 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if ((e.getSource() == hole8) && running8 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if ((e.getSource() == hole9) && running9 == true) {
	    coins += 10;
	    coin.setText("" + coins);
	}
	if (coins > score) 
	    score = coins;
	try {
	    FileOutputStream fs = new FileOutputStream ("Whack.ser");
	    ObjectOutputStream os = new ObjectOutputStream (fs);
	    os.writeInt (score);
	    os.close();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	top.setText ("Highscore: " + score);
	
    }

 
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        frame = new JFrame("WHACK-A-MOLE");

        //Create and set up the content pane.
        Whack demo = new Whack();
        frame.setContentPane(demo.createContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLocation(250,75);
        frame.setVisible(true);
	demo.changeIcon();

    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
	Whack test = new Whack();
	test.createAndShowGUI();

    }
}

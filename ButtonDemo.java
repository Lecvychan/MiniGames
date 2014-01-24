import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.Dialog;


public class ButtonDemo implements ActionListener, Serializable{

    transient JButton exitButton, rope0,rope1,rope2,rope3,rope4,rope5,rope6,rope7,rope8,rope9;
    transient  ImageIcon image1 = new ImageIcon("cutrope0.jpg");
    transient JLabel updates, coin, top;
    transient static JFrame frame = new JFrame("CUT THE ROPE");
    transient boolean b0 = false;
    transient boolean b1 = false;
    transient boolean b2 = false;
    transient boolean b3 = false;
    transient boolean b4 = false;
    transient boolean b5 = false;
    transient boolean b6 = false;
    transient boolean b7 = false;
    transient boolean b8 = false;
    transient boolean b9 = false;

    transient int x = (int) (Math.random() * 10);
    transient int y = (int) (Math.random () * 10);
    transient int coins = 0;
    public int highscore ;

    public int getScore() {
	return highscore;
    }

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

        JLabel messages = new JLabel("<html><p>Instructions: To play Cut the Rope, you must be brave and lucky! Cut one of the ropes and see what happens, if it is a safe rope, you can continue on to test your luck and try again. If it is deadly unfortunately you made a fatal mistake." );
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

        updates = new JLabel("Try again...");
        updates.setFont(new Font("Times New Roman", Font.BOLD, 14));
        updates.setLocation(175, 0);
        updates.setSize(400, 40);
        updates.setHorizontalAlignment(0);
        updates.setForeground(Color.black);
        updates.setBackground(Color.pink);
        updates.setOpaque(true);
        bottomPanel.add(updates);


        top = new JLabel("Highscore: " + highscore);
        top.setFont(new Font("Times New Roman", Font.BOLD, 14));
        top.setLocation(275, 50);
	top.setSize(250, 40);
        top.setHorizontalAlignment(0);
        top.setForeground(Color.black);
        top.setBackground(Color.orange);
        top.setOpaque(true);
        bottomPanel.add(top);



        coin = new JLabel("Coins: 0");
        coin.setFont(new Font("Times New Roman", Font.BOLD, 14));
        coin.setLocation(20, 50);
        coin.setSize(250, 40);
        coin.setHorizontalAlignment(0);
        coin.setForeground(Color.black);
        coin.setBackground(Color.pink);
        coin.setOpaque(true);
        bottomPanel.add(coin);

        exitButton = new JButton("EXIT");
        exitButton.setLocation(535, 50);
        exitButton.setSize(150, 40);
	exitButton.addActionListener(this);
        bottomPanel.add(exitButton);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }
    
      public void popup() {
	  Object[] options = {"Play again","Return to home page"};
      int choice = JOptionPane.showOptionDialog(null, //Component parentComponent
      "Sorry, game over!", //Object message,
      "Choose an option", //String title
      JOptionPane.YES_NO_OPTION, //int optionType
      JOptionPane.INFORMATION_MESSAGE, //int messageType
      null, //Icon icon,
      options, //Object[] options,
      "Play again");//Object initialValue 

      if(choice == 0 ){
      frame.dispose();
      ButtonDemo game = new ButtonDemo();
      String[] args1 = {};
      game.main(args1);
      }
else{
      frame.dispose();
      TitlePage page = new TitlePage();
      String[] args1 = {};
      page.main(args1);
      }
      }
    


    public void actionPerformed(ActionEvent e) {

	try {
	    FileInputStream fileIn = new FileInputStream ("Highscore.ser");
	    ObjectInputStream is = new ObjectInputStream (fileIn);
	    highscore = is.readInt(); 


	} catch(FileNotFoundException ex) {
	    System.out.println("No Score");
	} catch(Exception ex) {
	    System.out.println (ex.getMessage());	

	}
    
	top.setText("High Score: " + highscore);


	if(e.getSource() == exitButton) {
	    frame.dispose();
	    TitlePage page = new TitlePage();
	    String[] args1 = {};
	    page.main(args1);	
	}    

        //rope0
        if(e.getSource() == rope0 ) {
	    rope0.setIcon(image1);
	    if (0 == x || 0 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		TitlePage page = new TitlePage();
		String[] args1 = {};
		page.main(args1);
	    }
	    
	    if (b0 == false) {
		if (0 != x &&  0 != y) {
		coins += 100;
	coin.setText ("Coins: " + coins);
	if (coins > highscore) 
	    highscore = coins;
		    }
	    }
	    b0 = true;
	
	
	    
	}
        //rope1
        if(e.getSource() == rope1 ) {
	    rope1.setIcon(image1);
	    if (1 == x || 1 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();
	
	    }
	   if (b1 == false) {
		if (1 != x &&  1 != y) {
		coins += 100;
	coin.setText ("Coins: " + coins);
	if (coins > highscore) 
	    highscore = coins;
		    }
	    }
	    b1 = true;
        }
        //rope2
        if(e.getSource() == rope2) {

	    rope2.setIcon(image1);
	    if (2 == x || 2 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();	
	    }
	    if (b2 == false) {
		if (2 != x &&  2 != y) {
		    coins += 100;
		    coin.setText ("Coins: " + coins);
		    if (coins > highscore) 
			highscore = coins;
			}
	    }
	    b2 = true;
	}
	//rope3
	if(e.getSource() == rope3 ) {
	
	    rope3.setIcon(image1);
	    if (3 == x || 3 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();
	    }
	   if (b3 == false) {
		if (3 != x &&  3 != y) {
		coins += 100;
	coin.setText ("Coins: " + coins);
	if (coins > highscore) 
	    highscore = coins;
		    }
	    }
	    b3 = true;
	}
	//rope4
	if(e.getSource() == rope4 ) {
	    rope4.setIcon(image1);
	    if (4 == x || 4 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();
	    }
	    if (b4 == false) {
		if (4 != x &&  4 != y) {
		    coins += 100;
		    coin.setText ("Coins: " + coins);
		    if (coins > highscore) 
			highscore = coins;
		}
	    }
	    b4 = true;
	}
	//rope5
	if(e.getSource() == rope5 ) {
	    rope5.setIcon(image1);
	    if (5 == x || 5 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();
		
	    }
	    if (b5 == false) {
		if (5 != x &&  5 != y) {
		    coins += 100;
		    coin.setText ("Coins: " + coins);
		    if (coins > highscore) 
			highscore = coins;
		}
	    }
	    b5 = true;
	}
	//rope6
	if(e.getSource() == rope6 ) {
	    rope6.setIcon(image1);
	    if (6 == x || 6 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();
	    }
	    if (b6 == false) {
		if (6 != x &&  6 != y) {
		    coins += 100;
		    coin.setText ("Coins: " + coins);
		    if (coins > highscore) 
			highscore = coins;

		}
	    }
	    b6 = true;
	}
	//rope7
	if(e.getSource() == rope7 ) {
	    rope7.setIcon(image1);
	    if (7 == x || 7 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();
	    }
	    if (b7 == false) {
		if (7 != x &&  7 != y) {
		    coins += 100;
		    coin.setText ("Coins: " + coins);
		    if (coins > highscore) 
			highscore = coins;
				}
	    }
	    b7 = true;
	}
	//rope8
	if(e.getSource() == rope8 ) {
	    rope8.setIcon(image1);
	    if (8 == x || 8 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();
	    }
	    if (b8 == false) {
		if (8 != x &&  8 != y) {
		    coins += 100;
		    coin.setText ("Coins: " + coins);
		    if (coins > highscore) 
			highscore = coins;
		}
	    }
	    b8 = true;
	}
	//rope9
	if(e.getSource() == rope9 ) {
	    rope9.setIcon(image1);
	    if (9 == x || 9 == y) {
		long usedTime1 = 0;
		long startTime1 = System.currentTimeMillis();

		while (usedTime1 <= 3000) {
		    usedTime1 = System.currentTimeMillis() - startTime1;
		}
		frame.dispose();
		this.popup();
	    }
	    if (b9 == false) {
		if (9 != x &&  9 != y) {
		    coins += 100;
		    coin.setText ("Coins: " + coins);
		    if (coins > highscore) 
			highscore = coins;
		}
	    }
	    b9= true;
	}
	
	try {
	    FileOutputStream fs = new FileOutputStream ("Highscore.ser");
	    ObjectOutputStream os = new ObjectOutputStream (fs);
	    os.writeInt (highscore);
	    os.close();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	top.setText("High Score: " + highscore);
	
    }

    
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);

        //Create and set up the content pane.
        ButtonDemo demo = new ButtonDemo();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setLocation(250,75);
        frame.setVisible(true);
    }

	public void loadHS() {
	    try {
		FileInputStream fileIn = new FileInputStream ("Highscore.ser");
		ObjectInputStream is = new ObjectInputStream (fileIn);
		highscore = is.readInt(); 
		
	    } catch(FileNotFoundException ex) {
		System.out.println("No Score");
	    } catch(Exception ex) {
		System.out.println (ex.getMessage());	

	    }
	}

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
	ButtonDemo cool = new ButtonDemo ();
	cool.highscore = cool.getScore();
	cool.loadHS();


	   
  cool.createAndShowGUI();
      
    }
    
}


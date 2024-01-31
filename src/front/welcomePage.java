package front;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class welcomePage extends JFrame implements ActionListener {

	ImageIcon image = new ImageIcon("pic4.png");
	JButton netflixB = new JButton();
	JButton ZorotvB = new JButton();
	JButton anime9B = new JButton();
	JButton AnimexplyB = new JButton();
	JButton AnimeTvB = new JButton();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	
	
	welcomePage(){
		setButtons();
		
		label1.setText("Choose a platform:");
		label1.setBounds(0,0,1000,400);
		label1.setForeground(Color.BLUE);
		label1.setFont(new Font(null,Font.PLAIN,40));
//		label1.setHorizontalTextPosition(JLabel.CENTER);
		label2.setIcon(image);
		label2.setBounds(0,0,1600,900);
		
		this.setTitle("Welcome to animation world");
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1600,900);
		this.setLayout(null);
		this.add(netflixB);
		this.add(ZorotvB);
		this.add(anime9B);
		this.add(AnimeTvB);
		this.add(AnimexplyB);
		this.add(label1);
		this.add(label2);
		this.setVisible(true);
		
	}
	
	void setButtons() {
		netflixB.setBounds(650,225,150,70);
		netflixB.addActionListener(this);
		netflixB.setText("Netflix");
		netflixB.setFocusable(false);
		
		ZorotvB.setBounds(650,300,150,70);
		ZorotvB.addActionListener(this);
		ZorotvB.setText("Zorotv");
		ZorotvB.setFocusable(false);
		
		anime9B.setBounds(650,375,150,70);
		anime9B.addActionListener(this);
		anime9B.setText("9anime");
		anime9B.setFocusable(false);
		
		AnimexplyB.setBounds(650,450,150,70);
		AnimexplyB.addActionListener(this);
		AnimexplyB.setText("Animexply");
		AnimexplyB.setFocusable(false);
		
		AnimeTvB.setBounds(650,525,150,70);
		AnimeTvB.addActionListener(this);
		AnimeTvB.setText("AnimeTv");
		AnimeTvB.setFocusable(false);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==netflixB) {
			new subscriptionPage();			
		}
		if(e.getSource()==ZorotvB) {
			new subscriptionPage();
		}
		if(e.getSource()==anime9B) {
			new subscriptionPage();
		}
		if(e.getSource()==AnimexplyB) {
			new subscriptionPage();
		}
		if(e.getSource()==AnimeTvB) {
			new subscriptionPage();
		}
		this.dispose();
		
	}

}

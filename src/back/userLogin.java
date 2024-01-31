package back;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class userLogin implements ActionListener {

	ImageIcon image = new ImageIcon("pic4.png");
	JFrame c = new JFrame("Credit Info");
	JFrame f = new JFrame();
	
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();

	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	
	JButton s1 = new JButton();
	JButton s2 = new JButton();
	JButton s3 = new JButton();
	JButton s4 = new JButton();
	
	public String id;
	public String pass;
	
	
	void frame(){
		f.setTitle("Login page");
		f.getContentPane().setBackground(Color.BLACK);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1600,900);
		f.setLayout(null);

		f.add(s1);
		f.add(s2);
		f.add(s3);

		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(label5);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.setVisible(true);
	}
	
	void label() {
		label1.setText("Email: ");
//		label.setIcon(image);
//		label.setHorizontalTextPosition(JLabel.CENTER);
		label1.setBounds(450,70,1000,500);
		label1.setForeground(Color.RED);
		label1.setFont(new Font(null,Font.PLAIN,25));
		
		label2.setText("User ID: ");
		label2.setBounds(430,145,1000,500);
		label2.setForeground(Color.RED);
		label2.setFont(new Font(null,Font.PLAIN,25));
		
		label3.setText("Password: ");
		label3.setBounds(405,220,1000,500);
		label3.setForeground(Color.RED);
		label3.setFont(new Font(null,Font.PLAIN,25));
		
		label5.setIcon(image);
		label5.setBounds(0,0,1600,900);
		
		t1.setBounds(550, 300, 400, 50);
		t2.setBounds(550, 375, 400, 50);
		t3.setBounds(550, 450, 400, 50);	
	}
	
	void button() {
		/*s1.setBounds(600,150,120,50);
		s1.addActionListener(this);
		s1.setText("Submit");
		s1.setFocusable(false);
		
		s2.setBounds(600,200,120,50);
		s2.addActionListener(this);
		s2.setText("Submit");
		s2.setFocusable(false);*/
		
		s3.setBounds(660,520,130,70);
		s3.addActionListener(this);
		s3.setText("Submit");
		s3.setFocusable(false);
		
	}
	
	public void creditInfo() {
		c.getContentPane().setBackground(Color.BLACK);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setSize(1920, 1080);
		c.setLayout(null);
		
		label4.setText("Enter Credit Number: ");
		label4.setBounds(350,70,1000,500);
		label4.setForeground(Color.RED);
		label4.setFont(new Font(null,Font.PLAIN,25));
		
		label5.setIcon(image);
		label5.setBounds(0,0,1600,900);
		
		s4.setBounds(1000,300,120,50);
		s4.addActionListener(this);
		s4.setText("Submit");
		s4.setFocusable(false);
		t4.setBounds(600, 300, 400, 50);
		
		c.add(label4);
		c.add(t4);
		c.add(s4);
		c.add(label5);
		c.setVisible(true);
	}
	
	void signup() {	
		label();
		button();
		frame();
	}

	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==s1) {
			
						
		}
		if(e.getSource()==s2) {
			
						
		}
		if(e.getSource()==s3) {
			this.id = t2.getText();
			this.pass=t3.getText();
			f.dispose();
			new loginPage().page(id,pass);
		}
		if(e.getSource()==s4) {
			signup();
			c.dispose();					
		}		
	}		
}

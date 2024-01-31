package front;
import back.userLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class subscriptionPage extends JFrame implements ActionListener {

	ImageIcon image = new ImageIcon("pic4.png");
	JFrame d = new JFrame();
	JLabel label = new JLabel();
	JLabel label2 = new JLabel();
	JButton yes = new JButton();
	JButton no = new JButton();
	JButton p1 = new JButton();
	JButton p2 = new JButton();
	JButton p3 = new JButton();
	
	subscriptionPage(){
	
	label();
	buttons();
	this.setTitle("Subscription Page");
	this.getContentPane().setBackground(Color.BLACK);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(1600,900);
	this.setLayout(null);
	this.add(yes);
	this.add(no);
	this.add(label);
	this.add(label2);
	this.setVisible(true);
}
	void label() {
		label.setText("Do you want to buy a subscription?");
		label.setBounds(450,40,1000,400);
		label.setForeground(Color.RED);
		label.setFont(new Font(null,Font.PLAIN,40));
		label2.setIcon(image);
		label2.setBounds(0,0,1600,900);
	}
	
	void buttons() {
		yes.setBounds(650,300,150,70);
		yes.addActionListener(this);
		yes.setText("Yes");
		yes.setFocusable(false);
		
		no.setBounds(650,375,150,70);
		no.addActionListener(this);
		no.setText("No");
		no.setFocusable(false);
		
		p1.setBounds(650,280,150,70);
		p1.addActionListener(this);
		p1.setText("3$/month");
		p1.setFocusable(false);
		
		p2.setBounds(650,355,150,70);
		p2.addActionListener(this);
		p2.setText("15$/6 month");
		p2.setFocusable(false);
		
		p3.setBounds(650,430,150,70);
		p3.addActionListener(this);
		p3.setText("30$/year");
		p3.setFocusable(false);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==yes) {
			this.dispose();
			deals();			
		}
		if(e.getSource()==no) {
			System.exit(0);		
		}
		
		if(e.getSource()==p1) {
			userLogin u = new userLogin();
			u.creditInfo();
			d.dispose();
		}
		if(e.getSource()==p2) {
			userLogin u = new userLogin();
			u.creditInfo();	
			d.dispose();
			}
		if(e.getSource()==p3) {
			userLogin u = new userLogin();
			u.creditInfo();
			d.dispose();
			}
		
	}
	
	void deals() {

		label();
		label.setText("Choose a plan:");
		label.setBounds(580,40,1000,400);
		label.setFont(new Font(null,Font.PLAIN,40));
		d.add(label);
		d.setTitle("Choose your subscription");
		d.getContentPane().setBackground(Color.BLACK);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setSize(1920, 1080);
		d.setLayout(null);
		d.add(p1);
		d.add(p2);
		d.add(p3);
		d.add(label2);
		d.setVisible(true);
	}

}

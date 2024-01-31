package back;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class loginPage extends userLogin implements ActionListener{

	ImageIcon image = new ImageIcon("pic4.png");
	JFrame f = new JFrame();
	
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	
	JButton s1 = new JButton();
	JButton s2 = new JButton();
	
	String ID;
	String PASS;
	String I;
	String P;
	
	void frame() {
		f.setTitle("Login page");
		f.getContentPane().setBackground(Color.BLACK);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1920, 1080);
		f.setLayout(null);

		f.add(s1);
		f.add(s2);
		f.add(t1);
		f.add(t2);
		
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(label4);	
		f.add(label5);
		f.setVisible(true);
	}
	
	void label() {
		label1.setText("Please Login first:");
//		label.setIcon(image);
//		label.setHorizontalTextPosition(JLabel.CENTER);
		label1.setBounds(558,130,1000,100);
		label1.setForeground(Color.RED);
		label1.setFont(new Font(null,Font.PLAIN,40));
		
		label2.setText("User ID: ");
		label2.setBounds(450,30,1000,500);
		label2.setForeground(Color.RED);
		label2.setFont(new Font(null,Font.PLAIN,25));
		
		label3.setText("Password: ");
		label3.setBounds(425,105,1000,500);
		label3.setForeground(Color.RED);
		label3.setFont(new Font(null,Font.PLAIN,25));
		
		label4.setVisible(false);
		
		label5.setIcon(image);
		label5.setBounds(0,0,1600,900);
		
		t1.setBounds(550, 260, 400, 50);
		t2.setBounds(550, 335, 400, 50);
	}
	
	void button() {
		s1.setBounds(600,150,120,50);
		s1.addActionListener(this);
		s1.setText("Retry");
		s1.setFocusable(false);
		s1.setVisible(false);
		
		s2.setBounds(680,400,120,50);
		s2.addActionListener(this);
		s2.setText("Submit");
		s2.setFocusable(false);
	}
	
	void page(String i,String p) {
		label();
		button();
		frame();
		this.I=i;
		this.P=p;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==s1) {
			page(I, P);
						
		}
		if(e.getSource()==s2) {
			this.ID=t1.getText();
			this.PASS=t2.getText();
			if(this.ID.equals(I)&&this.PASS.equals(P)) {			
				new contentLibrary().library();
			}else {
				succ();
			}
		}
		
	}
	
	void succ() {
		s1.setVisible(true);
		label4.setText("Login Failed");
		label4.setVisible(true);
		label4.setBounds(100,150,1000,500);
		label4.setForeground(Color.RED);
		label4.setFont(new Font(null,Font.PLAIN,50));

	}
}


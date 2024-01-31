package back;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class contentLibrary implements ActionListener{

	ImageIcon image = new ImageIcon("pic4.png");
	JFrame f = new JFrame();
	JButton s1 = new JButton();
	JButton s2 = new JButton();
	JButton s3 = new JButton();
	JButton s4 = new JButton();
	JButton s5 = new JButton();
	
	JLabel labelP = new JLabel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel(); 

	void frame() {
		f.setTitle("Login page");
		f.getContentPane().setBackground(Color.BLACK);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1600,900);
		f.setLayout(null);
		f.add(s1);
		f.add(s2);
		f.add(s3);
		f.add(s4);
		f.add(s5);
		
		f.add(label1);
		f.add(label2);
		f.add(label3);
		f.add(label4);
		f.add(label5); //add the extra labels after this line, not after f.add(labelP);
		
		f.add(labelP);
		f.setVisible(true);
	}
	
	void button() {
		s1.setBounds(650,225,150,70);
		s1.addActionListener(this);
		s1.setText("Action");
		s1.setFocusable(false);
		
		s2.setBounds(650,300,150,70);
		s2.addActionListener(this);
		s2.setText("Comedy");
		s2.setFocusable(false);
		
		s3.setBounds(650,375,150,70);
		s3.addActionListener(this);
		s3.setText("Thriller");
		s3.setFocusable(false);
		
		s4.setBounds(650,450,150,70);
		s4.addActionListener(this);
		s4.setText("Horror");
		s4.setFocusable(false);
		
		s5.setBounds(650,525,150,70);
		s5.addActionListener(this);
		s5.setText("Adventure");
		s5.setFocusable(false);
	}
	
	public void library() {
		frame();
		button();
		labelP.setIcon(image);
		labelP.setBounds(0,0,1600,900);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==s1) {
			s1.setVisible(false);
			s2.setVisible(false);
			s3.setVisible(false);
			s4.setVisible(false);
			s5.setVisible(false);
			actionLabel();					
		}	
		if(e.getSource()==s2) {
			s1.setVisible(false);
			s2.setVisible(false);
			s3.setVisible(false);
			s4.setVisible(false);
			s5.setVisible(false);
			comedyLabel();
		}	
		if(e.getSource()==s3) {
			s1.setVisible(false);
			s2.setVisible(false);
			s3.setVisible(false);
			s4.setVisible(false);
			s5.setVisible(false);
			thillerLabel();
		}	
		if(e.getSource()==s4) {
			s1.setVisible(false);
			s2.setVisible(false);
			s3.setVisible(false);
			s4.setVisible(false);
			s5.setVisible(false);
			horrorLabel();
		}	
		if(e.getSource()==s5) {
			s1.setVisible(false);
			s2.setVisible(false);
			s3.setVisible(false);
			s4.setVisible(false);
			s5.setVisible(false);
			adventureLabel();
		}	
	}
	
	
	void actionLabel() {
	
		label1.setText("Demon Slayer");
		label1.setBounds(300,150,1500,500);
		label1.setForeground(Color.RED);
		label1.setFont(new Font(null,Font.PLAIN,30));
		
		label2.setText("Naruto");
		label2.setBounds(100,90,1000,500);
		label2.setForeground(Color.RED);
		label2.setFont(new Font(null,Font.PLAIN,30));
		
		label3.setText("Jujutsu Kaisen");
		label3.setBounds(100,50,1000,500);
		label3.setForeground(Color.RED);
		label3.setFont(new Font(null,Font.PLAIN,30));
		
		label4.setText("Dragon Ball Z");
		label4.setBounds(100,90,1000,500);
		label4.setForeground(Color.RED);
		label4.setFont(new Font(null,Font.PLAIN,30));
		
		label5.setText("YU GI OH");
		label5.setBounds(100,50,1000,500);
		label5.setForeground(Color.RED);
		label5.setFont(new Font(null,Font.PLAIN,30));
	}
	
	void comedyLabel() {
		
	}
	
	void thillerLabel() {
		
	}
	
	void horrorLabel() {
		
	}
	
	void adventureLabel() {
		
	}
}

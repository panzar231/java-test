package ErgasiaJava;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Jframe extends JFrame implements ActionListener {
	
	JButton athleteManagement,subscriptionManagement,bookingManagement;
	ImageIcon image;
	
	
	Jframe(){
		
		image =new ImageIcon("file.png");
		
		athleteManagement=new JButton();
		athleteManagement.setBounds(30, 120, 180,50);
		athleteManagement.setVisible(true);
		athleteManagement.setText("Διαχείριση Αθλητών");
		athleteManagement.setFocusable(false);
		athleteManagement.addActionListener(this);
		
		subscriptionManagement=new JButton();
		subscriptionManagement.setBounds(250, 120,180,50);
		subscriptionManagement.setVisible(true);
		subscriptionManagement.setText("Διαχείριση Συνδρομών");
		subscriptionManagement.setFocusable(false);
		subscriptionManagement.addActionListener(this);
		
		bookingManagement=new JButton();
		bookingManagement.setBounds(470, 120,180,50);
		bookingManagement.setVisible(true);
		bookingManagement.setText("Διαχείριση Κρατήσεων");
		bookingManagement.setFocusable(false);
		bookingManagement.addActionListener(this);
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(700,350);
		this.setLayout(null);
		this.setTitle("Διαχείριση Αθλητικών Ακαδημιών");
		this.setResizable(false);
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.add(bookingManagement);
		this.add(athleteManagement);
		this.add(subscriptionManagement);
		this.setLocation(600,325);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==athleteManagement) {
			
			this.dispose();
			AthleteFrame athleteFrame=new AthleteFrame();
		}
		else if(e.getSource()==subscriptionManagement) {
			
		}
		else if(e.getSource()==bookingManagement) {
			
		}
	}

}

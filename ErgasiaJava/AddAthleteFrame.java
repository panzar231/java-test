package ErgasiaJava;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AddAthleteFrame extends JFrame implements ActionListener{
	
	ImageIcon icon;
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JTextField textField4;
	JTextField textField5;
	JTextField textField6;
	JTextField textField7;
	JTextField textField8;
	JTextField textField9;
	JButton button;
	
	AddAthleteFrame(){
		icon=new ImageIcon("992651.png");
		
		button=new JButton("Submit");
		button.setBounds(100, 350, 200, 100);
		button.setFocusable(false);
		button.addActionListener(this);
		
		textField1=new JTextField("Κωδικός");
		textField1.setBounds(450, 80, 350, 40);
		textField1.setFont(new Font("Poppins",Font.PLAIN,35));
		textField1.setBackground(Color.white);
		textField1.setSelectedTextColor(Color.black);
		
		
		textField3=new JTextField("Όνομα");
		textField3.setBounds(450, 170, 350, 40);
		textField3.setFont(new Font("Poppins",Font.PLAIN,35));
		textField3.setBackground(Color.white);
		textField3.setSelectedTextColor(Color.black);
		
		
		textField4=new JTextField("Επώνυμο");
		textField4.setBounds(450, 260, 350, 40);
		textField4.setFont(new Font("Poppins",Font.PLAIN,35));
		textField4.setBackground(Color.white);
		textField4.setSelectedTextColor(Color.black);
		
		textField5=new JTextField("Φύλο");
		textField5.setBounds(450, 350, 350, 40);
		textField5.setFont(new Font("Poppins",Font.PLAIN,35));
		textField5.setBackground(Color.white);
		textField5.setSelectedTextColor(Color.black);
		
		textField6=new JTextField("Ημερομηνία γέννησης");
		textField6.setBounds(450, 440, 350, 40);
		textField6.setFont(new Font("Poppins",Font.PLAIN,35));
		textField6.setBackground(Color.white);
		textField6.setSelectedTextColor(Color.black);
		
		textField7=new JTextField("Κινητό τηλέφωνο");
		textField7.setBounds(450, 530, 350, 40);
		textField7.setFont(new Font("Poppins",Font.PLAIN,35));
		textField7.setBackground(Color.white);
		textField7.setSelectedTextColor(Color.black);
		
		textField8=new JTextField("Eπίπεδο εμπειρίας");
		textField8.setBounds(450, 620, 350, 40);
		textField8.setFont(new Font("Poppins",Font.PLAIN,35));
		textField8.setBackground(Color.white);
		textField8.setSelectedTextColor(Color.black);
		
		textField9=new JTextField("Επαγγελματίας?");
		textField9.setBounds(450, 710, 350, 40);
		textField9.setFont(new Font("Poppins",Font.PLAIN,35));
		textField9.setBackground(Color.white);
		textField9.setSelectedTextColor(Color.black);
		
		
		
		
		
		
		
		
		
		
		
		textField2=new JTextField();
		textField2.setVisible(false);
		
		
		
		
		
		
		this.setTitle("Καταχώρηση αθλητή στο σύστημα");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1280,920);
		
		this.setResizable(false);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLocation(325,60);
		this.setIconImage(icon.getImage());
		this.add(textField3);
		this.add(textField1);
		this.add(textField4);
		this.add(textField5);
		this.add(textField6);
		this.add(textField7);
		this.add(textField8);
		this.add(textField9);
		this.add(button);
		this.add(textField2);
		this.setVisible(true);
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
		//	Athlete newAthlete=new Athlete()              //prepei na ftiaxtei constructor gia user kai athlete
			
		}
		
		
	}

}

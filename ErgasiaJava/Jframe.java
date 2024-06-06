package ErgasiaJava;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Jframe extends JFrame implements ActionListener {

	JButton athleteManagement, subscriptionManagement, bookingManagement;

	Jframe() {

		ImageIcon image = new ImageIcon("file.png");

		athleteManagmentButton();

		subscriptionManagmentButton();

		bookingManagmentButton();

		windowLayout(image);
	}

	private void windowLayout(ImageIcon image) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(700, 350);
		this.setLayout(null);
		this.setTitle("Διαχείριση Αθλητικών Ακαδημιών");
		this.setResizable(false);
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.add(bookingManagement);
		this.add(athleteManagement);
		this.add(subscriptionManagement);
		this.setLocation(600, 325);
	}

	private void athleteManagmentButton() {
		athleteManagement = new JButton();
		athleteManagement.setBounds(30, 120, 180, 50);
		athleteManagement.setVisible(true);
		athleteManagement.setText("Διαχείριση Αθλητών");
		athleteManagement.setFocusable(false);
		athleteManagement.addActionListener(this);
	}

	private void subscriptionManagmentButton() {
		subscriptionManagement = new JButton();
		subscriptionManagement.setBounds(250, 120, 180, 50);
		subscriptionManagement.setVisible(true);
		subscriptionManagement.setText("Διαχείριση Συνδρομών");
		subscriptionManagement.setFocusable(false);
		subscriptionManagement.addActionListener(this);
	}

	private void bookingManagmentButton() {
		bookingManagement = new JButton();
		bookingManagement.setBounds(470, 120, 180, 50);
		bookingManagement.setVisible(true);
		bookingManagement.setText("Διαχείριση Κρατήσεων");
		bookingManagement.setFocusable(false);
		bookingManagement.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == athleteManagement) {
			System.out.println("Αθλητές");
		} else if (e.getSource() == subscriptionManagement) {
			System.out.println("Συνδρομές");
		} else if (e.getSource() == bookingManagement) {
			System.out.println("Κρατήσεις");
		}
	}

}

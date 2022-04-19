package view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Welcome extends JFrame {
	
	private JLabel welcomeLabel = new JLabel("Welcome to the student registration system. Please enter your name and ID number below.");
	
	private JLabel nameLabel = new JLabel("Student name:");
	private JTextField studentName = new JTextField(10);
	
	private JLabel idLabel = new JLabel("Student ID:");
	private JTextField idNumber = new JTextField(10);

	private JButton submitButton = new JButton("Submit");
	
	public Welcome(){
		
		Container contentPane = getContentPane();
		
		contentPane.add(welcomeLabel);
		
		JPanel namePanel = new JPanel();
		namePanel.add(nameLabel);
		namePanel.add(studentName);
		
		JPanel idPanel = new JPanel();
		idPanel.add(idLabel);
		idPanel.add(idNumber);
		
		JPanel entryPanel = new JPanel();
		entryPanel.add(namePanel);
		entryPanel.add(idPanel);
		entryPanel.add(submitButton);
		
		contentPane.add(entryPanel);
		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		pack();
		this.setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public int getIdNumber() {
		return Integer.parseInt(idNumber.getText());
	}

	public String getStudentName() {
		return studentName.getText();
	}
	
	public void addActionListener(ActionListener submitListener) {
		submitButton.addActionListener(submitListener);
	}
	
	public void displayMessage(String Message) {
		JOptionPane.showMessageDialog(this, Message);
	}
	
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}

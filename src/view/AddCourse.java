package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddCourse extends JFrame {
	
	private JLabel courseNameLabel = new JLabel("Course name:");
	private JTextField courseName = new JTextField(10);
	private JLabel courseNumberLabel = new JLabel("Course number:");
	private JTextField courseNumber = new JTextField(10);
	private JLabel courseOfferingLabel = new JLabel("Offering number:");
	private JTextField courseOffering = new JTextField(10);
	
	private JLabel addCourseLabel = new JLabel("Please enter the course name, course number and offering number you want to register in.");

	private JButton submitButton = new JButton("Submit");
	
	public AddCourse(){
		
		Container contentPane = getContentPane();
		
		JPanel titlePanel = new JPanel();
		titlePanel.add(addCourseLabel);
		
		JPanel namePanel = new JPanel();
		namePanel.add(courseNameLabel);
		namePanel.add(courseName);
		
		JPanel numberPanel = new JPanel();
		numberPanel.add(courseNumberLabel);
		numberPanel.add(courseNumber);
		
		JPanel offeringPanel = new JPanel();
		offeringPanel.add(courseOfferingLabel);
		offeringPanel.add(courseOffering);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(submitButton);
		
		contentPane.add(titlePanel);
		contentPane.add(namePanel);
		contentPane.add(numberPanel);
		contentPane.add(offeringPanel);
		contentPane.add(buttonPanel);
		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		pack();
		this.setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public int getCourseNumber() {
		return Integer.parseInt(courseNumber.getText());
	}

	public String getCourseName() {
		return courseName.getText();
	}
	
	public int getCourseOffering() {
		return Integer.parseInt(courseOffering.getText());
	}
	
	public void addActionListener(ActionListener submitButtonListener) {
		submitButton.addActionListener(submitButtonListener);
	}
	
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
	
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}

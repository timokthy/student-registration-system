package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RemoveCourse extends JFrame {
	
	private JLabel courseNameLabel = new JLabel("Course name:");
	private JTextField courseName = new JTextField(10);
	private JLabel courseNumberLabel = new JLabel("Course number:");
	private JTextField courseNumber = new JTextField(10);
	
	private JLabel removeCourseLabel = new JLabel("Please enter the course name and course number that you want to drop.");

	private JButton submitButton = new JButton("Submit");
	
	public RemoveCourse() {
		Container contentPane = getContentPane();
		
		JPanel titlePanel = new JPanel();
		titlePanel.add(removeCourseLabel);
		
		JPanel namePanel = new JPanel();
		namePanel.add(courseNameLabel);
		namePanel.add(courseName);
		
		JPanel numberPanel = new JPanel();
		numberPanel.add(courseNumberLabel);
		numberPanel.add(courseNumber);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(submitButton);
		
		contentPane.add(titlePanel);
		contentPane.add(namePanel);
		contentPane.add(numberPanel);
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

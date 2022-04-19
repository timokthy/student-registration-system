package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchCatalogue extends JFrame {

	private JLabel courseNameLabel = new JLabel("Course name:");
	private JTextField courseName = new JTextField(10);
	
	private JLabel searchCatalogueLabel = new JLabel("Please enter a course name that you want to search the catalogue for.");

	private JButton submitButton = new JButton("Submit");
	
	public SearchCatalogue(){
		
		Container contentPane = getContentPane();
		
		JPanel titlePanel = new JPanel();
		titlePanel.add(searchCatalogueLabel);
		
		JPanel namePanel = new JPanel();
		namePanel.add(courseNameLabel);
		namePanel.add(courseName);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(submitButton);
		
		contentPane.add(titlePanel);
		contentPane.add(namePanel);
		contentPane.add(buttonPanel);
		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		pack();
		this.setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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

}

package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

	private JButton addCourseButton = new JButton("Add Course");
	private JButton removeCourseButton = new JButton("Remove Course");
	private JButton viewCourseButton = new JButton("View Currently Registered Courses");
	private JButton searchCatalogueButton = new JButton("Search Course Catalogue");
	private JButton viewCatalogueButton = new JButton("View All Available Courses");
	
	private JLabel menuLabel = new JLabel("This is the main menu. Please select an option below.");
	
	public Menu() {
		
		Container contentPane = getContentPane();
		
		JPanel messagePanel = new JPanel();
		messagePanel.add(menuLabel);
		
		JPanel buttonPanel1 = new JPanel();
		buttonPanel1.add(addCourseButton);
		buttonPanel1.add(removeCourseButton);
		
		JPanel buttonPanel2 = new JPanel();
		buttonPanel2.add(searchCatalogueButton);
		buttonPanel2.add(viewCatalogueButton);
		
		JPanel buttonPanel3 = new JPanel();
		buttonPanel3.add(viewCourseButton);
		
		contentPane.add(messagePanel);
		contentPane.add(buttonPanel1);
		contentPane.add(buttonPanel3);
		contentPane.add(buttonPanel2);

		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		pack();
		this.setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addActionListenerCourseCatalogue(ActionListener searchListener, ActionListener viewListener) {
		searchCatalogueButton.addActionListener(searchListener);
		viewCatalogueButton.addActionListener(viewListener);
	}
	
	public void addActionListenerStudent(ActionListener addCourseListener, ActionListener removeCourseListener,
										 ActionListener viewCourseListener) {
		addCourseButton.addActionListener(addCourseListener);
		removeCourseButton.addActionListener(removeCourseListener);
		viewCourseButton.addActionListener(viewCourseListener);
	}

	
}

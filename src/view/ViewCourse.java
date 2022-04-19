package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewCourse extends JFrame {
	
	private JLabel viewLabel = new JLabel("Please confirm that you would like to view a list of your currently registered courses.");
	private JButton viewButton = new JButton("I confirm");
	private JButton menuButton = new JButton("Return to main menu");
	
	public ViewCourse() {
		Container contentPane = getContentPane();
		
		JPanel titlePanel = new JPanel();
		titlePanel.add(viewLabel);
		
		JPanel confirmPanel = new JPanel();
		confirmPanel.add(viewButton);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(menuButton);
		
		contentPane.add(titlePanel);
		contentPane.add(confirmPanel);
		contentPane.add(buttonPanel);
		
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		pack();
		
		this.setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addActionListener(ActionListener viewButtonListener, ActionListener menuButtonListener) {
		viewButton.addActionListener(viewButtonListener);
		menuButton.addActionListener(menuButtonListener);
	}
	
	public void displayMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

}

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.*;
import model.*;

public class StudentController {
	
	private Student theStudent;
	private Menu theMenu;
	private Welcome welcomeScreen;
	
	public StudentController(Student theStudent, Menu theMenu, Welcome welcomeScreen) {
		this.theStudent = theStudent;
		this.theMenu = theMenu;
		this.welcomeScreen = welcomeScreen;
		
		welcomeScreen.addActionListener(new WelcomeListener());
	}
	
	class WelcomeListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				
				theStudent.setName(welcomeScreen.getStudentName());
				theStudent.setStudentId(welcomeScreen.getIdNumber());
				theStudent.setRegList(new ArrayList<Registration>());
				// For purposes of this assignment, it is assumed that all Students completed the following courses
				ArrayList<Course> completedCourses = new ArrayList<Course>();
				completedCourses.add(new Course("ENSF", 592));
				completedCourses.add(new Course("ENSF", 593));
				theStudent.setCompletedCourses(completedCourses);
				
				String message = "Welcome " + welcomeScreen.getStudentName() + "! You are being directed to the main menu.";
				welcomeScreen.displayMessage(message);
				
				welcomeScreen.setVisible(false);
				welcomeScreen.dispose();
				theMenu.setVisible(true);
			}catch(NumberFormatException ex) {
				welcomeScreen.displayErrorMessage("Error! Invalid ID.");
			}
		}
		
	}

}

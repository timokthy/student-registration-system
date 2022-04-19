package controller;

import java.awt.event.*;
import model.*;
import view.*;

public class RemoveCourseController {
	
	private Student theStudent;
	private Menu theMenu;
	private RemoveCourse removeCourse;
	
	public RemoveCourseController(Student theStudent, Menu theMenu, RemoveCourse removeCourse) {
		this.theStudent = theStudent;
		this.theMenu = theMenu;
		this.removeCourse = removeCourse;
		
		removeCourse.addActionListener(new RemoveSubmitListener());
	}
	
	class RemoveSubmitListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String courseName = removeCourse.getCourseName().toUpperCase();
				int courseNumber = removeCourse.getCourseNumber();
				String message = theStudent.unregister(courseName, courseNumber);;
				removeCourse.displayMessage(message);
				
				removeCourse.setVisible(false);
				removeCourse.dispose();
				theMenu.setVisible(true);
			}catch(NumberFormatException ex) {
				removeCourse.displayErrorMessage("Error! Invalid number. Please enter a valid course number.");
			}
		}
	}

}

package controller;

import java.awt.event.*;

import model.*;
import view.*;

public class AddCourseController {
	
	private Student theStudent;
	private Menu theMenu;
	private AddCourse addCourse;
	private CourseCatalogue courseCatalogue;
	
	public AddCourseController(Student theStudent, Menu theMenu, AddCourse addCourse, CourseCatalogue courseCatalogue) {
		this.theStudent = theStudent;
		this.theMenu = theMenu;
		this.addCourse = addCourse;
		this.courseCatalogue = courseCatalogue;
		
		addCourse.addActionListener(new AddSubmitListener());
	}
	
	class AddSubmitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String courseName = addCourse.getCourseName().toUpperCase();
				int courseNumber = addCourse.getCourseNumber();
				int courseOffering = addCourse.getCourseOffering();
				String message = theStudent.registerForCourse(courseCatalogue, courseName, courseNumber, courseOffering);
				addCourse.displayMessage(message);
				
				addCourse.setVisible(false);
				addCourse.dispose();
				theMenu.setVisible(true);
			}catch(NumberFormatException ex) {
				addCourse.displayErrorMessage("Error! Invalid number. Please enter a valid course and offering number.");
			}
		}
	}

}

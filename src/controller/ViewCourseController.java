package controller;

import java.awt.event.*;
import model.*;
import view.*;

public class ViewCourseController {
	
	private Student theStudent;
	private Menu theMenu;
	private ViewCourse viewCourse;
	
	public ViewCourseController(Student theStudent, Menu theMenu, ViewCourse viewCourse) {
		this.theStudent = theStudent;
		this.theMenu = theMenu;
		this.viewCourse = viewCourse;
		
		viewCourse.addActionListener(new ViewListener(), new MenuListener());
	}
	
	class ViewListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String message = theStudent.toString();
			viewCourse.displayMessage(message);
			viewCourse.setVisible(false);
			viewCourse.dispose();
			theMenu.setVisible(true);
		}
	}
	
	class MenuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			viewCourse.setVisible(false);
			viewCourse.dispose();
			theMenu.setVisible(true);
		}
	}

}

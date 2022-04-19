package controller;

import java.awt.event.*;
import view.*;

public class MenuController {
	
	private Menu theMenu;
	private AddCourse addCourse;
	private RemoveCourse removeCourse;
	private ViewCourse viewCourse;
	private SearchCatalogue searchCatalogue;
	private ViewCatalogue viewCatalogue;
	
	public MenuController(Menu theMenu, AddCourse addCourse, RemoveCourse removeCourse, ViewCourse viewCourse, 
						SearchCatalogue searchCatalogue, ViewCatalogue viewCatalogue) {
		this.theMenu = theMenu;
		this.addCourse = addCourse;
		this.removeCourse = removeCourse;
		this.viewCourse = viewCourse;
		this.searchCatalogue = searchCatalogue;
		this.viewCatalogue = viewCatalogue;
		
		theMenu.addActionListenerStudent(new AddCourseListener(), new RemoveCourseListener(), new ViewCourseListener());
		theMenu.addActionListenerCourseCatalogue(new SearchCatalogueListener(), new ViewCatalogueListener());
	}
	
	class AddCourseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			theMenu.setVisible(false);
			theMenu.dispose();
			addCourse.setVisible(true);
		}
	}
	
	class RemoveCourseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			theMenu.setVisible(false);
			theMenu.dispose();
			removeCourse.setVisible(true);
		}
	}
	
	class ViewCourseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			theMenu.setVisible(false);
			theMenu.dispose();
			viewCourse.setVisible(true);
		}
	}
	
	class SearchCatalogueListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			theMenu.setVisible(false);
			theMenu.dispose();
			searchCatalogue.setVisible(true);
		}
	}
	
	class ViewCatalogueListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			theMenu.setVisible(false);
			theMenu.dispose();
			viewCatalogue.setVisible(true);
		}
	}

}

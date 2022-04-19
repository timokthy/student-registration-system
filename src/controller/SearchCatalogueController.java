package controller;

import java.awt.event.*;
import model.*;
import view.*;

public class SearchCatalogueController {
	
	private Menu theMenu;
	private SearchCatalogue searchCatalogue;
	private CourseCatalogue courseCatalogue;
	
	public SearchCatalogueController(Menu theMenu, SearchCatalogue searchCatalogue, CourseCatalogue courseCatalogue) {
		this.theMenu = theMenu;
		this.searchCatalogue = searchCatalogue;
		this.courseCatalogue = courseCatalogue;
		
		searchCatalogue.addActionListener(new SubmitListener());
	}
	
	class SubmitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String courseName = searchCatalogue.getCourseName().toUpperCase();
			String message = courseCatalogue.searchCat(courseName);
			searchCatalogue.displayMessage(message);
			
			searchCatalogue.setVisible(false);
			searchCatalogue.dispose();
			theMenu.setVisible(true);
		}
	}

}

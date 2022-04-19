package controller;

import java.awt.event.*;
import model.*;
import view.*;

public class ViewCatalogueController {
	
	private Menu theMenu;
	private ViewCatalogue viewCatalogue;
	private CourseCatalogue courseCatalogue;
	
	public ViewCatalogueController(Menu theMenu, ViewCatalogue viewCatalogue, CourseCatalogue courseCatalogue) {
		this.theMenu = theMenu;
		this.viewCatalogue = viewCatalogue;
		this.courseCatalogue = courseCatalogue;
		
		viewCatalogue.addActionListener(new ConfirmListener(), new MenuListener());
	}
	
	class ConfirmListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String message = courseCatalogue.listCourses();
			viewCatalogue.displayMessage(message);
			
			viewCatalogue.setVisible(false);
			viewCatalogue.dispose();
			theMenu.setVisible(true);
		}
	}
	
	class MenuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			viewCatalogue.setVisible(false);
			viewCatalogue.dispose();
			theMenu.setVisible(true);
		}
	}

}

import controller.*;
import model.*;
import view.*;

public class StudentRegistrationApp {
	
	public static void main(String[] args) {
		
		Student theStudent = new Student();
		CourseCatalogue theCatalogue = new CourseCatalogue();
		
		Welcome welcomeScreen = new Welcome();
		Menu theMenu = new Menu();
		AddCourse addCourse = new AddCourse();
		RemoveCourse removeCourse = new RemoveCourse();
		ViewCourse viewCourse = new ViewCourse();
		SearchCatalogue searchCatalogue = new SearchCatalogue();
		ViewCatalogue viewCatalogue = new ViewCatalogue();
		
		StudentController theStudentController = new StudentController(theStudent, theMenu, welcomeScreen);
		MenuController  theStudentMainMenu = new MenuController(theMenu, addCourse, removeCourse, viewCourse, searchCatalogue, viewCatalogue);
		AddCourseController addCourseController = new AddCourseController(theStudent, theMenu, addCourse, theCatalogue);
		RemoveCourseController removeCourseController = new RemoveCourseController(theStudent, theMenu, removeCourse);
		ViewCourseController viewCourseController = new ViewCourseController(theStudent, theMenu, viewCourse);
		SearchCatalogueController searchCatalogueController = new SearchCatalogueController(theMenu, searchCatalogue, theCatalogue);
		ViewCatalogueController viewCatalogueController = new ViewCatalogueController(theMenu, viewCatalogue, theCatalogue);
		welcomeScreen.setVisible(true);
		
	}

}

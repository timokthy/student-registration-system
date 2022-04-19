package model;

import java.util.ArrayList;

public class CourseCatalogue {

private ArrayList<Course> courseList;
	
	public CourseCatalogue() {
		courseList = loadFromDB();
	}
	
	public String listCourses() {
		StringBuffer listOfCourses = new StringBuffer();
		listOfCourses.append(this.toString());
		return listOfCourses.toString();
	}

	public Course searchCat(String courseName, int courseNumber) {
		
		for(Course c: courseList) {
			if(c.getCourseName().equals(courseName) && 
					c.getCourseNumber() == courseNumber) {
				return c;
			}
		}
		return null;
	}
	
	private static ArrayList<Course> loadFromDB(){
		
		ArrayList<Course> imaginaryDB = new ArrayList<Course>();
		
		imaginaryDB.add(new Course("ENGG", 201));
		imaginaryDB.add(new Course("ENGG", 233));
		imaginaryDB.add(new Course("PHYS", 259));
		imaginaryDB.add(new Course("PHYS", 369));
		imaginaryDB.add(new Course("ENSF", 607));
		imaginaryDB.add(new Course("ENSF", 608));
		imaginaryDB.add(new Course("ENSF", 611));
		imaginaryDB.add(new Course("ENSF", 612));
		imaginaryDB.add(new Course("ENSF", 614));
		
		// Add prerequisites to the courses
		for(Course c: imaginaryDB) {
			c.addPrerequisite(new Course("ENSF", 592));
			c.addPrerequisite(new Course("ENSF", 593));
		}
		
		// Add an additional prerequisite that the sample student hasn't completed to PHYS 259/369
		imaginaryDB.get(2).addPrerequisite(new Course("ENSF", 594));
		imaginaryDB.get(3).addPrerequisite(new Course("ENSF", 594));
		
		// Create three offerings for each course
		for(Course c: imaginaryDB) {
			c.addOffering(new CourseOffering(c, 1, 200));
			c.addOffering(new CourseOffering(c, 2, 200));
			c.addOffering(new CourseOffering(c, 3, 200));
		}
		return imaginaryDB;
	}
	
	public String searchCat (String courseName) {
		
		StringBuffer message = new StringBuffer();
		message.append("These are all the " + courseName + " courses offered this term:");
		
		StringBuffer foundCourses = new StringBuffer();
		for(Course c: courseList) {		
			if(c.getCourseName().equals(courseName)) {
				foundCourses.append("\n" + c.getCourseName() + c.getCourseNumber());
			}
		}
		
		if(foundCourses.length() == 0) {
			return "No courses with that course name are offered this term.";
		}
		else {
			message.append(foundCourses);
			return message.toString();
		}
	}
	
	@Override
	public String toString() {
		StringBuffer temp = new StringBuffer();
		for(Course c: courseList) {
			temp.append(c);
		}
		return temp.toString();
	}
	
	public ArrayList <Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList <Course> courseList) {
		this.courseList = courseList;
	}
}

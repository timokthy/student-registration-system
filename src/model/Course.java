package model;

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private int courseNumber;
	private ArrayList<Course> prerequisites;
	private ArrayList<CourseOffering> offeringList;
	
	public Course(String courseName, int courseNumber) {
		this.setCourseName(courseName);
		this.setCourseNumber(courseNumber);
		prerequisites = new ArrayList<Course>();
		offeringList = new ArrayList<CourseOffering>();
	}
	
	public void addOffering (CourseOffering theOffering) {
		offeringList.add(theOffering);
	}
	
	public void addPrerequisite (Course prerequisite) {
		prerequisites.add(prerequisite);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public ArrayList<Course> getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(ArrayList<Course> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public ArrayList<CourseOffering> getOfferingList() {
		return offeringList;
	}

	public void setOfferingList(ArrayList<CourseOffering> offeringList) {
		this.offeringList = offeringList;
	}
	
	@Override
	public String toString() {
		String st = "";
		st += "\n";
		st += courseName + " " + courseNumber;
	    st += "\n";
		for (CourseOffering offering : offeringList)
			st += offering; 
		return st;
	}
	

}

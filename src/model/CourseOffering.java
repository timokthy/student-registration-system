package model;

import java.util.ArrayList;

public class CourseOffering {
	
	private int sectionNum;
	private int sectionCap;
	private Course theCourse;
	private ArrayList<Registration> studentList;
	
	public CourseOffering(Course theCourse, int sectionNum, int sectionCap) {
		this.setSectionNum(sectionNum);
		this.setSectionCap(sectionCap);
		this.setTheCourse(theCourse);
		studentList = new ArrayList<Registration>();
	}
	
	public void addRegistration(Registration reg) {
		studentList.add(reg);
	}

	public int getSectionNum() {
		return sectionNum;
	}

	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}

	public int getSectionCap() {
		return sectionCap;
	}

	public void setSectionCap(int sectionCap) {
		this.sectionCap = sectionCap;
	}

	public Course getTheCourse() {
		return theCourse;
	}

	public void setTheCourse(Course theCourse) {
		this.theCourse = theCourse;
	}
	
	public ArrayList<Registration> getStudentList() {
		return studentList;
	}
	
	public void setStudentList(ArrayList <Registration> studentList) {
		this.studentList = studentList;
	}
	
	@Override
	public String toString () {
		String st = "";
		st += "Section Number: " + sectionNum + ", Section capacity: " + sectionCap + "\n";
		return st;
	}

}

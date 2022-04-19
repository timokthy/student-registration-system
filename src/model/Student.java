package model;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int studentId;
	private ArrayList<Registration> regList;
	private ArrayList<Course> completedCourses;
	
	
	public String registerForCourse(CourseCatalogue cat, String courseName, int courseNumber, int secNumber) {
		if(regList.size() >= 6) {
			return "You are already registered in the maximum number of courses.";
		}
		
		Course myCourse = cat.searchCat(courseName, courseNumber);
		
		if(myCourse == null) {
			return "There is no course matching that name and number offered this semster.";
		}
		
		for(Registration r: regList) {
			if(r.getTheOffering().getTheCourse().getCourseName().equals(myCourse.getCourseName())
					&& r.getTheOffering().getTheCourse().getCourseNumber() == myCourse.getCourseNumber()) {
				return "You are already registered in this course.";
			}
		}
		
		if(secNumber > 3) {
			return "The maximum offering number is 3. Please try again.";
		}

		CourseOffering theOffering = myCourse.getOfferingList().get(secNumber - 1);
		Registration reg = new Registration();
		String message = reg.register(this, theOffering);
		
		return message;
	}
	
	public String unregister(String courseName, int courseNumber) {
		for(int i = 0; i < regList.size(); i++) {
			if(regList.get(i).getTheOffering().getTheCourse().getCourseName().equals(courseName)
					&& regList.get(i).getTheOffering().getTheCourse().getCourseNumber() == courseNumber) {
				regList.remove(i);
				return "You have unregistered from " + courseName + courseNumber;
			}
		}
		return "You are not enrolled in " + courseName + courseNumber + ".";
	}
	
	public void addRegistration(Registration reg) {
		regList.add(reg);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public ArrayList<Registration> getRegList() {
		return regList;
	}

	public void setRegList(ArrayList<Registration> regList) {
		this.regList = regList;
	}
	
	@Override
	public String toString () {
		if(regList.isEmpty()) {
			return "You have not registered for any courses yet.";
		}
		
		StringBuffer st = new StringBuffer();
		st.append("This is a list of courses you are currently registered in:\n");
		for(Registration r: regList) {
			st.append(r.toString());
		}
		return st.toString();
	}

	public ArrayList<Course> getCompletedCourses() {
		return completedCourses;
	}

	public void setCompletedCourses(ArrayList<Course> completedCourses) {
		this.completedCourses = completedCourses;
	}

}

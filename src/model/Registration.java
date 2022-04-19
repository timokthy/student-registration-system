package model;

public class Registration {
	
	private Student theStudent;
	private CourseOffering theOffering;
	private char grade;
	
	public String register(Student theStudent, CourseOffering theOffering) {
		setTheStudent(theStudent);
		setTheOffering(theOffering);
		if(checkPrerequisites(theOffering.getTheCourse(), theStudent)) {
			addRegistration();
			StringBuffer message = new StringBuffer();
			message.append("You have successfully enrolled in " + theOffering.getTheCourse().getCourseName()
					+ theOffering.getTheCourse().getCourseNumber() + " section #" + theOffering.getSectionNum());
			if(theOffering.getStudentList().size() < 8) {
				message.append("\nPlease note there are currently " + theOffering.getStudentList().size()
				+ " student(s) enrolled in this course offering. A minimum of 8 students is required for a course to run.");
			}
			return message.toString();
		}
		else {
			return "Prerequisites not met. You cannot register for this course.";
		}
	}
	
	private void addRegistration() {
		theStudent.addRegistration(this);
		theOffering.addRegistration(this);	
	}
	
	public boolean checkPrerequisites(Course theCourse, Student theStudent) {
		boolean[] prerequisiteCheck = new boolean[theCourse.getPrerequisites().size()];
		
		for(int i = 0; i < theCourse.getPrerequisites().size(); i++) {
			for(Course c: theStudent.getCompletedCourses()) {
				if(c.getCourseName().equals(theCourse.getPrerequisites().get(i).getCourseName())
						&& c.getCourseNumber() == theCourse.getPrerequisites().get(i).getCourseNumber()){
					prerequisiteCheck[i] = true;
				}
			}
		}
		
		for(boolean p: prerequisiteCheck) {
			if(p == false) {
				return false;
			}
		}
		
		return true;
	}

	public Student getTheStudent() {
		return theStudent;
	}

	public void setTheStudent(Student theStudent) {
		this.theStudent = theStudent;
	}

	public CourseOffering getTheOffering() {
		return theOffering;
	}

	public void setTheOffering(CourseOffering theOffering) {
		this.theOffering = theOffering;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		StringBuffer st = new StringBuffer();
		st.append(theOffering.getTheCourse().getCourseName());
		st.append(theOffering.getTheCourse().getCourseNumber());
		st.append(", Section#" + theOffering.getSectionNum() + "\n");
		return st.toString();
	}

}

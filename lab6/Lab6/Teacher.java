package Lab6;

public class Teacher extends Person {
	
	private int numCourses;
	private String[] courses = new String[10];
	public Teacher(String name, String address) {
		super(name, address);
	}
	public String toString() {
		return "Teacher [numCourses=" + numCourses +","
				+ super.toString() + "]";
	}
	public boolean addCourse(String name) {
		courses[numCourses] = course;
		numCourses++; 
		return true;
	}
	public boolean removeCourse(String name) {
		
		for(int i = 0; i < numCourses; i++) {
			if(courses[i].equalsIgnoreCase(course)) {
				courses[i] = null;
				for(int j = i; j < numCourses - 1; j++) {
					courses[j] = courses[j +1];
				}
			}
		}
		numCourses--;
		
		return true;
	}
}

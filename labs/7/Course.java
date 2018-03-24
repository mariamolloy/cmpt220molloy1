public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
              
	public Course(String courseName) {
		this.courseName = courseName;
	}
                    
	public void addStudent(String student) { 
		if (numberOfStudents == students.length) {
			String[] a = new String[students.length + 1];
			for (int i = 0; i < students.length; i++) {
				a[i] = students[i];
			}
			students = a;
			
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
		
	}
                   
	public String[] getStudents() {
		String[] arr = new String[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			arr[i] = students[i];
		}
		return arr;
	}
                   
	public int getNumberOfStudents() { 
		return numberOfStudents;
	 }
                   
	public String getCourseName() {
		return courseName;
	}
                   
	public void dropStudent(String student) { 
		int index = 0;
		String[] s = new String[students.length - 1];
		for (int i = 0; i < students.length; i++) {
			if (student == students[i]) {
				index = i;
			}
		}
		for (int j = 0; j < s.length; j++) {
			if (j != index) {
				s[j] = students[j];
			}
			else {
				j++;
				s[j] = students[j];
			}
		}
		this.students = s;
		numberOfStudents--;
	}
	
	public void clear() {
		String[] cl = new String[0];
		this.students = cl;
		numberOfStudents = 0;
	}
}
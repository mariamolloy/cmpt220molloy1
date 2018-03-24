
public class CourseTest10_9 {

	public static void main(String[] args) {
		Course myCourse = new Course("CMPT220");
		
		myCourse.addStudent("Kim");
		myCourse.addStudent("Kourtney");
		myCourse.addStudent("Khloe");
		
		myCourse.dropStudent("Khloe");
		
		String[] myStudents = myCourse.getStudents();
		for (int i = 0; i < myCourse.getNumberOfStudents(); i++) {
			System.out.println(myStudents[i]);
		}

	}

}

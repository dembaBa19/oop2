package oop2;

public class CourseTest {
	public static void main(String[] args) {
		//filling courses
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		//priniting course1
		course1.print();
		
		//droppingStudent and printing
		course1.dropStudent("Kim Smith");
		course1.print();
		
		//printing course2
		course2.print();
		}
}


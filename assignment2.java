import java.util.*;

	class Student {
	float marks;
	String name;
	int id;
	char grade;
	static int totalStudents = 0;
	
	Student() {
		name = "unidentified";
		id = 0;
		marks = 0;
		grade = 'N';
		totalStudents++;
	}
	
	Student(String name, int id, float marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.grade = calculateGrade(marks);
		totalStudents++;
	}
	
	char calculateGrade(float marks) {
		if (marks >= 90)
			return 'A';
		else if (marks >= 75)
			return 'B';
		else if (marks >= 60)
			return 'C';
		else if (marks >= 40)
			return 'D';
		else
			return 'F';
	}
	
	void display() {
		System.out.println("\n--- Student Details ---");
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Marks : " + marks);
		System.out.println("Grade : " + grade);
	} 
}
	
public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of students: ");
	int n = sc.nextInt();
	sc.nextLine();
	Student[] students = new Student[n];
	
	for (int i = 0; i < n; i++) {
		System.out.println("\nEnter details for student " + (i + 1));
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		System.out.print("Enter marks: ");
		float marks = sc.nextFloat();
		sc.nextLine();
		students[i] = new Student(name, id, marks);
	}
	System.out.println("\n===== STUDENT PERFORMANCE DETAILS =====");
	for (Student s : students) {
		s.display();
	}
	System.out.println("\nTotal Students Created: " + Student.totalStudents);
	
	sc.close();
	}  
}

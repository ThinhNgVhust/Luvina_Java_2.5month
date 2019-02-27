import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	List<Student> students = new ArrayList<Student>();

	public void addStudent(String name, double diem) {
		this.students.add(new Student(name, diem));
	}

	public void printListStudent() {
		System.out.println("List student");
		for (Student student : students) {
			System.out.println("\n----------------------");
			System.out.println(student);
		}
	}
}

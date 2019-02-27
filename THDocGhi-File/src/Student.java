
public class Student {
	private String name;
	private double diem;
public static int i = 0;
	public Student(String name, double diem) {
		this.name = name;
		this.diem = diem;
	}

	@Override
	public String toString() {
		i++;
		return "Student "+ i + " [name=" + name + ", diem=" + diem + "]";
	}

	public String getName() {
		return name;
	}

	public double getDiem() {
		return diem;
	}

}

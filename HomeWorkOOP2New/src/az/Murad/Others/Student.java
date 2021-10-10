package az.Murad.Others;

public class Student extends Person implements Crud {

	private String studentId;

	void doHomeWork() {
	}

	public Student() {
		System.out.println("It is Student !");
	}

	@Override
	public void add(Crud cr) {
		Student st = (Student)cr;
		System.out.println("successfully added ! "+ name);

	}

	@Override
	public void update(Crud cr) {
		System.out.println("successfully updated ! ");

	}

	@Override
	public void delete(Crud cr) {
		System.out.println("successfully deleted ! ");

	}

	@Override
	public void search(Crud cr) {
		System.out.println("successfully searched ! ");

	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

}

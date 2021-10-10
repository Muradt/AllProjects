package az.Murad.Others;

public class Students extends Person implements CommonFeature {
	private String studentID;
	private Lesson ls;

	public void doExam() {

	}

	public String getStudentID() {
		return studentID;
	}

	public Lesson getLs() {
		return ls;
	}

	public Students(Person p, Lesson ls, String studentid) {
		super(p.name,p.surName,p.age,p.phoneNumber,p.address);
		this.ls = ls;
		this.studentID = studentid;

	}

	public void add() {
		super.add("Student");
	}

	public void update() {
		super.update("Student");
	}

	public void delete() {
		super.delete("Student");
	}

	public void search() {
		super.search("Student");
	}

}

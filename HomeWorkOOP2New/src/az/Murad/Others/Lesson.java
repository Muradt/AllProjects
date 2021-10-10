package az.Murad.Others;

public class Lesson implements Crud {

	private String lessonName;
	private String instructor;

	void learnLesson() {
	}
	public Lesson() {
		System.out.println("It is Lesson !");
	}

	@Override
	public void add(Crud cr) {
		System.out.println("successfully added ! ");

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

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	

}

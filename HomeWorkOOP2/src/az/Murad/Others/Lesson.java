package az.Murad.Others;

public class Lesson implements CommonFeature {
	private String lessonName;
	private String instructor;

	public void beTaught() {

	}

	public Lesson(String lessonName, String instructor) {
		this.lessonName = lessonName;
		this.instructor = instructor;
	}

	public String getLesson() {
		return lessonName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void add() {
		CommonFeature.super.add("Lesson");
	}

	public void update() {
		CommonFeature.super.add("Lesson");
	}

	public void delete() {
		CommonFeature.super.add("Lesson");
	}

	public void search() {
		CommonFeature.super.add("Lesson");
	}
}

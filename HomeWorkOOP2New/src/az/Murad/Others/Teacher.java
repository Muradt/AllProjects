package az.Murad.Others;

public class Teacher extends Person implements Crud {
	private String teacherId;
	
	void teach() {
	}
	
	public Teacher() {
		System.out.println("It is Teacher !");
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

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

}

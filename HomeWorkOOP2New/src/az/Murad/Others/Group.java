package az.Murad.Others;

public class Group implements Crud {

	private String groupName;
	private int numOfMembers;
	
	void doGroupWork() {
		
	}

	public Group() {
		System.out.println("It is Group !");
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

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getNumOfMembers() {
		return numOfMembers;
	}

	public void setNumOfMembers(int numOfMembers) {
		this.numOfMembers = numOfMembers;
	}

	
}

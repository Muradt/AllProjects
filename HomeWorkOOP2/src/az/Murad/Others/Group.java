package az.Murad.Others;

public class Group implements CommonFeature {
	public int members;
	public String groupName;
	public void doGroupWork() {

	}
	
	public void add() {
		CommonFeature.super.add("Group");
	}

	public void update() {
		CommonFeature.super.add("Group");
	}

	public void delete() {
		CommonFeature.super.add("Group");
	}

	public void search() {
		CommonFeature.super.add("Group");
	}
}

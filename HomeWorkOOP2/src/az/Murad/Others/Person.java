package az.Murad.Others;

public class Person implements CommonFeature {
	protected String name;
	protected String surName;
	protected byte age;
	protected String phoneNumber;
	protected String address;

	public Person(String name, String surName, byte age, String phoneNumber, String address) {
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;

	}

	protected void breath() {
	}

	public String getName() {
		return name;
	}

	public String getSurName() {
		return surName;
	}

	public byte getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void add() {
		CommonFeature.super.add("Person");
	}

	public void update() {
		CommonFeature.super.add("Person");
	}

	public void delete() {
		CommonFeature.super.add("Person");
	}

	public void search() {
		CommonFeature.super.add("Person");
	}

}

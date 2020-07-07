package oops;

public enum Gender {

	Male("Male"), Female("Female");
	private final String name;

	private Gender(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}
}

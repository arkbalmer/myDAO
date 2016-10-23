package entity;

public class Subject extends Entity{
	
	private String name;
	
	public Subject() {
		super();
	}

	public Subject(Long id) {
		super(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

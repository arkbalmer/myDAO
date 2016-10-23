package entity;

import java.util.List;

public class Student extends Entity{
	
	private String name;
	
	
	public Student(Long id, String str) {
		this.name = str;
	}

	public Student(Long id) {
		super(id);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

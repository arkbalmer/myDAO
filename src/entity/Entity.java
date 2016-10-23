package entity;

import java.io.Serializable;

public class Entity implements Serializable{

	private static final long serialVersionUID = -8159395521414677065L;
	
	private Long id;
	
	public Entity() {
		
	}
	
	public Entity(Long id) {
		
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

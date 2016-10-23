package entity;

public class Mark extends Entity{
	
	private Byte mark;
	
	public Mark() {
		super();
	}

	public Mark(Long id) {
		super(id);
	}

	public Byte getMark() {
		return mark;
	}

	public void setMark(Byte mark) {
		this.mark = mark;
	}

	
	
}

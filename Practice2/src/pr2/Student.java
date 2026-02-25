package pr2;

public class Student {
	private String name;
	private int id;
	private int yos;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		this.yos = 1;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getYos() {
		return yos;
	}
	
	public void IncreaseYos() {
		yos++;
	}
	
}

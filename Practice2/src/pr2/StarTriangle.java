package pr2;

public class StarTriangle {
	
	private int width;
	
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
	
	public String toString() {
		
		String s = "";
		
		for(int i = 0; i <=  width; i++) {
			for(int j = 0; j < i; j++) {
				s += "[*]";
			}
			
			s += "\n";
		}
		
		return s;
	}
	
	
}

package pr2;

public class StudentTest {

	public static void main(String[] args) {
		
		Student retake = new Student("Sanya", 67);
		
		System.out.println(retake.getName());
		System.out.println(retake.getId());
		System.out.println(retake.getYos());
		
		
		retake.IncreaseYos();
		
		System.out.println(retake.getYos());
	}

}

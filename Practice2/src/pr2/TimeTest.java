package pr2;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t1 = new Time(0, 0, -59);
		
		Time t2 = new Time(0, 0, -3);
		
		System.out.println(t1.toStandard());
		System.out.println(t1.toUniversal());
		
		System.out.println(t2.toStandard());
		System.out.println(t2.toUniversal());
		
		
		t1.add(t2);
		
		System.out.println("After adding");
		System.out.println(t1.toStandard());
		System.out.println(t1.toUniversal());

	}

}

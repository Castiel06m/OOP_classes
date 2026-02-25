package pr1;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		System.out.println("Perimetr");
		System.out.println(4 * a);
		System.out.println("Area");
		System.out.println(a*a);
		System.out.println("L of diag");
		System.out.println(a * Math.sqrt(2));

		
		scan.close();

	}

}

package pr1;

import java.util.Scanner;
public class task4 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int D = b*b - 4*a*c;
		
		if (D > 0) {
			int x1 = (int) (-b + Math.sqrt(D) / 2 * a);		
			int x2 = (int) (-b - Math.sqrt(D) / 2 * a);
			
			System.out.println(x1);
			System.out.println(x2);
		}else if (D == 0) {
			int x = -b / 2 * a;
			
			System.out.println(x);
		}else {
			System.out.println("No Roots");
		}
		
		
		scan.close();

	}

}

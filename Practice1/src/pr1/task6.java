package pr1;

import java.util.Scanner;
public class task6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String txt = scan.nextLine();
		
		String rev = "";
		
		for ( int i = txt.length() - 1; i >= 0; i--) {
			rev += txt.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equals(txt)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		scan.close();
	}

}

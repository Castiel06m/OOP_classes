package pr1;

import java.util.Scanner;
public class task3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int grade = scan.nextInt();
		
		if(grade < 60 && grade >= 0) {
			System.out.println("F-");
		} else if(grade >= 60 && grade < 80) {
			System.out.println("C");
		}else if (grade >= 80 && grade < 90) {
			System.out.println("B");
		}else if (grade >= 90 && grade <= 100) {
			System.out.println("A");
		}else {
			System.out.println("Type a valid grade");
		}
		
		
		scan.close();
	}

}

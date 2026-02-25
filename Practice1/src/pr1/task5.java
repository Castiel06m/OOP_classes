package pr1;

import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int balance = scan.nextInt();
		
		System.out.println("Type your interest in % : ");
		int interest = scan.nextInt();
		
		int bal2 = balance + (balance * interest / 100);
		
		System.out.println("Balance after interest: ");
		System.out.println(bal2);
		scan.close();
	}

}

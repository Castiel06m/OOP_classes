package pr1;

import java.util.Scanner;

public class task1 { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		System.out.println("+"+"-".repeat(name.length()) +"+");
		System.out.println("|"+name+"|");
		System.out.print("+"+"-".repeat(name.length()) +"+");
		
		scan.close();
	}

}

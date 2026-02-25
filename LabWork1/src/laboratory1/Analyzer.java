package laboratory1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Data dataset = new Data();
        
        System.out.println("Enter numbers (Type 'Q' to quit):");

        while (true) {
            System.out.print("Enter number: ");
            String input = in.next();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                dataset.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'Q' to quit.");
            }
        }

        System.out.println(dataset.getAvg());
        System.out.println(dataset.getMax());
        
        in.close();
    }
}

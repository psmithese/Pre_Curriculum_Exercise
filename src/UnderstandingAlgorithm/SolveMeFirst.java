package UnderstandingAlgorithm;

import java.util.Scanner;

public class SolveMeFirst {
    public static void main(String[] args){
        // ask user for the first value
        System.out.println("Enter value for a");
        Scanner scanner = new Scanner(System.in);
        // receive the value and save it to a variable
        int a = scanner.nextInt();
        // ask user for the second value
        System.out.println("Enter value for b");
        // receive the value and sve it to another variable
        int b = scanner.nextInt();
        // create a variable for the sum of the first value and second value
        int sum = a + b;

        scanner.close();

        //ask user to print out the sum of the two value
        System.out.println(sum);
    }
}

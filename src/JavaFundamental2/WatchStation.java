package JavaFundamental2;

import java.util.Scanner;

public class WatchStation {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner scanner = new Scanner((System.in));
        int age = scanner.nextInt(); //variable

        if (age >= 18) {   //control flow
            System.out.println("You are of age to watch this tv station ACCESS GRANTED");
        } else {
            System.out.println("You are under age ACCESS DENIED");
        }
        scanner.close();
    }
}

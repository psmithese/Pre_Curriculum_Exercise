package Exercise1;

import java.util.Scanner;
/*
Create a program that asks a user for a season of the year, a whole number, then an adjective.
Use the input to complete the sentence below then output the result:
“On a [adjective] [season of the year] say, I drink a minimum of [whole number] cups of coffee.”

 */
public class seasonGreetings {
    public static void main(String[] args){
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();
        System.out.println("Enter weather condition");
        String adjective = scanner.next();
        System.out.println("Enter number of times");
        int wholeNumber = scanner.nextInt();

        System.out.println("On a " + adjective + " " + season + " of the year say, " +
                "I drink a minimum of " + wholeNumber + " " + "cups of coffee.");
    }
}

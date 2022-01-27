package Exercise1;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args){
        System.out.println("Enter the number of pennies you have");
        Scanner scanner = new Scanner(System.in);

        double pennies = scanner.nextDouble();
        double penniesToDollar = pennies/100;

        System.out.println("Enter the number of nickels you have");

        double nickels = scanner.nextDouble();
        double nickelsToDollar = nickels/20;

        System.out.println("Enter the amount of dimes you have");
        double dimes = scanner.nextDouble();
        double dimesToDollar = dimes/10;

        System.out.println("Enter the number of quarter you have");
        double quarter = scanner.nextDouble();
        double quarterToDollar = quarter/4;

        double totalCoinInDollar = penniesToDollar + nickelsToDollar + dimesToDollar + quarterToDollar;

        System.out.println(totalCoinInDollar);

        if(totalCoinInDollar == 1){
            System.out.println("Congratulation you Win");
        }else if(totalCoinInDollar > 1){
            double difference = totalCoinInDollar - 1;
                    System.out.println("Sorry you went over with $" + difference);
        }if(totalCoinInDollar < 1){
            double difference = 1 - totalCoinInDollar;
                    System.out.println("Sorry you are short with $" + difference);
        }
        scanner.close();
    }
}

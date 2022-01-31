package JavaFundamental2;

import java.util.Random;

public class RollADice {
    public static void main(String[] args){

        int numberOfRoll = 5;
        int boardSpace = 20;
        int currentSpace = 0;

        Random random = new Random();


        for(int i =1; i <= numberOfRoll; i++){
            int randomNumber = random.nextInt(6) + 1;
            currentSpace = currentSpace + randomNumber;
            System.out.println(String.format("Roll #%d: You have rolled a " + randomNumber + ". ", i, randomNumber));

            if(currentSpace == boardSpace){
                System.out.print("You are on board space " + currentSpace + " Congratulation, You Win ");
                break;
            }else if(currentSpace > boardSpace){
                System.out.print("You are pass " + boardSpace + " space. Sorry You Lose");
                break;
            }else if(i == numberOfRoll && currentSpace < boardSpace){
                System.out.println("You are on space " + currentSpace);
                System.out.println("You did not complete " + boardSpace +  " space. You lose");
            }else{
                int spaceLeft = boardSpace - currentSpace;
                System.out.print("You are on space " + currentSpace + " and have " + spaceLeft + " left");
            }
            System.out.println();
        }
    }
}

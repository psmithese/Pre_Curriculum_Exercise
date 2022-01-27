package Exercise1;

import java.util.Scanner;
/*
Write a program that first tells the user welcome to my workstation,
ask the user to enter his or her name and display welcome [user name].
 */
public class WelcomeToWorkstation {
    public static void main(String[] args){
        System.out.println("Welcome to my Workstation");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();

        System.out.println("Welcome " + name);
    }

}

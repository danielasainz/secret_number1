package com.company;


import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        boolean done = false;
        String result = "";
        //must declare int number and int x
        int number;
        int x;
        Scanner scan = new Scanner(System.in);

        //Must be outside the while loop!
        Random r = new Random();
        // x here is related to int x above
        x = 1 + r.nextInt(10);


        while (done != true) {

            System.out.print("I'm thinking of a number from 1 to 10. What is it? ");
            System.out.print("Enter your number: ");
            number = scan.nextInt();
            scan.nextLine();

            if (number == x) {
                System.out.println("You are right! Congrats!");
            } else if (number < x) {
                System.out.print("Your guess was too low, try again? (Y/N) ");
                result = scan.nextLine();
            } else if (number >  x) {
                System.out.print("Your guess was too high, try again? (Y/N) ");
                result = scan.nextLine();
            }

            if (result.equalsIgnoreCase("n")) {
                done = true;

            }else {
                done = false;
            }

        }

        }

}

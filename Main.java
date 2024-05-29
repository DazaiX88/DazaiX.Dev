package net.mytrivia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dazai's  Math Trivia Game");

        int x = 12;
        int y = 12;
        int z = -200;
        int a = 1;
        int result;


        System.out.println("Question 1: ");
        System.out.println("If x = 12 and y = 12, solve x * y ");
        int input = scanner.nextInt();
        if (input == 144) {
            System.out.println("Correct Answer! " + a++ + " point");
        } else {
            System.out.println("Incorrect Answer!");
        }


        System.out.println("Question 2: ");
        System.out.println("if z = -200, what is the absolute value of z?");
        if (Math.abs(z) == scanner.nextInt()) {
            System.out.println("Correct Answer! " + a++ + " points ");
        } else {
            System.out.println("Incorrect Answer!");
        }

        System.out.println("Question 3...Final Question!");
        System.out.println(" if z = -200, x = 12, and y = 12...what is  |z| - x * y ?");
        if (Math.abs(z) - x * y == scanner.nextInt()){
            System.out.println("Correct Answer! " + a++ + " Points..You have won! CONGRATULATIONS!!");

        }else if (a++ <= 3) {
            System.out.println("Sorry you have less than 3 out of 3 correct, you have failed the trivia! Please try again!");
        }








    }
}
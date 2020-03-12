package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        testOddness();
        keepContained();
        lastDigit();

        // todo even or odd
        // todo keep number contained
        // todo get the last digit
    }

    public static void testOddness() {

        Scanner keyboard;

        int numberPositive;

        keyboard = new Scanner(System.in);


        System.out.println("Enter a positive number");
        numberPositive = keyboard.nextInt();


        System.out.println("Number is odd: " + (numberPositive % 2 != 0));
    }

    public static void keepContained(){

        Scanner keyboard;

        int numberPositive;

        keyboard = new Scanner(System.in);

        System.out.println("Enter a positive number");
        numberPositive = keyboard.nextInt();

        System.out.println("Number contained is: " + (numberPositive%8+5));


    }

    public static void lastDigit(){

        Scanner keyboard;

        int numberPositiveFourDigits;

        keyboard = new Scanner(System.in);

        System.out.println("Enter a positive number that is 4 digits long");
        numberPositiveFourDigits = keyboard.nextInt();

        System.out.println("The last digit of the number is: " + numberPositiveFourDigits%10);

    }

}

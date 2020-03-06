package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        testOddness();

        // todo even or odd
        // todo keep number contained
        // todo get the last digit
    }

    public static void testOddness(){

        Scanner keyboard;

        int numberPositive;

        keyboard = new Scanner(System.in);



    System.out.println("Enter a positive number");
    numberPositive = keyboard.nextInt();


        System.out.println("Number is odd: " + (numberPositive % 2 !=0));



    }
}

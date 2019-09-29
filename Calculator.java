package com.company.first;

import java.util.Scanner;
import java.lang.Math;

class Calculator {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    private static boolean isPrime(int firstNumber) {
        if(firstNumber<=1){
            return false;
        }
        for(int i = 2; i<firstNumber; i++) {
            if(firstNumber%i==0) {
                return false;
            }
        }
        return true;
    }
    void startCalculator() {
            Scanner Input = new Scanner(System.in);
            Scanner Input2 = new Scanner(System.in);
            int choice;
            System.out.println(ANSI_GREEN + "1 - Simple operations (/,*,+,-)" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "2 - More Advanced operations (sqrt, ^, prime)" + ANSI_RESET);
            choice = Input.nextInt();
            switch(choice) {
                case 1:
                    System.out.println(ANSI_RED + "Enter the first number: " + ANSI_RESET);
                    int firstNumber = Input.nextInt();
                    System.out.println(ANSI_RED + "Enter the second number: " + ANSI_RESET);
                    int secondNumber = Input.nextInt();
                    System.out.println(ANSI_YELLOW + "What do you want to do with them? (/, *, +, -)" + ANSI_RESET);
                    String operation = Input2.nextLine();
                    if(operation.equals("/")) {
                        System.out.println(ANSI_GREEN + "The ratio of the two numbers is: " + (firstNumber / secondNumber) + ANSI_RESET);
                    }
                    if(operation.equals("*")) {
                        System.out.println(ANSI_GREEN + "The multiplication of the two numbers is: " + (firstNumber * secondNumber) + ANSI_RESET);
                    }
                    if(operation.equals("+")) {
                        System.out.println(ANSI_GREEN + "The sum of the two numbers is: " + (firstNumber + secondNumber) + ANSI_RESET);
                    }
                    if(operation.equals("-")) {
                        System.out.println(ANSI_GREEN + "The difference of the two numbers is: " + (firstNumber - secondNumber) + ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_YELLOW + "1 - Square root" + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "2 - Power" + ANSI_RESET);
                    System.out.println(ANSI_YELLOW + "3 - Primeness" + ANSI_RESET);
                    int choice2 = Input.nextInt();
                    switch(choice2) {
                        case 1:
                            System.out.println(ANSI_RED + "Enter a number: " + ANSI_RESET);
                            firstNumber = Input.nextInt();
                            System.out.println(ANSI_GREEN + "The square root of " + firstNumber + " is: " + (Math.sqrt(firstNumber)) + ANSI_RESET);
                            break;
                        case 2:
                            System.out.println(ANSI_YELLOW + "Enter the base: " + ANSI_RESET);
                            firstNumber = Input.nextInt();
                            System.out.println(ANSI_YELLOW + "Enter the exponent: " + ANSI_RESET);
                            secondNumber = Input.nextInt();
                            System.out.println(ANSI_GREEN + firstNumber + " raised to the power of " + secondNumber + " is: " + (Math.pow(firstNumber, secondNumber)) + ANSI_RESET);
                            break;
                        case 3:
                            System.out.println(ANSI_RED + "Enter a number: " + ANSI_RESET);
                            firstNumber = Input.nextInt();
                            if(isPrime(firstNumber)){
                                System.out.println(ANSI_RED + firstNumber + " is a prime number." + ANSI_RESET);
                            }
                            else {
                                System.out.println(ANSI_RED + firstNumber + " is not a prime number." + ANSI_RESET);
                            }
                            break;
                        default:
                            System.out.println(ANSI_RED + "There is no such option." + ANSI_RESET);
                    }
                    break;
            }
    }
}

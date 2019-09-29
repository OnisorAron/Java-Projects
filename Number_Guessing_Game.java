package com.company.first;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class Number_Guessing_Game {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    void startNumberGuessingGame() {
        try {
            Scanner Input = new Scanner(System.in);
            Random rand = new Random();
            int secret = rand.nextInt(100) + 1;
            System.out.println(ANSI_BLUE + "I've thought of a number from 1 to 100, and you will need to guess it or a scary fate will be reserved for you. No pressure though." + ANSI_RESET);
            int guess, attempts = 0;
            do {
                guess = Input.nextInt();
                if(guess > secret) {
                    System.out.println(ANSI_YELLOW + "Lower!" + ANSI_RESET);
                    attempts += 1;
                }
                else {
                    System.out.println(ANSI_YELLOW + "Higher!" + ANSI_RESET);
                    attempts += 1;
                }
            } while(guess != secret);
            System.out.println(ANSI_GREEN + secret + " is the correct answer and it took you " + attempts + " attempts to guess it!" + ANSI_RESET);
        } catch(InputMismatchException ex1){
            System.out.println(ANSI_RED + "Input is not a valid number. Try again." + ANSI_RESET);
        }
    }
}

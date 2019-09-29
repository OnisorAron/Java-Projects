package com.company.first;

import java.util.Scanner;

public class Main {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        String n = "1";
        while(!n.equals("0")) {
            System.out.println(ANSI_GREEN + "0 - Exit" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "1 - Calculator" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "2 - Number Guessing Game" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "3 - Sort An Array" + ANSI_RESET);
            Scanner originalInput = new Scanner(System.in);
            n = originalInput.next();
            switch(n) {
                case "0":
                    System.out.println(ANSI_RED + "Exiting..." + ANSI_RESET);
                    break;
                case "1":
                    (new Calculator()).startCalculator();
                    break;
                case "2":
                    (new Number_Guessing_Game()).startNumberGuessingGame();
                    break;
                case "3":
                    (new Sort_An_Array()).startSortAnArray();
                    break;
                case "4":

                    break;
                case "5":

                    break;
                default:
                    System.out.println(ANSI_RED + "There is no such option." + ANSI_RESET);
            }
        }
    }
}
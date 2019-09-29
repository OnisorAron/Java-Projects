package com.company.first;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Sort_An_Array {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";

    void startSortAnArray() {
        Scanner Input = new Scanner(System.in);
        int choice3;
        int size;
        System.out.println(ANSI_YELLOW + "How big should the array be: " + ANSI_RESET);
        size = Input.nextInt();
        Integer[] array = new Integer[size];
        System.out.println(ANSI_GREEN + "1 - Sort an array in ascending order" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "2 - Sort an array in descending order" + ANSI_RESET);
        choice3 = Input.nextInt();
        switch(choice3) {
            case 1:
                for(int i = 0; i<size; i++) {
                    System.out.println(ANSI_GREEN + "array[" + i + "] = " + ANSI_RESET);
                    array[i] = Input.nextInt();
                }
                Arrays.sort(array);
                System.out.println(ANSI_YELLOW + "Modified array: " + Arrays.toString(array) + ANSI_RESET);
                break;
            case 2:
                for(int i = 0; i<size; i++){
                    System.out.println(ANSI_GREEN + "array[" + i + "] = " + ANSI_RESET);
                    array[i] = Input.nextInt();
                }
                Arrays.sort(array, Collections.reverseOrder());
                System.out.println(ANSI_YELLOW + "Modified array: " + Arrays.toString(array) + ANSI_RESET);
                break;
            default:
                System.out.println(ANSI_RED + "There is no such option." + ANSI_RESET);
        }
    }
}

package org.example;

import java.util.Scanner;

public class Menu {

    public static SortingOptions chooseSortingOption() {
        SortingOptions sortingOption;
        System.out.println("By which specific value you want to sort?\n Write your option:");
        System.out.println("a. By quizzes points");
        System.out.println("b. By tasks points");
        System.out.println("c. By activity points");
        System.out.println("d. By total points");

        switch (inputChar()) {
            case 'a' -> sortingOption = SortingOptions.QUIZZES;
            case 'b' -> sortingOption = SortingOptions.TASKS;
            case 'c' -> sortingOption = SortingOptions.ACTIVITY;
            case 'd' -> sortingOption = SortingOptions.TOTAL;
            default -> throw new IllegalStateException("Unexpected value: " + inputChar());
        }
        return sortingOption;
    }

    private static char inputChar() {
        Scanner scanner = new Scanner(System.in);
        char input = '0';
        try {
            input = scanner.nextLine().toLowerCase().charAt(0);
        } catch (StringIndexOutOfBoundsException siobe) {
            System.out.println("Wrong input!");
        }
        return input;
    }
}

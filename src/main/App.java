package main;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        int[] numbers = {4, 5, 21, 7, 2, 8, 13, 3, 11, 6, 34, 65, 87, 1, 9};

        System.out.println("Not-Sorted data:");
        for (int element : numbers)

            System.out.print(element + " ");
        for (int i = 1; i < numbers.length; i++) {

            int key = numbers[i];

            int j = i - 1;

            while (j >= 0 && key < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        System.out.println("\n Sorted data:");
        for (int element : numbers)
            System.out.print(element + " ");


        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease input the number: ");
        int n = scanner.nextInt();
        int idx = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                idx = i;
            }
        }

        if (idx == -1)
            System.out.print("Oops! Value " + n + " is absent.");
        else
            System.out.print("Your value " + n + " is at index " + idx);
    }
    }




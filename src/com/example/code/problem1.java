package com.example.code;

import java.util.Scanner;

public class problem1 {

    public static void main(String args[])
    {
        int arraySize = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements for the array: ");
        arraySize = scanner.nextInt();

        int[] x = new int[arraySize];
        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < arraySize; i++) {
            x[i] = scanner.nextInt();
        }
        System.out.println("Enter the input number for comparision");
        int capNum = scanner.nextInt();

        new problem1().comparision(x, arraySize, capNum);
    }

    void comparision(int[] x,int sizeOfArray,int capNum)
    {
        int below = 0, above = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            if (x[i] > capNum) {
                above++;

            }
            if (x[i] < capNum) {
                below++;
            }
        }

        System.out.println("Numbers above the given input - above: " + above);
        System.out.println("Numbers below the given input - below: " + below);
    }
}


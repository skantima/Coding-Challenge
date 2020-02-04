package com.example.code;

import java.util.Scanner;

public class problem2 {

    public static void main(String args[])
    {
        String inputString;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the input String: ");
        inputString = scan.nextLine();

        System.out.println("Enter the input number for rotating the string: ");
        int inputNum = scan.nextInt();

        int stringLength = inputString.length();
        String rotString = inputString.substring(stringLength - inputNum) + inputString.substring(0, stringLength - inputNum);

        System.out.println(rotString);

    }
}


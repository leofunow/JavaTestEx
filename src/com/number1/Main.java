package com.number1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < inputLine.length(); i++) {
            if (Character.isDigit(inputLine.charAt(i)))
                sum += Character.getNumericValue(inputLine.charAt(i));
        }
        System.out.println(sum);
    }
}

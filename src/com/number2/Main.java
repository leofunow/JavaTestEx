package com.number2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 1, factor = 2;
        Scanner scanner = new Scanner(System.in);
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Неправильный ввод, необходимо ввести целое число (ошибка " + e + ")");
            return;
        }
        System.out.print(number + " = 1");
        while (Math.sqrt(number) >= factor) {
            while (number % factor == 0) {
                System.out.print(" * " + factor);
                number /= factor;
            }
            factor++;
        }
        System.out.println('.');
    }
}

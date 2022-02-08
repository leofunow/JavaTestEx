package com.number3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        for (int i = 0; i < myString.length(); i++) {
        }
        String s[] = myString.split(" ");
        Pattern pattern = Pattern.compile("[аеёиоуыэюя]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        List finalList1 = Arrays.stream(s)
                .sorted(Comparator.comparingLong(o -> -pattern.matcher(o).results().count()))
                .map(o -> {
                    Matcher m = pattern.matcher(o);
                    m.find();
                    return m.replaceFirst(Character.toString(o.charAt(m.start())).toUpperCase());
                })
                .toList();
        finalList1.forEach(o -> System.out.println(o));
    }
}

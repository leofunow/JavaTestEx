package com.number4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            Writer writer = new Writer();
            writer.writeNumber(num);
    }
}

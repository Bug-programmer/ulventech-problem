package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        short lineCount;
        do {
            System.out.println("Enter the unique lines count from 1 to 229");
            lineCount= sc.nextShort();
        }while (lineCount >= 230 || lineCount <= 0);
        Printer printer = new Printer(lineCount);
        printer.print();

    }
}

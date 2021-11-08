package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        short x =  230;
        Printer printer = new Printer(x);
       printer.print();

    }
}

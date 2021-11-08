package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        byte[] strings = new byte[100];
        int x = 230;
        String fileName = x + " lines with 100 unique characters";
        Arrays.fill(strings, (byte) 'a');
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        for (int i = 0; i < x; i++) {
            fileOutputStream.write(strings);
            fileOutputStream.write(10);
            strings[i % 100] = ++strings[i % 100];
        }

        fileOutputStream.close();
    }
}

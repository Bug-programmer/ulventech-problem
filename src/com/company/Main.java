package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        byte[] strings = new byte[100];
        Arrays.fill(strings, (byte) 'a');
        int x = 10;

        byte[] crlf = new byte[] {'\r', '\n'};

        FileOutputStream fileOutputStream = new FileOutputStream("test");

        for (int i = 0; i < x; i++) {
            fileOutputStream.write(strings);
            fileOutputStream.write(crlf);
            fileOutputStream.flush();

            for (int j = 0; j < 100; j++) {
                strings[j]++;
                if (strings[j] <= 'z') {
                    break;
                } else {
                    strings[j] = 'a';
                }
            }
        }

        fileOutputStream.close();
    }
}

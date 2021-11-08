package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;



public class Printer {
  private final byte[] randomCharacters;
   private final String fileName;
   private final short lineCount;
    public Printer(short lineCount) {
        this.lineCount = lineCount;
        this.randomCharacters = new byte[100];
        this.fileName =  lineCount + " lines with 100 unique characters";
        Arrays.fill(this.randomCharacters, (byte) 'a');
    }
    private byte updateRandomCharacters(byte randomCharacters){
        return ++randomCharacters;
    }
    void print() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        for (int i = 0; i <lineCount; i++) {
            fileOutputStream.write(randomCharacters);
            fileOutputStream.write(10);
            randomCharacters[i % 100] = this.updateRandomCharacters(this.randomCharacters[i % 100]);
        }

        fileOutputStream.close();
    }


}

package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;



public class Printer {
  private final byte[] randomCharacters;
   private final String fileName;
   private final short lineCount;
   private final short LINE_LENGTH = 100;
    public Printer(short lineCount) {
        this.lineCount = lineCount;
        this.randomCharacters = new byte[LINE_LENGTH];
        this.fileName =  lineCount + " lines with 100 unique characters";
        Arrays.fill(this.randomCharacters, (byte) 'a');
    }
    private byte updateRandomCharacters(byte randomCharacters){
        return ++randomCharacters;
    }
    void print() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        for (short i = 0; i <lineCount; i++) {
            fileOutputStream.write(randomCharacters);
            fileOutputStream.write(10);
            randomCharacters[i % LINE_LENGTH] = this.updateRandomCharacters(this.randomCharacters[i % LINE_LENGTH]);
        }

        fileOutputStream.close();
    }


}

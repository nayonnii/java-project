package com.example.javaproject2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read());
    }

    public void readTwoChars() throws IOException {
        InputStreamReader IS = new InputStreamReader((System.in));
        int asciiCode1 = IS.read();
        int asciiCode2 = IS.read();

        System.out.println(asciiCode1);
        System.out.println(asciiCode2);
    }
}

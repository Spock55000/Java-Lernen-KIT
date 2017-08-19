package com.github.spock55000.kituebung;

import java.util.Scanner;

public class LineReader {
    private Scanner scanner = new Scanner(System.in);
    public int readInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}

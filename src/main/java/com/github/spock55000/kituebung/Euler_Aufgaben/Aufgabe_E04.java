package com.github.spock55000.kituebung.Euler_Aufgaben;

import com.github.spock55000.kituebung.LineReader;

public class Aufgabe_E04 {
    private LineReader reader = new LineReader();

    public void run() {
        int max = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = i; j <= 999; j++) {
                int q = i * j;
                if (q > max && isPalindrome(q)) {
                    max = q;
                }
            }
        }
        System.out.println(max);
    }

    private boolean isPalindrome(int candidate) {
        String s = Integer.toString(candidate);

        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}

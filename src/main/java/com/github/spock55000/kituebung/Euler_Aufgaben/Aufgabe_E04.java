package com.github.spock55000.kituebung.Euler_Aufgaben;

public class Aufgabe_E04 {

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
            if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}

package library.util;

public class NumberPrinter {

    public void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(describe(i));
        }
    }

    private String describe(int i) {
        if (i % 2 == 0) {
            return i + " is even";
        }
        if (i % 3 == 0) {
            return i + " divisible by 3";
        }
        return i + " something else";
    }
}
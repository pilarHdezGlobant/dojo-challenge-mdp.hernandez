package com.globant.codechallenge;

public class PascalTriangle {
    private static int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void pascalTriangle(int nRows) {
        String row = "";
        for (int i = 0; i <= nRows; i++) {
            row = "[";
            for (int j = 0; j <= i; j++) {
                row += factorial(i) / (factorial(i - j) * factorial(j)) + " ";
            }
            System.out.println(row.trim()+ "]");
        }
    }
}

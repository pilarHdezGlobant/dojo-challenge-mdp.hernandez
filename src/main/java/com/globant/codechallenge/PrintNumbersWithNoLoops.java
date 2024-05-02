package com.globant.codechallenge;

public class PrintNumbersWithNoLoops {
    public static void printNumbersWithNoLoops(int start, int end) {
        if(start <= end){
            System.out.print(start + " ");
            printNumbersWithNoLoops(start + 1, end);
        }
    }
}

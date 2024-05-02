package com.globant.codechallenge;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintNumbersWithNoLoopsTest {
    @Test
    public void testPrintNumbersWithNoLoops() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintNumbersWithNoLoops.printNumbersWithNoLoops(1, 5);
        assertEquals("1 2 3 4 5 ", outContent.toString());

        outContent.reset();

        PrintNumbersWithNoLoops.printNumbersWithNoLoops(10, 15);
        assertEquals("10 11 12 13 14 15 ", outContent.toString());

        outContent.reset();

        PrintNumbersWithNoLoops.printNumbersWithNoLoops(20, 20);
        assertEquals("20 ", outContent.toString());

        outContent.reset();

        PrintNumbersWithNoLoops.printNumbersWithNoLoops(7, 3);
        assertEquals("", outContent.toString());
    }
}
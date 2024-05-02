package com.globant.codechallenge;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PascalTriangleTest {

    @Test
    public void pascalTriangleTest(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        PascalTriangle.pascalTriangle(5);
        String output = outputStream.toString();
        assertEquals("[1]\n[1 1]\n[1 2 1]\n[1 3 3 1]\n[1 4 6 4 1]\n[1 5 10 10 5 1]\n", output);
    }

}
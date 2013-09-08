package com.valuablecode.junit.example;

import static java.text.MessageFormat.format;

/**
 * Knows how to compute the cube of a specified number.
 */
public class Cube {

    public int compute(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(format("Illegal negative argument: {0}", n));
        }

        return n * n * n;
    }

}

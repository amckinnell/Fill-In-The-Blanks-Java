package com.valuablecode.util;

import static org.junit.Assert.fail;

/**
 * Helpers for the TDD workshop exercises.
 */
public class TddWorkshopHelper {

    public static String __ = "FIX ME";

    public static void ___(String message) {
        fail(__ + ": " + message);
    }

}

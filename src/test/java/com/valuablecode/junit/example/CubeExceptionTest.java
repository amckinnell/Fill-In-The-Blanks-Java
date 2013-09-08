package com.valuablecode.junit.example;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Demonstrates using a try catch block or an expected exception to test for an exception.
 */
public class CubeExceptionTest {

    final Cube sut = new Cube();

    @Test public void
    fails_to_compute_for_negative_arguments_with_try_catch() {
        try {
            sut.compute(-1);
            fail("Expected an IllegalArgumentException to be thrown for a negative argument");
        } catch (IllegalArgumentException expected) {
            assertThat(expected.getMessage(), containsString("-1"));
        }

    }

    @Test(expected=IllegalArgumentException.class) public void
    fails_to_compute_for_negative_arguments_with_expected_exception() {
        // TDD Workshop: Change the argument to compute() to make this test pass.
        sut.compute(1);
    }

    // TDD Workshop: Why might you prefer the longer try catch form to the expected exception form?

}

package com.valuablecode.junit;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Demonstrates how to use the assertThat style of JUnit 4 assertions to compare actual and expected numeric results.
 */
public class AssertThatNumberTest {

    @Test public void
    verify_floating_point_value_is_close_enough() {
        assertThat(1.999, closeTo(2.0, .001));
    }

    @Test public void
    verify_floating_point_division_is_close_enough() {
        // TDD Workshop: Adjust the error to make the test pass
        double error = 0.001;

        assertThat(10.0 / 3.0, closeTo(3.33, error));
    }

    @Test public void
    compare_values() {
        assertThat(5, greaterThan(4));
        assertThat(4, greaterThanOrEqualTo(4));

        // TDD Workshop: Adjust the expected value to make the test pass.
        int expected = 4;

        assertThat(expected, lessThan(4));
    }

}

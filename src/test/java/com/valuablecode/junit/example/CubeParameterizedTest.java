package com.valuablecode.junit.example;

import static java.text.MessageFormat.format;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Demonstrates using a JUnit 4 parameterised test.
 */
@RunWith(Parameterized.class)
public class CubeParameterizedTest {

    final int expected;
    final int number;
    final String reason;

    final Cube sut = new Cube();

    public CubeParameterizedTest(int number, int expected) {
        this.expected = expected;
        this.number = number;

        this.reason = createReason(number, expected);
    }

    private String createReason(int number, int expected) {
        return format("Tripling {0} to yield {1}", number, expected);
    }

    @Parameters
    public static Collection<Object[]> testData() {
        return asList(new Object[][] {
                { 0, 0 },
                { 1, 1 },
                { 2, 8 },

                // TDD Workshop: What is 3 cubed?
                { 3, 33 },

                { 10, 1000 },
        });
    }

    @Test public void
    computes_as_expected() {
        assertThat(reason, sut.compute(number), equalTo(expected));
    }

}

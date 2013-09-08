package com.valuablecode.junit;

import static com.valuablecode.util.TddWorkshopHelper.__;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

/**
 * Demonstrates how to use the assertThat style of JUnit 4 assertions to compare actual and expected text results.
 */
public class AssertThatStringTest {

    private static final String question = "Does TDD mean Test-Driven Development or Test-Driven Design?";

    @Test public void
    verify_substring() {
        assertThat(question, containsString("Test-Driven Development"));
    }

    @Test public void
    verify_starting_substring() {
        // TDD Workshop: What is at the start of the question?
        assertThat(question, startsWith(__));
    }

    @Test public void
    verify_two_conditions() {
        assertThat(question, both(containsString("Test-Driven Development"))
                .and(containsString("Test-Driven Design")));
    }

    // TDD Workshop: Why might you prefer to match substrings rather than the entire question?

    @Test public void
    verify_multiple__conditions() {
        assertThat(question, allOf(containsString("TDD"), containsString("Test-Driven Development"),
                containsString("Test-Driven Design")));
    }

    @Test public void
    compare_two_conditions_demonstrating_descriptive_test_failure_message() {
        // TDD Workshop: Take a look at the error message. Does it help?
        assertThat(question, both(containsString("Test-Driven Development"))
                .and(containsString(__)));
    }

    @Test public void
    specify_collection_elements() {
        List<String> refactorings = asList("Extract Method", "Rename Method");

        assertThat(refactorings, hasItem("Extract Method"));

        // TDD Workshop: Specify the missing refactoring name.
        assertThat(refactorings, hasItems(__, "Rename Method"));
    }

    @Test public void
    specify_a_negative_condition() {
        List<String> refactorings = asList("Extract Method", "Rename Method");

        // TDD Workshop: Use the not() matcher to reverse the condition.
        assertThat(refactorings, hasItem("Replace Type Code with Polymorphism"));
    }

    @Test public void
    specify_words_from_the_question() {
        List<String> words = asList(question.split("\\W"));

        // TDD Workshop: Add two more words from the question to the hasItems() matcher.
        assertThat(words, hasItems("TDD", __, __));
    }

}

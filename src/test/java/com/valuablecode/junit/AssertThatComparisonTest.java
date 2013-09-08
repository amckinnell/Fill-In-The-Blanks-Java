package com.valuablecode.junit;

import static com.valuablecode.util.TddWorkshopHelper.__;
import static com.valuablecode.util.TddWorkshopHelper.___;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Demonstrates how to use the assertThat style of JUnit 4 assertions to compare actual and expected results.
 */
public class AssertThatComparisonTest {

    @Test public void
    compare_integers_with_equalTo_matcher() {
        assertThat(3 * 3, equalTo(9));
    }

    @Test public void
    compare_strings_with_equalTo_matcher() {
        // TDD Workshop: Use the equalTo() matcher instead of assertEquals().
        assertThat(__, equalTo("flexible matcher for any type"));
    }

    @Test public void
    compare_integers_with_is_matcher() {
        assertThat(3 * 3, is(9));
    }

    @Test public void
    compare_strings_with_is_matcher() {
        // TDD Workshop: The is() matcher is syntactic sugar for the equalTo() matcher.
        assertThat(__, is("syntactic sugar"));
    }

    @Test public void
    compare_doubles_with_is_matcher() {
        // TDD Workshop: Make use of content assist to make creating an assertThat easier.

        // Type 'at' and then use content assist to complete to insert assertThat(). Then  you'll be in
        // a special edit mode where you can use the TAB key to move  between fields. Type 'is' and then
        // use content assist to insert the is() matcher.

        ___("write your own assertThat(2.0, is(2.0)");
    }

    @Test public void
    compare_doubles_with_equalTo_matcher() {
        // TDD Workshop: Make use of content assist to make creating an assertThat easier.

        // Type 'at' and then use content assist to complete to insert assertThat(). Then you'll be in
        // a special edit mode where you can use the TAB key to move  between fields. Type 'eq' and then
        // use content assist to insert the eq() matcher.

        ___("write your own assertThat(2.0, equalTo(2.0)");
    }

}

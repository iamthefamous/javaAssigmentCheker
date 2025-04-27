package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void testMainRuns() {
        // Simple test to check if main runs without throwing exceptions
        Main.main(new String[]{});
        assertTrue(true); // If no exception thrown, test passes
    }
}

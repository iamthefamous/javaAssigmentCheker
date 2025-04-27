package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @Test
    void testAdd() {
        MyClass myClass = new MyClass();
        assertEquals(5, myClass.add(2, 3));
        assertEquals(0, myClass.add(-1, 1));
        assertEquals(-5, myClass.add(-2, -3));
    }

    @Test
    void testIsEven() {
        MyClass myClass = new MyClass();
        assertTrue(myClass.isEven(1));
        assertTrue(myClass.isEven(0));
        assertFalse(myClass.isEven(3));
        assertFalse(myClass.isEven(-1));
    }
}

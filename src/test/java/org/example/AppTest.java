package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Optional;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{

    public void testPop()
    {
        MyStack<Integer> stack = new MyStack<>();
        assertTrue(stack.isEmpty());
        stack.push(1);

        assertEquals(Integer.valueOf(1), stack.pop());
    }

}

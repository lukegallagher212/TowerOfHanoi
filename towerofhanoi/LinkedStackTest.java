package towerofhanoi;

import java.util.EmptyStackException;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Luke Gallagher (lukegallagher212)
// -------------------------------------------------------------------------
/**
 * Tests all methods in linked stack class.
 * 
 * @author lukegallagher
 * @version Oct 17, 2023
 */
public class LinkedStackTest
    extends student.TestCase
{
    private LinkedStack<String> s1;

    /**
     * sets up variables for test classes
     */
    public void setUp()
    {
        s1 = new LinkedStack<String>();
    }


    // ----------------------------------------------------------
    /**
     * tests the clear method and what it effects, along with peek, size, and
     * isEmpty.
     */
    public void testClearandPeek()
    {
        s1.push("a");
        s1.push("b");
        s1.push("c");
        assertEquals(3, s1.size());
        assertEquals("c", s1.peek());
        s1.clear();
        assertTrue(s1.isEmpty());
        try
        {
            s1.peek();
        }
        catch (EmptyStackException e)
        {
            assertNotNull(e);
        }
    }


    // ----------------------------------------------------------
    /**
     * tests the pop method and all of the possible outcomes, as well as push
     */
    public void testPopandPush()
    {
        try
        {
            s1.pop();
        }
        catch (EmptyStackException e)
        {
            assertNotNull(e);
        }
        s1.push("a");
        s1.push("b");
        assertEquals(2, s1.size());
        assertEquals("b", s1.pop());
        assertFalse(s1.isEmpty());
        assertEquals(1, s1.size());
    }


    // ----------------------------------------------------------
    /**
     * tests the toString method on a stack.
     */
    public void testToString()
    {
        s1.push("a");
        s1.push("b");
        s1.push("c");
        assertEquals("[c, b, a]", s1.toString());
    }
}

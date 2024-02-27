package towerofhanoi;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Luke Gallagher (lukegallagher212)
// -------------------------------------------------------------------------
/**
 * tests all of the methods in the Tower class
 * 
 * @author lukegallagher
 * @version Oct 17, 2023
 */
public class TowerTest
    extends student.TestCase
{
    private Tower t1;
    private Disk d1;
    private Disk d2;
    private Disk d3;

    /**
     * sets up all of the variables used in the tower methods
     */
    public void setUp()
    {
        t1 = new Tower(Position.MIDDLE);
        d1 = new Disk(15);
        d2 = new Disk(20);
        d3 = new Disk(20);
    }


    // ----------------------------------------------------------
    /**
     * tests returning the position
     */
    public void testPosition()
    {
        assertEquals(Position.MIDDLE, t1.position());
    }


    // ----------------------------------------------------------
    /**
     * tests pushing various disks onto a tower stack
     */
    public void testPush()
    {
        assertTrue(t1.isEmpty());
        try
        {
            t1.push(null);
        }
        catch (IllegalArgumentException e)
        {
            assertNotNull(e);
        }
        t1.push(d2);
        t1.push(d1);
        assertEquals(d1, t1.peek());
        try
        {
            t1.push(d3);
        }
        catch (IllegalStateException e)
        {
            assertNotNull(e);
        }
        assertEquals("[15, 20]", t1.toString());
    }
}

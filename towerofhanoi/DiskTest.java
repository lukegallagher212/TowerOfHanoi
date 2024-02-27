package towerofhanoi;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Luke Gallagher (lukegallagher212)
// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 * 
 * @author lukegallagher
 * @version Oct 10, 2023
 */
public class DiskTest
    extends student.TestCase
{
    private Disk disk;
    private Disk d1;
    private Disk d2;
    private Disk d3;
    private Disk d4;
    private int num;

    /**
     * sets up variables in test class
     */
    public void setUp()
    {
        disk = new Disk(10);
        d1 = new Disk(10);
        d2 = new Disk(5);
        d3 = new Disk(20);
        d4 = null;
        num = 5;
    }


    // ----------------------------------------------------------
    /**
     * tests compaing the size of two disks
     */
    public void testCompareTo()
    {
        try
        {
            disk.compareTo(d4);
        }
        catch (IllegalArgumentException e)
        {
            assertNotNull(e);
        }
        assertEquals(-1, disk.compareTo(d3));
        assertEquals(1, disk.compareTo(d2));
        assertEquals(0, disk.compareTo(disk));

    }


    // ----------------------------------------------------------
    /**
     * tests when converting a disk to a string
     */
    public void testToString()
    {
        assertEquals("10", disk.toString());
    }


    // ----------------------------------------------------------
    /**
     * tests to see if the disks are equal
     */
    public void testEquals()
    {
        assertTrue(disk.equals(disk));
        assertTrue(disk.equals(d1));
        assertFalse(disk.equals(d4));
        assertFalse(disk.equals(d2));
        assertFalse(disk.equals(num));
    }
}

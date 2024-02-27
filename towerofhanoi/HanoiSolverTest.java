package towerofhanoi;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Luke Gallagher (lukegallagher212)
// -------------------------------------------------------------------------
/**
 * tests all tower of haboi methods and their edge cases
 * 
 * @author lukeg
 * @version Oct 17, 2023
 */
public class HanoiSolverTest
    extends student.TestCase
{
    private HanoiSolver s1;

    // ----------------------------------------------------------
    /**
     * sets up the vaiables used for this test class
     */
    public void setUp()
    {
        s1 = new HanoiSolver(6);
    }


    // ----------------------------------------------------------
    /**
     * tests retreiving the number of disks
     */
    public void testDisks()
    {
        assertEquals(6, s1.disks());
    }


    // ----------------------------------------------------------
    /**
     * tests getting all of the towers to string
     */
    public void testToString()
    {
        assertEquals("[][][]", s1.toString());
    }

}

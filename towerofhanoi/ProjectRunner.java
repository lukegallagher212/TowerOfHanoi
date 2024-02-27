package towerofhanoi;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Luke Gallagher (lukegallagher212)
// -------------------------------------------------------------------------
/**
 * runs the program, and displays the window once created
 * 
 * @author lukegallagher
 * @version Oct 17, 2023
 */
public class ProjectRunner
{
    // ----------------------------------------------------------
    /**
     * Runs the solver and
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        int disks = 6;
        if (args.length == 1)
        {
            disks = Integer.parseInt(args[0]);
        }
        HanoiSolver run = new HanoiSolver(disks);
        PuzzleWindow runner = new PuzzleWindow(run);
    }
}

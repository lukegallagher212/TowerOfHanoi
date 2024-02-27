package towerofhanoi;

import java.util.Observable;

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
public class HanoiSolver
    extends Observable
{
    private Tower left;
    private Tower middle;
    private Tower right;
    private int numDisks;

    // ----------------------------------------------------------
    /**
     * Create a new HanoiSolver object.
     * 
     * @param anEntry
     *            is the number of disks used in the tower
     */
    public HanoiSolver(int anEntry)
    {
        numDisks = anEntry;
        left = new Tower(Position.LEFT);
        middle = new Tower(Position.MIDDLE);
        right = new Tower(Position.RIGHT);
    }


    // ----------------------------------------------------------
    /**
     * returns the number of disks
     * 
     * @return numDisks
     */
    public int disks()
    {
        return numDisks;
    }


    // ----------------------------------------------------------
    /**
     * Returns the tower at a given position.
     * 
     * @param anEntry
     *            is the enum position
     * @return the tower at that position
     */
    public Tower getTower(Position anEntry)
    {
        if (anEntry.equals(Position.LEFT))
        {
            return left;
        }
        if (anEntry.equals(Position.MIDDLE))
        {
            return middle;
        }
        if (anEntry.equals(Position.RIGHT))
        {
            return right;
        }
        return middle;
    }


    // ----------------------------------------------------------
    /**
     * creates a string of the widths of all disks on each tower
     * 
     * @return the string of each towers disks
     */
    public String toString()
    {
        return (left.toString() + middle.toString() + right.toString());
    }


    private void move(Tower source, Tower destination)
    {
        destination.push(source.pop());
        setChanged();
        notifyObservers(destination.position());
    }


    private void solveTowers(
        int currentDisks,
        Tower startPole,
        Tower tempPole,
        Tower endPole)
    {
        if (currentDisks == 1)
        {
            move(startPole, endPole);
        }
        else
        {
            solveTowers(currentDisks - 1, startPole, endPole, tempPole);
            move(startPole, endPole);
            solveTowers(currentDisks - 1, tempPole, startPole, endPole);
        }
    }


    // ----------------------------------------------------------
    /**
     * solves the tower of hanoi
     */
    public void solve()
    {
        solveTowers(disks(), left, middle, right);
    }
}

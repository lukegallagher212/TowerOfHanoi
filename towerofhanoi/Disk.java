package towerofhanoi;

import cs2.Shape;
import student.TestableRandom;
import java.awt.Color;

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
 * @version Oct 2, 2023
 */
public class Disk
    extends Shape
    implements Comparable<Disk>
{
    // ----------------------------------------------------------
    /**
     * Create a new Disk object.
     * 
     * @param width
     *            is the size of the Disk.
     */
    public Disk(int width)
    {
        super(0, 0, width, 10);
        TestableRandom ran = new TestableRandom();
        Color random =
            new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255));
        setBackgroundColor(random);
    }


    // ----------------------------------------------------------
    /**
     * Compares two disks and returns a value representing if it is equal,
     * smaller, or bigger
     * 
     * @param anEntry
     *            is the disk being compared
     * @return the number corresponding to the difference
     */
    public int compareTo(Disk anEntry)
    {
        if (anEntry == null)
        {
            throw new IllegalArgumentException();
        }
        if (this.getWidth() < anEntry.getWidth())
        {
            return -1;
        }
        if (this.getWidth() > anEntry.getWidth())
        {
            return 1;
        }
        return 0;
    }


    // ----------------------------------------------------------
    /**
     * Creates a string of the width of the disk
     * 
     * @return the string of the width
     */
    public String toString()
    {
        String str = "";
        return str + getWidth();
    }


    // ----------------------------------------------------------
    /**
     * Overrides equals, checks if disks have same width
     * 
     * @return boolean on if they are equal
     * @param anEntry
     *            is the object being compared to, to see if they are equal
     */
    public boolean equals(Object anEntry)
    {
        if (this == anEntry)
        {
            return true;
        }
        if (anEntry == null)
        {
            return false;
        }
        if (this.getClass() == anEntry.getClass())
        {
            Disk other = (Disk)anEntry;
            return (this.getWidth() == other.getWidth());
        }
        return false;
    }
}

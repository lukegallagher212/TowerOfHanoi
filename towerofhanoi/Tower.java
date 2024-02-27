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
public class Tower
    extends LinkedStack<Disk>
{
    private Position position;

    // ----------------------------------------------------------
    /**
     * Create a new Tower object.
     * 
     * @param position
     *            is supered in to determine the position of the tower.
     */
    public Tower(Position position)
    {
        this.position = position;
    }


    // ----------------------------------------------------------
    /**
     * returns the towers position
     * 
     * @return position
     */
    public Position position()
    {
        return position;
    }


    @Override
    public void push(Disk anEntry)
    {
        if (anEntry == null)
        {
            throw new IllegalArgumentException();
        }
        if (isEmpty() || anEntry.compareTo(peek()) < 0)
        {
            super.push(anEntry);
        }
        else
        {
            throw new IllegalStateException();
        }
    }
}

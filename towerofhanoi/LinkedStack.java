package towerofhanoi;

import java.util.EmptyStackException;
import stack.StackInterface;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Luke Gallagher (lukegallagher212)

// -------------------------------------------------------------------------
/**
 * Implements Linked Stack methods
 * 
 * @param <T>
 * @author lukegallagher
 * @version Oct 3, 2023
 */
public class LinkedStack<T>
    implements StackInterface<T>
{
    private int size;
    private Node<T> topNode;

    // ----------------------------------------------------------
    /**
     * Create a new LinkedStack object.
     */
    public LinkedStack()
    {
        topNode = null;
        size = 0;
    }


    @Override
    public void clear()
    {
        while (topNode != null)
        {
            pop();
        }
        size = 0;
    }


    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }


    @Override
    public T peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        return topNode.getData();
    }


    @Override
    public T pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }
        T removed = topNode.getData();
        topNode = topNode.getNextNode();
        size--;
        return removed;
    }


    @Override
    public void push(T anEntry)
    {
        Node<T> addition = new Node<T>(anEntry, topNode);
        topNode = addition;
        size++;
    }


    /**
     * returns size
     * 
     * @return size
     */
    public int size()
    {
        return size;
    }


    // ----------------------------------------------------------
    /**
     * Creates a string of the stack of width of disks
     * 
     * @return the stirng of the linked stack of disks
     */
    public String toString()
    {
        LinkedStack<T> copy = this;
        StringBuilder s = new StringBuilder();
        s.append("[");
        while (!copy.isEmpty())
        {
            if (s.length() > 1)
            {
                s.append(", ");
            }
            s.append(copy.pop());
        }
        s.append("]");
        return s.toString();
    }

}




// -------------------------------------------------------------------------
/**
 * Implements my own node class
 * 
 * @param <T>
 * @author lukegallagher
 * @version Oct 3, 2023
 */
class Node<T>
{
    /**
     * 
     */
    private T data;
    /**
     * 
     */
    private Node<T> next;

    // ----------------------------------------------------------
    /**
     * Create a new Node object.
     * 
     * @param entry
     *            is the data of the node
     * @param node
     *            the next node it is linked to
     */
    public Node(T entry, Node<T> node)
    {
        data = entry;
        this.setNextNode(node);
    }


    // ----------------------------------------------------------
    /**
     * links node to a next node
     * 
     * @param anEntry
     *            sets a new next node to be linked
     */
    public void setNextNode(Node<T> anEntry)
    {
        this.next = anEntry;
    }


    // ----------------------------------------------------------
    /**
     * Create a new Node object.
     * 
     * @param entry
     *            data portion for the node
     */
    public Node(T entry)
    {
        data = entry;
        this.setNextNode(null);
    }


    // ----------------------------------------------------------
    /**
     * gets the next linked node
     * 
     * @return the next node
     */
    public Node<T> getNextNode()
    {
        return this.next;
    }


    // ----------------------------------------------------------
    /**
     * returns node data
     * 
     * @return the data
     */
    public T getData()
    {
        return data;
    }
}

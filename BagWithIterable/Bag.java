
/**
 * Write a description of Bag here.
 * Sedgewick and Wayne Algorithms 4th edition page 155 Bags with iterable
 * we can use this iterable code in the other data structures 
 */

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> { // this code has iterable example
    private Node first;
    
    private class Node
    {
        Item item;
        Node next;
    }

    public void add(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }
    
    //iterable code below
    public Iterator<Item> iterator()
    {return new ListIterator();}
    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        
        public boolean hasNext()
        { return current != null;}
        public void remove(){}
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
        
        
        
    
    }
}

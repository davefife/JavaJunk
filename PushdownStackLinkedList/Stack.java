
/**
 * Write a description of Stack here.
 * Sedgewick and Wayne: Algorithms 4th edition , page 149
 * Important basic implementation of linked-list DS that 
 * the book will likely use to build more complex structures.
 * They even provided a small test client (main) which we'll implement.
 */
public class Stack<Item>{     // Iterable Item generic
    private Node first;  // top of stack most, recently added node
    private int n; // number of items
    
    private class Node{ //class to define nodes
        Item item;
        Node next;
        
    }
    
    public boolean isEmpty() { return first == null;}
    public int size()        { return n;}
    
    public void push(Item item){ // Add item to top of stack.
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public Item pop(){ //remove item from top of stack.
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }
    
    //include iterator() implementation
    //will include test client
    
}


/**
 * Write a description of Queue here.
 * Queue data-structure
 * Page 151 Sedgewick and Wayne Algorithms 4th edition. 
 * 
 * @version (a version number or a date)
 */
public class Queue<Item> { //iterable Item generic type
    private Node first;
    private Node last; // most recent node
    private int n;
    
    private class Node{
        Item item;  //generic item iterable
        Node next;
    }
    
    public boolean isEmpty(){ return first == null;}
    public int size()       { return n;}
    
    public void enqueue(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next=null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        n++;
    
    }
    
    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;
        return item;
        
    
    }
    // to support iteration add bag iterable, next data structure

}


/**
 * Write a description of addleftparens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public  class linkedListStack<item> {
    private Node first; //top of stack linked list
    private int n; // number of items
    
    private class Node{
        Item item;
        Node next;
    
    }
    
    public boolean isEmpty(){ return first==null;}
    public int size()       { return n;}
    
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    
    }
    
    public Item pop(){
    
    
    }
    
}

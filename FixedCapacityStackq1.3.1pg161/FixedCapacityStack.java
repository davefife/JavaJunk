
/**
 * Write a description of FixedCapactiyStack here.
 * excercise 1.3.1 page 161 Sedgewick Wayne implement Fixed Capacity Stack isFull method
 * I probably should work more on this and test, but shop is closing soon.
 */

public class FixedCapacityStack<Item> {
    private Item[] a;  // stack entries
    private int n;     // size
    
    public FixedCapacityStack(int capacity){
        a = (Item[]) new Object[capacity]; }
    public boolean isEmpty() { return n==0;}
    public int size()        { return n;}
    
    public void push(Item item){
        a[n++] = item;}
        
    public Item pop(){
        return a[--n];}
    
    public String isFull(){
        if (a.length == n ){return "is full";}else return "is not full.";
    }
     
}

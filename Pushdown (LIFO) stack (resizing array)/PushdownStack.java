
/**

 * from sedgewick wayne page 141, 
 * Im working through algorithms 4th edition.

 */

import java.util.Iterator;
public class PushdownStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];  //stack items
    private int n = 0;                          //number of items
    
    public boolean isEmpty(){ return n== 0;}
    public int size()       { return n;}
    
    private void resize(int max)
    
    {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < n; i++)
        
            temp[i] = a[i];
            
        a = temp;
    }
    public void push(Item item)
    {
        if (n== a.length) resize(2*a.length);
        a[n++]=item;
    
    }
    public Item pop()
    {
        Item item = a[--n];
        a[n] = null; // avoid loitering, memory hangs around if not deallocated
        if(n > 0 && n == a.length/4) resize(a.length/2);
        return item;
    }
    public Iterator<Item> iterator()
    { return new ReverseArrayIterator(); }
    public void peek(){
      System.out.println(a[a.length-1]);
      
    }
    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = n-1;
        public boolean hasNext(){return i >=0; }
        public Item next()      {return a[i--];}
        public void remove()    {              }
    }
    
   
}
    

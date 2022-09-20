
/**
 * Write a description of main here.
 * Test class for linked-list pushdown stack implementation
 */
public class main {
    public static void main(){
    Stack<String> s = new Stack<String>();
    
    while (!StdIn.isEmpty())
    {
        String item = StdIn.readString();
        if (!item.equals("-"))
            s.push(item);
        else if (!s.isEmpty()) StdOut.print(s.pop()+" ");
    }
    StdOut.println("(" +s.size() + " left on stack)");
    
    }

}

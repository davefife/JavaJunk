
/**
 * Write a description of Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args){
        Queue<String> q = new Queue<String>();
        
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if (!item.equals("-"))
                q.enqueue(item);
            else if (!q.isEmpty())StdOut.print(q.dequeue()+" ");
        }
        
        StdOut.println("(" + q.size() + " left on queue)");
    
    }

}

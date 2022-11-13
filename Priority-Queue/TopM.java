
/**
 * Write a description of TopM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * this  is a  client for the priority q code
 */
public class TopM {
    public static void main(String[] args){
    int m = Integer.parseInt(args[0]);
    MinPQ<Transaction> pq = new MinPQ<Transaction>(m+1);
    while (StdIn.hasNextLine()){
        pq.insert(new Transaction(StdIn.readLine()));
        if (pq.size() > m)
            pq.delMin();
    
    }
    
    Stack<Transaction> stack = new Stack<Transaction>();
        while(!pq.isEmpty())
            stack.push(pq.delMin());
        for (Transaction transaction : stack)
            StdOut.println(transaction);
    
    }

}


/**
 * Write a description of Parenthesis here.
 * 
 * Sedgewick and Wayne Question 1.3.4
 * Matches parenthesis but must be in order; ([]) okay,([)] not okay
 * This seems similar to Dijkstra's two stack algorithm.
 * @version (a version number or a date)
 */

import java.util.Stack;


public class ParenthesisQuestion1o3o4 {
    public static void main(String[] args){
       
        
            Stack<String> ops = new Stack<String>();
            Stack<Double> vals = new Stack<Double>();
            while (!StdIn.isEmpty()){
                String s = StdIn.readString();
                if      (s.equals("{"));
                else if (s.equals("("))  ops.push(s);
                
                else if (s.equals("["))  ops.push(s);
                
              
          }
        
        
        System.out.println("Hello World!");
  }
}
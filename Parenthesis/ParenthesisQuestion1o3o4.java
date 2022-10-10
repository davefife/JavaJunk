
/**
 * Write a description of Parenthesis here.
 * 
 * Sedgewick and Wayne Question 1.3.4
 * Matches parenthesis but must be in order; ([]) okay,([)] not okay
 * This seems similar to Dijkstra's two stack algorithm.
 * you match the top of the stack with what is behind, if it doesnt match its bad example ([)] versus good ([])
 * dont really have time to work completely through it. I never tested this, so maybe a bug somewhere.
 * fun assignment that helped me see a little nuance in the two stack algorithm I glossed over.
 * took me way too long though.
 * @version (a version number or a date)
 */

import java.util.Stack;


public class ParenthesisQuestion1o3o4 {
    public static void main(String[] args){
       
        
            Stack<String> ops = new Stack<String>();
            Stack<Double> vals = new Stack<Double>();
             int bracketcount = 0;
             int parencount = 0;
             int bracecount = 0;
            while (!StdIn.isEmpty()){
                String s = StdIn.readString();
                if      (s.equals("{")){  ops.push(s);
                    }
                else if (s.equals("(")){  ops.push(s);
                    }
                else if (s.equals("[")){  ops.push(s);
                    }
                 if (s.equals(")")){
                    String op = ops.pop();                   
                    if      (!op.equals("(")){System.out.println("I can't go for that, no can do"); break;}
                    System.out.println(op + s);
                }
                  if (s.equals("}")){
                    String op = ops.pop();                   
                    if      (!op.equals("{")){System.out.println("I can't go for that, no can do"); break;}
                    System.out.println(op + s);
                }
                  if (s.equals("[")){
                    String op = ops.pop();                   
                    if      (!op.equals("]")){System.out.println("I can't go for that, no can do"); break;}
                    System.out.println(op + s);
                }
                
                
                
                }

    }
}
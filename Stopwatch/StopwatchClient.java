
/**
 * Write a description of StopwatchClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class StopwatchClient {
    public static void main(String[] args){
       
        Stopwatch timer = new Stopwatch();
        int count=0;
        for(int i = 0; i< 1000000; i++){
          count =i;
        }
        double time = timer.elapsedTime();
        StdOut.println(count + " i's " + time + " seconds ");
        
    }
}

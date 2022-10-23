
/**
 * Write a description of Stopwatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stopwatch {
    
    private final long start;
    
    public Stopwatch(){
        start = System.currentTimeMillis();
    }
    
    public double elapsedTime(){
        Long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

}

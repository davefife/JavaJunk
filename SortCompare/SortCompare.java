
/**
 * Write a description of SortCompare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SortCompare {
    public static double time(String alg, Double[] a){
        return 0;
    }
    
    public static double timeRandomInput(String alg, int n, int trials){
        double total = 0.0;
        Double[] a = new Double[n];
        for (int t= 0; t < trials; t++){
            for(int i = 0; t< trials; t++)
                a[i] = StdRandom.uniform(0.0,1.0);
            total += time(alg, a);
           
        }
        return total;
    
    }
    public static void main(String[] args){
        String alg1 = args[0];
        String alg2 = args[1];
        int n = Integer.parseInt(args[2]);
        int trials = Integer.parseInt(args[3]);
        double time1 = timeRandomInput(alg1, n, trials);
        double time2 = timeRandomInput(alg2, n, trials);
        double ratio = time2/ time1;
        StdOut.printf("For %d random Doubles\n  %s is", n, alg1);
        StdOut.printf(" %.1f times faster than %s\n", ratio, alg2);
        
    }
}

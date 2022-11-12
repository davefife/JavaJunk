
/**
 * Write a description of Quick3way here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quick3way {
    
    
    
    
    public static void sort(Comparable[] a){
        StdRandom.shuffle(a); //eliminate input dependence
        sort(a, 0, a.length-1);
    }
    public static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo) return;
        int lt = lo, i = lo+1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt){
            int cmp = a[i].compareTo(v);
            if      (cmp <0) exch(a, lt++, i++);
            else if (cmp >0) exch(a,i, gt--);
            else             i++;
        
        }
        sort(a, lo, lt -1);
        sort(a, gt + 1, hi);
       
    
    }
    private static int partition(Comparable[] a, int lo, int hi){
        //partition into a[lo..j-1,a[j],a[j+1..hi] and return j.
        int i = lo, j = hi+1;  //left and right scan indices
        Comparable v = a[lo];  //partitioning item
        while(true){//scan right, scan left, check for scan complete, and exchange.
            while(less(a[++i], v)) if (i == hi) break;
            while(less(v, a[--j])) if (j == lo) break;
            if (i>= j) break;
            exch(a,i,j);
        
        
        }
        exch(a, i,j); // put partitioning item v into a[j].
        return j;     // with a[lo..j-1] <= a[j] <= a[j+1..hi].
    }
        private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0;}
    
    private static void exch(Comparable[] a, int i, int j)
    { Comparable t = a[i]; a[i] = a[j]; a[j] = t;}
    
    public static void main(String[] args){
    
    }
    

}




/**
 * Write a description of Top Down Merge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * Merge Sort is recursive divide and conquer. it runs in between 1/2 nlogn to nlogn time
 * because it has to do roughly n compares and it goes down a binary tree split
 * which is log n
 */
public class Merge {
    private static Comparable[] aux;  //auxillary array for merges
    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];  //allocate space just once.
        sort(a, 0, a.length -1);   //recursive sort is calling itself below notice arguments
        
        
    }
    
    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo) return;
        int mid = lo +(hi - lo)/2;  // 4 lo 8 hi this makes 6 for mid ex  4 + (8-4)/2, 4+ 2 =6
        sort(a, lo, mid);  // sort left half. recursive call brilliant for my level :/
        sort(a, mid+1, hi); // sort right half. again recursive call.  im scared lol.
        merge(a, lo, mid, hi); // function below
        
    
    }
    private static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo, j = mid+1;
        
        for (int k = lo; k <= hi; k++)
            if      (i > mid)                a[k] = aux[j++];
            else if (j> hi)                  a[k] = aux[i++];
            else if (less(aux[j], aux[i]))   a[k] = aux[j++];
            else                             a[k] = aux[i++];
    
    
    }
    private static boolean less(Comparable v, Comparable w)
    { return v.compareTo(w) < 0;}
    
    private static void exchange(Comparable[] a, int i, int j)
    { Comparable t = a[i]; a[i] = a[j]; a[j] = t;}
    
    private static void show(Comparable[] a){
        for (int i = 0; i< a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
        
    }
    
    public static boolean isSorted(Comparable[] a){
        for(int i =1; i< a.length; i++){
            if(less(a[i], a[i-1])) return false; 
        }
        return true;
   
    }
    
    public static void main(String[] args){
    
    }

}

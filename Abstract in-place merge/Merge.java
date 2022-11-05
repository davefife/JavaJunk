
/**
 * Write a description of merge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Merge {
    
    
    public static void merge(Comparable[] a, int lo, int mid, int hi){
        int i = lo, j = mid+1;
        Comparable[] aux= new Comparable[99999];
        
        for(int k = lo; k <= hi; k++) aux[k] = a[k];
        
        for(int k = lo; k <= hi; k++)
            if  (i > mid)                    a[k] = aux[j++];
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
    



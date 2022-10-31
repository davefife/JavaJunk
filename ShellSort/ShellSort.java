


/**
 * Write a description of Example here.
 * template of conventions for implementing array sorts
 * @author (your name) sedgwick and wayne 4th ed. 245
 * @version (a version number or a date)
 */
public class ShellSort {
    public static void sort(Comparable[] a)
    {/* see different sort algorithms 
        Selection sort:  find smallest element in array exchange with first position;
                         find second smallest exchange with second position;
                         continue until sorted.
        Drawback: Running-time is insensitive to input, must search each place.
        Benefit:  Data Movement is minimal( linear  using n exchanges).
        
       
        
        int n = a.length;
        for (int i= 0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++)
                if (less(a[j], a[min])) min = j;
            exchange(a, i, min);
        
        }
        
        insertion sort
        works by shuffling in the right order like organizing a hand of cards.
        best if the array is nearly already sorted.
        on average uses about half the compares of seletion sort.
        
        
        int n = a.length;
        for ( int i =1; i< n; i++){
            for (int j = i; j>0 && less(a[j], a[j-1]); j--)
                exchange(a, j, j-1);
        
        Shell Sort is below, 
        it uses insertion sort while dividng and conquering the data.
        runs 600 times faster on random array than insertion sort alone, but actual run time 
        has not yet been precisely characterized.
                
        */
        int n = a.length;
        int h = 1;
        while(h<n/3) h = 3*h+1;
        while(h>=1){
            for (int i = h; i < n; i++){
                for(int j = i; j>= h && less(a[j], a[j-h]); j-= h)
                   exchange(a, j, j-h);
            }
            h=h/3;
        }
     
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
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
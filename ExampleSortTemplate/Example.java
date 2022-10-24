
/**
 * Write a description of Example here.
 * template of conventions for implementing array sorts
 * @author (your name) sedgwick and wayne 4th ed. 245
 * @version (a version number or a date)
 */
public class Example {
    public static void sort(Comparable[] a)
    {/* see different sort algorithms */}
    
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

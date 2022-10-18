
/**
 * Write a description of WeightedQuickUnionUF here.
 * Quick-Union is often faster than Quick-Find, which can be slow for large data
 * However, Quick-Union is not guaranteed to be faster, so this modification always makes sure
 * that the tree height is optimized to be as short as possible by never putting the larger tree
 * lower than the shorter tree.  This can be shown to have a log efficiency. It does require an 
 * extra array to hold node counts.
 * Sedgewick and Wayne, Algorithms 4th edition pg 228.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WeightedQuickUnionUF {
    private int[] id; //parent link (siteindexed)
    private int[] sz; // size of componenet for roots (site indexed)
    private int count; // number of components
    
    public WeightedQuickUnionUF(int n){
        count = n;
        id = new int[n];
        for(int i = 0; i< n; i++) id[i] = i;
        sz = new int[n];
        for (int i = 0; i < n; i++) sz[i] = 1;
        
    }
    
    public int count(){
        return count;
    }
    
    public boolean connected(int p, int q){
        return find(p) == find(q);
        
    }
    
    public int find(int p){
        while (p != id[p]) p = id[p];
        return p;
    }
    
    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if (i==j) return;
        
        if (sz[i]<sz[j]){id[i] = j; sz[j] += sz[i];}
        else            {id[j] = i; sz[i] += sz[j];}
        count--;
    }

}

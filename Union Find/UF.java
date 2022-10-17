
/**
 * Write a description of UF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class UF {
    private int[] id;   //access to component id (site indexed)
    private int count;  //number of components
    
    public UF(int n){ //initialize component id array
        count = n; id = new int[n];
        id = new int[n];
        for (int i = 0; i < n; i++)
             id[i] = i;
    }
    
    public int count(){
        return count;}
        
    public boolean connected(int p, int q){
        return find(p) == find(q);}
    
    public int find(int p){ 
        return id[p];
    }
    public void union(int p, int q){
        int pID = find(p);
        int qID = find(q);
        
        if(pID == qID) return;
        
        for(int i = 0; i < id.length; i++)
            if (id[i] == pID) id[i] = qID;
        count--;    
   
    }
    
    public static void main(String[] args){
        int n = StdIn.readInt();  //read number of sites
        UF uf = new UF(n);
        while (!StdIn.isEmpty()){
                int p = StdIn.readInt();
                int q = StdIn.readInt();
                if (uf.connected(p, q)) continue;
                uf.union(p, q);
                StdOut.println(uf.count() + " Components");
            
        }
        
        
        }
    }



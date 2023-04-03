
package main;

public class OrdenamientoQuicksort {

    public static void main(String[] args) {
     
        Quicksort qs = new Quicksort();
        
        int [] s = {3, 21, 232, 34,20,50,500,30,58,90,65,74,12,499};
        int [] sb;
        sb = s; 
        
        
        //desordenado
        for (int i = 0; i < sb.length; i++) 
        {
            System.out.println(sb[i]);
        }
        System.out.println("");
        
        
        //ordenado 
        qs.ordenarQuicksort(s);    
        for (int i = 0; i < s.length; i++) 
        {
            System.out.println(s[i]);
        }
        System.out.println("");
        
        
    }
    
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Sheldon {
	
   public static void towerOfHanoi(int n, int from_rod, int to_rod, int aux_rod) 
    { 
        
        if (n == 0) 
        { 
            
            return; 
        } 
        
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        count++;
        if(count==N)
        System.out.println(from_rod + " " + to_rod); 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
    } 
      
    
     public static void main(String args[]) 
     { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            N=sc.nextInt();
            
        towerOfHanoi(n, 1, 3, 2);
        // A, B and C are names of rods 
        
     } 
        
    }
    
    static int count = 0, N;
} 

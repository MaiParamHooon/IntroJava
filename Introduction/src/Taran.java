

	import java.util.*;
	import java.lang.*;
	import java.io.*;
public class Taran{
	
	public static void towerOfHanoi(int n, int from_rod, int to_rod, int aux_rod) 
    { 
       
        if (n == 1) 
        { 
        	a.add(from_rod + " " + to_rod);
            
            return; 
        } 
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
        a.add(from_rod + " " + to_rod);
        
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
    } 
      
    
     public static void main(String args[]) 
     { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
        	String s1=sc.nextLine();
           String s = sc.nextLine();
           int n = s.charAt(0) - '0';
           int k = s.charAt(2) - '0';
        towerOfHanoi(n, 1, 3, 2);
        // A, B and C are names of rods 
        System.out.println(a.get(k-1));
        
     } 
        
    }
    static ArrayList<String> a = new ArrayList<String>();
   
} 

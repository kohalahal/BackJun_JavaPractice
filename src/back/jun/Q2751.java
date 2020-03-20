package back.jun;

import java.util.*;

public class Q2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		    Scanner sc = new Scanner(System.in);
	        int length = sc.nextInt();
	        
	        int[] n = new int[length];
	        
	        for (int i = 0; i < n.length ; ++i)  n[i] = sc.nextInt();
	        sc.close();	        
	        Arrays.sort(n);
	        
	        for (int i = 0; i < n.length ; ++i)  System.out.println(n[i]);
	        long end = System.currentTimeMillis();
	        System.out.println((end-start)/1000.0);
	}

}

package back.jun;



import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q17509 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] d = new int[11];
		int[] v = new int[11];
		int[] t = new int[11];
		int c = 0;
		
		for(int i = 0; i < 11; i++) {
			
			d[i]= sc.nextInt();
			v[i]= sc.nextInt();
			if(v[i] != 0) {
				c++;
				t[i] = d[i];
			}
		}
		
		int[] dd = new int[11+c];
		dd = d.clone();

		
			if(c!=0) {
				
				Arrays.sort(t);
				
				int x = 11-c;
				for(int i = 11; i < 11+c; i++) {
					dd[i] = t[x]; 
					x++;
				}
			} 
		
		Arrays.sort(dd);
		
		int[] q = new int[11+c];
		
		for(int i = 0; i<11+c; i++) {
			q[i] = dd[10+c-i];
			
			
		}
		int sum = 0;
		for(int i = 0; i<11+c; i++) {
			for(int j = 0; j <= i; j++) {
				sum +=  q[j];
		}
		
			System.out.println(sum);
		}
		
		
		
	}

}

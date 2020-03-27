package back.jun;

import java.util.Scanner;

public class Q2446 {
	
	public static void main(String[] args) {
		
		int t = new Scanner(System.in).nextInt();
		int f = 0;
		
		for(int i = 0; i < t*2-1; i++) {
			
			for(int j = 0; j < t*2-1; j++) {
					
				System.out.print((f > 0 && j < f)? " ":j <= t*2-2-f? "*":"");
				//System.out.println();|| (f > 0 && j > t*2-2-f)?
					
					
					
				}System.out.println();
				f = i >= t-1? f-1:f+1; 
				//System.out.print(f);
				
				
				
			}
	
		
	}
	

}

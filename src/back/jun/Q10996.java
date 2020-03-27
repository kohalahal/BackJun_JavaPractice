package back.jun;

import java.util.Scanner;

public class Q10996 {
	
	public static void main(String[] args) {
		
		int t = new Scanner(System.in).nextInt();
		
		
		for(int k = 0; k < t; k++) {
			
			for(int i = 0; i < 2; i++) {
				if(i==0) {
					for(int q = 1; q < t+1; q++ ) {
					 	System.out.print(q%2==1? "*":" ");
					}
					System.out.println();
					if(t==1) i=100;
				}
				if(i==1) {
					for(int q = 1; q < t+1; q++ ) {
						System.out.print(q%2==1? " ":"*");
					}
					System.out.println();
				}
			}
				
				
		
		}//for int k
		
		
		
	}

}

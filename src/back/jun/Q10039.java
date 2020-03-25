package back.jun;

import java.util.Scanner;

public class Q10039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		for(int i = 0; i < 5; i++) {
			int t = sc.nextInt();
			
			total = t<40? total+40:total+t; 
								
		}
		System.out.println(total/5);

	}

}

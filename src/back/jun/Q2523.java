package back.jun;
import java.util.Scanner;
public class Q2523 {
	
	public static void main(String[] args) {
		int t = new Scanner(System.in).nextInt();
		int a = 0;
		for(int i = 0; i < t*2-1; i++ ) {
			
			for(int j = 0; j < t; j++) {
				
				System.out.print(j<=a? "*":"");
			}
			System.out.println();
			a = i<t-1? a+1:a-1;
			
			
		}
		
	}

}

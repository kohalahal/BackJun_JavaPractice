package back.jun;
import java.util.*;

public class Q2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		sc.close();
		char star = '*';
		for (int i =1; i <= n ; ++i) {
			for ( int j =1; j <= i; ++j) {
				System.out.print(star);	
			}
		System.out.println();
		
		}
		

	}

}

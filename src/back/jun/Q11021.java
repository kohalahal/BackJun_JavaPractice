package back.jun;

import java.util.Scanner;

public class Q11021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for ( int i = 0; i<count; i++) {
			int x = sc.nextInt()+sc.nextInt();
			System.out.printf("Case #%d: %d\n",i+1,x);
		}
	}

}

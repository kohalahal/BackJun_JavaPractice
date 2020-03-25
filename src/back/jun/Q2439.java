package back.jun;

import java.util.Scanner;

public class Q2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.close();
		for(int i = 0; i<cnt; i++) {
			for(int j = 0; j<cnt; j++) {
			System.out.print((j<=cnt-i-2)? " ":"*");
			}
			System.out.println();
		}
	}

}

package back.jun;

import java.util.Scanner;

public class Q14681 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x>0) System.out.println((y>0)? "1":"4");
		else System.out.println((y>0)? "2":"3");
	}
	

}

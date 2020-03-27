package back.jun;

import java.util.Scanner;

public class Q5543 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int burger;
		int drink;
		
		if (a<b) {
			if (a<c) {
				burger = a;
			} else { burger = c; }
		} else {
			if (c<b) {
				burger = c;
			} else { burger = b; }
		}
		
		if (d<e) {
			drink = d;
		} else { drink = e; }
		
		System.out.println(burger+drink-50);
		
		
	}

}

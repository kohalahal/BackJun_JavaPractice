package back.jun;
import java.util.Scanner;
public class Q10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a >= b && a <= c) System.out.print(a);
        if (a >= c && a <= b) System.out.print(a);
        if (b >= a && b <= c) System.out.print(b);
        if (b >= c && b <= a) System.out.print(b);
        if (c >= b && c <= a) System.out.print(c);
        if (c >= a && c <= b) System.out.print(c);
               
	}

}

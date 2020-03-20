package back.jun;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Q1001 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        int a;
		        int b;
		        System.out.println("숫자 두 개 쓰면 더해줍니다.");
		        while(true) {
		        
		        	
		        try {
		        a = sc.nextInt();
		        b = sc.nextInt();
		        		 
		        System.out.println("더하면 " + (a + b) + " 입니다."); 
		        }
		        catch ( InputMismatchException e ) {
		        	System.out.println("숫자를 넣으세요.");
		        }
		        
		        }
		    
		}

}

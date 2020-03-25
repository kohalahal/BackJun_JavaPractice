package back.jun;
//import java.io.InputStreamReader;
import java.util.Scanner;
//import java.util.StringTokenizer;
//import java.io.BufferedReader;
//import java.io.IOException;

public class Q1110 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String read = br.readLine();
//        StringTokenizer st = new StringTokenizer(read);
//        int n = Integer.parseInt(st.nextToken());
//        br.close();
        
		Scanner sc = new Scanner(System.in); 
		int n =  sc.nextInt();
		sc.close();
        int a;
        int b;
      
        int at;
        int bt;
        
        int i = 0;
        
        if(n<10) {
        	a = 0; b = n;
        } else {
        	a = n / 10; b= n % 10;
        }
        int aa = a;
        int bb = b;
        
        System.out.println("a="+a+"b="+b);
        
        do { 
        	bt = (aa+bb)%10;
        	at = bb;
        	
        	aa = at;
        	bb = bt;
        	//System.out.printf("%d:aa=%d bb=%d\n", i, aa, bb);
        	i++;
	       } while(!(aa == a && bb == b)) ;
	        	
        System.out.println(i);
        
        
	}

}

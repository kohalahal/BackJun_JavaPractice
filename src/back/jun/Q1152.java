package back.jun;

import java.util.Scanner;

public class Q1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  
		  String[] w = new String[1000];
		  
		  for (int i = 1; i < w.length; i++) {
			  if (sc.next() != null) w[i] = sc.next();
			  else break;
		  }
		  sc.close();
		  for (int i = 1; i < w.length; i++) {
	      if(w[i] == null) {
	    	  System.out.println(i-1);
	      }
		  
		  }
	}

}

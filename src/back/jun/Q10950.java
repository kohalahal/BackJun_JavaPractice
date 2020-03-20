package back.jun;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.IOException;

public class Q10950 {
	

	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tt = br.readLine();
		int t = Integer.parseInt(tt);
		
		int[] a = new int[t];
		int[] b = new int[t];
		
		for ( int i = 0 ; i < t ; ++i ) {
			String pp = br.readLine();
			int idx = pp.indexOf(" ");
			String aa = pp.substring(0, idx);
			String bb = pp.substring(idx+1);
			a[i] = Integer.parseInt(aa);
			b[i] = Integer.parseInt(bb);
						
		}
		for ( int i = 0; i < t ; ++i ) {
			System.out.println(a[i]+b[i]);
					
		}
		
        
	}

}

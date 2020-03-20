package back.jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String s = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(br.readLine());
		int[] a = new int[t];
		int[] b = new int[t];
		br.close();
		while ( st.hasMoreTokens()) {
		for ( int i = 0 ; i < t ; i++ ) {
			
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
			
		}
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for ( int i = 0 ; i < t ; i ++ ) {
			bw.write(a[i]+b[i]);
			
			
		}
		
	}

}

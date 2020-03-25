package back.jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		
		int t = Integer.parseInt(st.nextToken());
		
		for ( int i = 0 ; i < t ; i++ ) {
			line = br.readLine();
			st = new StringTokenizer(line);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int x = a+b;
			bw.write(x+"\n");
		}
		br.close();
		bw.flush();
		
//		for ( int i = 0 ; i < t ; i ++ ) {
//			int x = a[i]+b[i];
//			bw.write(x+"\n");
//			bw.flush();
//			//System.out.println((a[i]+b[i]));
//			
//			
//		} bw.close();
		
	}

}

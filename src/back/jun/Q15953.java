package back.jun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15953 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		//String t = br.readLine();
		//StringTokenizer t = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(br.readLine());
		
		
		
		for(int i = 0; i < t; i++) {
			int total = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			total = ( a==0? 0:a<2?5000000:a<4?3000000:a<7?2000000:a<11?500000:a<16?300000:a<22?100000:0) + (b==0?0:b<2?5120000:b<4?2560000:b<8?1280000:b<16?640000:b<32?320000:0);
			//System.out.printf("a:%d,b:%d,A:%d,B:%d\n",a,b,a==1?5000000:a<4?3000000:a<7?2000000:a<11?500000:a<16?300000:a<22?100000:0,b==1?5120000:b<4?2560000:b<8?1280000:b<16?640000:b<32?320000:0);
			bw.write(total+"\n");
			
		}
		bw.flush();
		
		
	}
}

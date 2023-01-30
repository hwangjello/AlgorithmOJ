package BOJ_Step.조건문;

import java.io.*;
import java.util.StringTokenizer;

public class boj2884 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str," ");
		
		int h=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int a,b;
		if(m<45) {
			if(h==0) {
				a=23;
				b=60-(45-m);
			}
			else {
				a=h-1;
				b=60-(45-m);
			}
			System.out.println(a+" "+b);
		}
		else {
			a=h;
			b=m-45;
			System.out.println(a+" "+b);
		}
		

	}

}

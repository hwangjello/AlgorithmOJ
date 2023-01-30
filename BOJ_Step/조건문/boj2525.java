package BOJ_Step.조건문;

import java.io.*;
import java.util.StringTokenizer;
public class boj2525 {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str," ");
		
		int h=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int t=Integer.parseInt(br.readLine());
		
		int a=t/60;
		int b=t%60;
		
		int c,d;
		if(m+b>=60) {
			if(h+a>=24) {
				c=h+a-24+1;
				d=m+b-60;
				if(c==24) {
					c=0;
				}
				System.out.println(c+" "+d);
			}
			else {
				c=h+a+1;
				d=m+b-60;
				if(c==24) {
					c=0;
				}
				System.out.println(c+" "+d);
			}
		}
		else {
			if(h+a>=24) {
				c=h+a-24;
				d=m+b;
				if(c==24) {
					c=0;
				}
				System.out.println(c+" "+d);
			}
			else {
				c=h+a;
				d=m+b;if(c==24) {
					c=0;
				}
				System.out.println(c+" "+d);
			}
		}
		

	}

}

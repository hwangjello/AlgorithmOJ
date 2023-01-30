package BOJ_Step.조건문;

import java.io.*;
import java.util.StringTokenizer;

public class bojo2480 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str," ");

		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int prize;
		
		if(a==b&&b==c) {
			prize=10000+(a)*1000;
			System.out.println(prize);
		}
		else if((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&b!=a)) {
			if((a==b&&a!=c)||(a==c&&a!=b)) {
				prize=1000+a*100;
			}
			else {
				prize=1000+b*100;
			}
			System.out.println(prize);
		}
		else if(a!=b&&b!=c&&a!=c) {
			int max=0;
			if(a>b&&a>c) max=a;
			else if(b>a&&b>c) max=b;
			else max=c;
			prize=max*100;
			System.out.println(prize);
		}
	}

}

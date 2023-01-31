package BOJ_Step.반복문;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String str=br.readLine();
//		StringTokenizer st=new StringTokenizer(str," ");
////		int a=-1,b=-1;
////		int [] sum=new int [100];
//		int i=0;
//		int [] arr1=new int [100];
//		int [] arr2=new int [100];
//		
//		do {
//			arr1[i]=Integer.parseInt(st.nextToken());
//			arr2[i]=Integer.parseInt(st.nextToken());
//			i++;
//		}while(arr1[i]==0&&arr2[i]==0);
//		for(int j=0;j<i;j++) {
//			System.out.println(arr1[j]+arr2[j]);
//		}
		StringTokenizer st;
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			st=new StringTokenizer(br.readLine()," ");
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			if(a==0&&b==0) {
				break;
			}
			
			sb.append((a+b)).append('\n');
		}
		System.out.println(sb);
	}

}

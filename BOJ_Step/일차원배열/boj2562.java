package BOJ_Step.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr=new int [9];
		
		for(int i=0;i<9;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		br.close();
		
		int max=0;
		int a=0;
		int b=0;
//		for (int i=0;i<9;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
		for(int value:arr) {
			a++;
			if(value>max) {
				max=value;
				b=a;
			}
		}
		System.out.println(max);
		System.out.println(b);
		
	}

}
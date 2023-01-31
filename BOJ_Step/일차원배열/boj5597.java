package BOJ_Step.일차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr=new int [31];
//		int a=0;
//		int [] no=new int [2];
		for(int i=1;i<29;i++) {
			int yes=Integer.parseInt(br.readLine());
			arr[yes]=1;
		}
		br.close();
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=1) {
				System.out.println(i);
			}
		}
//		for(int i=0;i<30;i++) {
//			for(int j=1;j<31;j++) {
//				if(j==arr[i]) {
//					
//				}
//				else {
//					j=no[a];
//					a++;
//				}
//			}
//		}
//		int min=31;
//		int max=0;
//		for(int i=0;i<2;i++) {
//			if(min>no[i]) {
//				min=no[i];
//			}
//			else if(max<no[i]) {
//				max=no[i];
//			}
//		}
//		System.out.println(min);
//		System.out.println(max);
		
	}

}

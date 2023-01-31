package BOJ_Step.일차원배열;

import java.util.*;

public class boj10807 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int [] arr=new int [n];
		int a=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int t=scan.nextInt();
		scan.close();
		for(int i=0;i<n;i++) {
			if(arr[i]==t) {
				a++;
			}
		}
		System.out.println(a);
	}

}

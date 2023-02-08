package BOJ_Step.함수;

import java.util.*;

public class boj1065 {
	public static int [] arr;
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		
		scan.close();
		arr = new int [3];
		hansoo(n);
		
		
	}
	public static void hansoo(int n) {
		int j=0;
		int ans=0;
		for(int i=1;i<n+1;i++) {
			int copy=i;
			if(i<100) {
				ans+= 1;
			}
			else if(i==1000) {
				ans+=0;
			}
			else {
				while(copy>0) {
					arr[j]=copy%10;
					copy/=10;
					j++;
					
				}
				j=0;
				if(arr[2]-arr[1]==arr[1]-arr[0]) {
					ans+=1;
				}
			}
		}
		System.out.println(ans);
	}
}

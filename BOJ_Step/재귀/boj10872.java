package BOJ_Step.재귀;

import java.util.*;

public class boj10872 {
	public static int ans=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		scan.close();
		ans=factorial(n);
		System.out.println(ans);
	}
	public static int factorial(int n) {
		if(n==1||n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}

}

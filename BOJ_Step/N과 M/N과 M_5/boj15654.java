package BOJ_Step.N과 M.N과 M_5;

import java.util.*;

public class boj15654 {
	public static int [] arr;
	public static int [] print;
	public static int [] tra;
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		arr=new int [n+1];
		print=new int[m];
		tra=new int[n];
		for(int i=1;i<n+1;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		scan.close();
		
		dfs(n,m,0);
	}
	public static void dfs(int n,int m,int depth) {
		if(depth==m) {
			for(int i=0;i<m;i++) {
				System.out.print(print[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=0;i<n;i++) {
			if(tra[i]==0) {
				tra[i]=1;
				print[depth]=arr[i+1];
				dfs(n,m,depth+1);
				
				tra[i]=0;
			}
		}
	}

}

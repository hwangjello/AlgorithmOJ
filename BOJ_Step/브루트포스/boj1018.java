package BOJ_Step.브루트포스;

import java.util.*;

public class boj1018 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		String [] arr=new String [n];
		char [][] chess=new char [n][m];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.next();
			for(int j=0;j<m;j++) {
				chess[i][j]=arr[i].charAt(j);
			}
		}
		scan.close();
		
		int min4w,min4b;
		
		if(chess[0][0]=='W') {
			
		}
		
	}

}

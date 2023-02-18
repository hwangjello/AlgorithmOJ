package BOJ_Step.브루트포스;

import java.util.*;

public class boj1018 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		String [] arr=new String [n];
		char [][] chess=new char [n][m];
		char [][] copy= chess;
		for(int i=0;i<n;i++) {
			arr[i]=scan.next();
			for(int j=0;j<m;j++) {
				chess[i][j]=arr[i].charAt(j);
			}
		}
		scan.close();
		
		int min4w=0;
		int min4b=0;
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<m/2;j++) {
				if(i%2==0) {
					if(copy[i][2*j]!='B') {
						min4w++;
					}
					if(copy[i][2*j-1]!='W') {
						min4w++;
					}
				}
				else {
					if(copy[i][2*j]!='W') {
						min4w++;
					}
					if(copy[i][2*j-1]!='B') {
						min4w++;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=1;j<m/2;j++) {
				if(i%2==0) {
					if(copy[i][2*j]!='W') {
						min4b++;
					}
					if(copy[i][2*j-1]!='B') {
						min4b++;
					}
				}
				else {
					if(copy[i][2*j]!='B') {
						min4b++;
					}
					if(copy[i][2*j-1]!='W') {
						min4b++;
					}
				}
			}
		}
		System.out.println(min4w+" "+min4b);
		System.out.println(Math.min(min4w,min4b));
		
		
	}

}

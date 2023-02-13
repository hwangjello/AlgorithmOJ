package BOJ_Step.브루트포스;

import java.util.*;

public class boj2798 {
	public static int [] card;
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int n= scan.nextInt();
		int m= scan.nextInt();
		int [] cand=new int [500000];
		card= new int [n];
		int l=0;
		for(int i=0;i<n;i++) {
			card[i]=scan.nextInt();
		}
		scan.close();
		
		Arrays.sort(card);
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					cand[l]=card[i]+card[j]+card[k];
					//System.out.println(cand[l]);
					l++;
				}
			}
		}
		Arrays.sort(cand);
		int b=499999;
		while(true) {
			if(cand[b]>m) {
				b--;
			}
			else if(cand[b]<=m) {
				System.out.println(cand[b]);
				break;
			}
		}

	}
}

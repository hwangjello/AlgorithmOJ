package BOJ_Step.브루트포스;

import java.util.*;

public class boj7568 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int [] wei=new int [n];
		int [] hei=new int [n];
		for(int i=0;i<n;i++) {
			wei[i]=scan.nextInt();
			hei[i]=scan.nextInt();
		}
		scan.close();
		
		int [] rank=new int [n];
		for(int i=0;i<n;i++) {
			rank[i]=1;
		}
		
        
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(wei[i]<wei[j]) {
					if(hei[i]<hei[j]) {
						rank[i]+=1;
					}
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(rank[i]+" ");
		}
	
	}

}

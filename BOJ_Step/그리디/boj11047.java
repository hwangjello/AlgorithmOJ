package BOJ_Step.그리디;
import java.util.*;

public class boj11047 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int k=scan.nextInt();
		int m=0;
		int min=0;
		int copy=k;
		int [] coin=new int [n];
		
		for(int i=0;i<n;i++) {
			coin[i]=scan.nextInt();
		}
		scan.close();
		
		
		while(true) {
			if(n<=0)break;
			if(coin[m]>=k)break;
			m++;
			if(m==n-1)break;
		}
		//System.out.println(coin[m]);
		while(copy>0) {
			if(n<=0)break;
			if(coin[m]<=copy) {
				min+=copy/coin[m];
				copy-=coin[m]*(copy/coin[m]);
				if(m==0)break;
				if(copy<=0)break;
				m--;
			}
			else {
				if(m==0)break;
				m--;
			}
		}
		
		System.out.println(min);
		
	}

}

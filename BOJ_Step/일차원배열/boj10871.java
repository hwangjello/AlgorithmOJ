package BOJ_Step.일차원배열;
import java.util.*;

public class boj10871 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int t=scan.nextInt();
		
		int [] arr=new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		int [] ans=new int[n];
		int a=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<t) {
				ans[a]=arr[i];
				a++;
			}
		}
		for(int i=0;i<a;i++) {
			System.out.print(ans[i]);
			if(i<a-1) {
				System.out.print(" ");
			}
		}
		
	}

}

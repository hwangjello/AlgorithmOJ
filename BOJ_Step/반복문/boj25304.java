package BOJ_Step.반복문;
import java.util.Scanner;

public class boj25304 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int total=scan.nextInt();
		int n=scan.nextInt();
		
		int [] cost=new int[n];
		int [] num=new int [n];
		for(int i=0;i<n;i++) {
			cost[i]=scan.nextInt();
			num[i]=scan.nextInt();
		}
		int isRight=0;
		for(int i=0;i<n;i++) {
			isRight=isRight+cost[i]*num[i];
		}
		if(isRight==total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
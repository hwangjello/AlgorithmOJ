package BOJ_Step.반복문;
import java.util.*;

public class boj2438 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("*");
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

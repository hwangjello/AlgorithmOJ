package BOJ_Step.브루트포스;

import java.util.*;

public class boj1436 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		scan.close();
		
		int num=666;
		int cnt=1;
		
		while(cnt!=n) {
			num++;
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
		
	}

}

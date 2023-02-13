package BOJ_Step.브루트포스;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class boj2231 {
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int n=Integer.parseInt(br.readLine());
		constructor(n);		
	}
	public static void constructor(int n) {
		//int b=0;
		int a=1;
		while(true) {
			int sum=0;
			int copy=a;
			while(copy>0) {
				sum+=copy%10;
				copy/=10;
			}
			sum+=a;
			//System.out.println(a+" "+sum);
            //이 코드로 안 나오는 것이 있다는 것을 알게됨. 안 나오는 것 돌려보면 무한루프.
			if(sum==n) {
				System.out.println(a);
				break;
			}
			else if(a>n) {
                //무한루프를 방지하고자 이 조건문 삽입.
				System.out.println(0);
				break;
			}
			else {
				a++;
			}
			copy=0;
//			if(a>n) {
//				break;
//			}
		}
		
	}
}

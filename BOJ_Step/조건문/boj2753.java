package BOJ_Step.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(br.readLine());
		//BR은 String 타입으로 입력받기 때문에 반드시 Integer.parseInt()로 정수형으로 바꿔주어야 한다.
		
		if(a%4==0) {
			if(a%100==0&&a%400!=0) {
				System.out.println(0);
			}
			else {
				System.out.println(1);
			}
		}
		else {
			System.out.println(0);
		}
	}

}

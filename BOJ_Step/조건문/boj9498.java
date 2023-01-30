package BOJ_Step.조건문;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//이 문제부터는 buffered Reader를 사용하여 입력을 받도록 하겠다. 

public class boj9498 {
    public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int a=Integer.parseInt(br.readLine());
		
		if(a<=100&&a>=90) {
			System.out.println("A");
		}
		else if(a>=80&&a<=89) {
			System.out.println("B");
		}
		else if(a>=70&&a<=79) {
			System.out.println("C");
		}
		else if(a>=60&&a<=69) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}
}

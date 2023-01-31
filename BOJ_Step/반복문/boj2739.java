package BOJ_Step.반복문;

import java.io.*;

public class boj2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		br.close();
		
		//close 를 해주어 자원 사용을 멈춤
		
		//bufferedWriter 도 알아보기
		
		for(int i=1;i<10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}

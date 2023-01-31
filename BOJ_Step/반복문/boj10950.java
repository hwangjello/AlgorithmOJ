package BOJ_Step.반복문;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class boj10950 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String str=br.readLine();
//		StringTokenizer st=new StringTokenizer(str," ");
//		
//		int n=Integer.parseInt(br.readLine());

		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int [] arr1=new int[n];
		int [] arr2=new int[n];
		for(int i=0;i<n;i++) {
//			arr1[i]=Integer.parseInt(st.nextToken());
//			arr2[i]=Integer.parseInt(st.nextToken());
			arr1[i]=scan.nextInt();
			arr2[i]=scan.nextInt();
		}
		scan.close();
		
		
		for(int i=0;i<n;i++){
			System.out.println(arr1[i]+arr2[i]);
		}
		
		//String Tokenizer를 사용하다가 오류가 떠서 Scanner로 그냥 해결
		//다시 찾아보기
		
	}

}

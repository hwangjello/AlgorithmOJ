package BOJ_Step.반복문;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj11021 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		String str=br.readLine();
//		StringTokenizer st=new StringTokenizer(str," ");
//		
//		int n=Integer.parseInt(br.readLine());
//		
//		int [] arr1=new int[n];
//		int [] arr2=new int[n];
//		
//		for (int i=0;i<n;i++) {
//			arr1[i]=Integer.parseInt(st.nextToken());
//			arr2[i]=Integer.parseInt(st.nextToken());
//		}
//		for(int i=1;i<n+1;i++) {
//			System.out.printf("Case #\n: "+arr1[i]+arr2[i],i);
//			System.out.println();
//		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		StringTokenizer st;

		int n=Integer.parseInt(br.readLine());
		
		for (int i = 1; i < n+1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append("Case #").append(i).append(": ").append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}

}

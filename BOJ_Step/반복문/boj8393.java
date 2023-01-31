package BOJ_Step.반복문;
import java.io.*;

public class boj8393 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int ans=0;
		for(int i=1;i<n+1;i++) {
			ans=ans+i;
		}
		System.out.println(ans);
		
	}

}

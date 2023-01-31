package BOJ_Step.반복문;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj1110 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		int in=-1;
		int a=n/10;
		int b=n%10;
		int c=(a+b)%10;
		String str1,str2;
		int i=1;
		while(true) {
			str1=Integer.toString(b);
			str2=Integer.toString(c);
			in=Integer.parseInt(str1+str2);
			if(in==n) {
				break;
			}
			a=in/10;
			b=in%10;
			c=(a+b)%10;
			i++;			
		}
		System.out.println(i);
		
		
	}

}

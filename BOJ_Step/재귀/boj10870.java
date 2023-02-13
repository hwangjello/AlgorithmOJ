import java.util.*;
public class boj10870 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		
		int ans=fibonacci(n);
		System.out.println(ans);
	}
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}

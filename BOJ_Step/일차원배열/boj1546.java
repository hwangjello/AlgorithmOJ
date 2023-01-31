package BOJ_Step.일차원배열;
import java.util.*;

public class boj1546 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		double [] arr= new double [n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		double max=-1;
		for (int i=0;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		double [] mani=new double [n];
		
		for(int i=0;i<n;i++) {
			mani[i]=arr[i]/max*100;
		}
		double sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+mani[i];
		}
		System.out.println(sum/n);
	}

}

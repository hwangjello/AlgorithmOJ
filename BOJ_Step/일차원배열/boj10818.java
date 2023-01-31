package BOJ_Step.일차원배열;
import java.util.*;

public class boj10818 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int [] arr= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		int min=1100000;
		int max=-1100000;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(min+" "+max);
	}

}

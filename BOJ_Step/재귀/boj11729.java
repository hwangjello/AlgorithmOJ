import java.util.*;
//과정 출력 실패
public class boj11729 {
	public int [] arr1;
	public int [] arr2;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		
		int ans=hanoi(n,1,3);
		System.out.println(ans);
	}
	public static int hanoi(int n,int start,int end) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 3;
		}
		return 2*hanoi(n-1)+1;
	}

}
1 3
1 2
3 2
1 3
2 1
2 3
1 3
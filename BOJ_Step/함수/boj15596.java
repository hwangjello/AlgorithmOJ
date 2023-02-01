package BOJ_Step.함수;

public class boj15596 {
    long sum(int [] a) {
		long ans=0;
		for(int i=0;i<a.length;i++) {
			ans=ans+a[i];
		}
		return ans;
	}
}

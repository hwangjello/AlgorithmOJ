package BOJ_Step.함수;
//9972가 만들 수 있는 수는 9999이고 9973이 만들 수 있는 수는 10001이다 .
//9972보다 작은 수 중에서도 10000을 넘기는 수가 나올 수 있다. (ex. 9969)
public class boj4673 {
	static void selfNumber() {
		int [] cand=new int [10500];
		int [] cons1=new int [10500];
		int [] exist=new int [10599];
		int cons=0;
		for(int i=0;i<10500;i++) {
			cand[i]=i;
			int copy=cand[i];
			cons=copy;
			while(copy>0) {
				cons=cons+copy%10;
				copy=copy/10;
			}
			exist[cons]=1;
			
		}
		for(int i=1;i<10001;i++) {
			if(exist[i]!=1) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)  {
		selfNumber();
	}
}

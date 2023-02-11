import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class boj15656 {
	public static int [] arr;
	public static int [] print;
	static BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str," ");
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		arr=new int [n+1];
		print=new int[m];
//		int a=1;
		for(int i=1;i<n+1;i++) {
			if(scan.hasNextInt()) {
				arr[i]=scan.nextInt();
			}
		}
		Arrays.sort(arr);
		br.close();
		scan.close();
		
		dfs(n,m,0,0);
	}
	public static void dfs(int n,int m,int depth, int start) throws IOException {		
		if(depth==m) {
			for(int i=0;i<m;i++) {
				bw.write(Integer.toString(print[i])+" ");
			}
			bw.newLine();
			return;
		}
		for(int i=0;i<n;i++) {
			print[depth]=arr[i+1];
			dfs(n,m,depth+1,i+1);
		}
		bw.flush();

	}

}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class boj15652 {
	public static int arr [];
	public static int tra [];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str, " ");
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		br.close();
		
		arr=new int [m];
		tra=new int [n];
		dfs(n,m,0,0);
	}
	
	public static void dfs(int n, int m, int depth,int start) {
		if(depth==m) {
			for(int i=0;i<m;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=start-1;i<n;i++) {
			if(i>=0) {
				arr[depth]=i+1;
				dfs(n,m,depth+1,i+1);
			}
		}
		
		
	}

}

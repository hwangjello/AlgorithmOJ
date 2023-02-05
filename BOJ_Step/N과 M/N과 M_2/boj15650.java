import java.util.*; 

public class boj15650 { 
    public static int [] arr; 
    public static int [] tra; 
//  public static int [] OnceU;
    public static void main(String[] args) { 
        Scanner scan=new Scanner(System.in); 
        int n=scan.nextInt(); 
        int m=scan.nextInt(); 
        scan.close(); 
        arr=new int[m]; 
        tra=new int[n]; 
//        OnceU=new int[n];
        dfs(n,m,0,0);               
    } 
    public static void dfs(int n,int m,int depth, int start) { 
        if(depth==m) { 
            for(int i=0;i<m;i++) { 
                System.out.print(arr[i]+" "); 
            } 
            System.out.println(); 
            return; 
        }
        for(int i=start;i<n;i++) { 
            if(tra[i]==0 ) { 
                tra[i]=1; 
                arr[depth]=i+1; 
                dfs(n,m,depth+1,i+1); 
                tra[i]=0; 
            } 
        }
//        for(int i=0;i<n;i++) { 
//            OnceU[i]=1;
//        } 
    }

}
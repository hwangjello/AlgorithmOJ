import java.util.*; 

<<<<<<< HEAD
public class boj15650 { 
    public static int [] arr; 
    public static int [] tra; 
//  public static int [] OnceU;
    public static void main(String[] args) { 
=======
public class Main { 
    public static int [] arr; 
    public static int [] tra; 
        public static int [] OnceU;
        public static void main(String[] args) { 
>>>>>>> 1a8fda037641b7e28e74df620b1f59f93cae3d0d
        Scanner scan=new Scanner(System.in); 
        int n=scan.nextInt(); 
        int m=scan.nextInt(); 
        scan.close(); 
        arr=new int[m]; 
        tra=new int[n]; 
<<<<<<< HEAD
//        OnceU=new int[n];
        dfs(n,m,0,0);               
    } 
    public static void dfs(int n,int m,int depth, int start) { 
=======
        OnceU=new int[n];
        dfs(n,m,0);               
        } 
    public static void dfs(int n,int m,int depth) { 
>>>>>>> 1a8fda037641b7e28e74df620b1f59f93cae3d0d
        if(depth==m) { 
            for(int i=0;i<m;i++) { 
                System.out.print(arr[i]+" "); 
            } 
            System.out.println(); 
            return; 
        }
<<<<<<< HEAD
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
=======
        for(int i=0;i<n;i++) { 
            if(tra[i]==0&&OnceU[i]==0 ) { 
                tra[i]=1; 
                arr[depth]=i+1; 
                dfs(n,m,depth+1); 
                tra[i]=0; 
            } 
        }
            for(int i=0;i<n;i++) { 
                OnceU[i]=1;
            } 
    }

}
>>>>>>> 1a8fda037641b7e28e74df620b1f59f93cae3d0d

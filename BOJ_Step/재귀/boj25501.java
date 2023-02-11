package BOJ_Step.재귀;

import java.util.*;

public class boj25501{
	public static int num=0;
    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else {
        	num++;
        	return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
    	num++;
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
    	Scanner scan=new Scanner(System.in);
    	
    	int n=scan.nextInt();
    	String [] arr=new String [n];
    	for(int i=0;i<n;i++) {
    		arr[i]=scan.next();
    	}
    	scan.close();
        for(int i=0;i<n;i++) {
        	System.out.println(isPalindrome(arr[i])+" "+num);
        	num=0;
        }
    }
}
import java.util.*;
public class LexicoGraphicalNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[]arr=new int[n];
		count(arr,n,1,1,-1);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
        scn.close();
	}
	public static int count(int[]arr,int n,int d,int i,int s){
		if(i<=n &&d<=9){
		    s=s+1;
		    arr[s]=i;
		    s=count(arr,n,0,i*10,s);
		    s=count(arr,n,d+1,i+1,s);
		}
		return s;	
	}
}
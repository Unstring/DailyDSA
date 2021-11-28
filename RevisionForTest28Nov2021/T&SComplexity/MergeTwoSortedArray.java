import java.util.*;

public class MergeTwoSortedArray {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int i = 0;
    int j = 0;
    int k = 0;
    
    int[] resarr = new int[a.length + b.length];
    while(i < a.length && j < b.length){
        if(a[i] < b[j]){
            resarr[k] = a[i];
            i++;
            k++;
        }else{
            resarr[k] = b[j];
            j++;
            k++;
        }
    }
    while(i < a.length){
        resarr[k] = a[i];
        k++;
        i++;
    }
    
    while(j < b.length){
        resarr[k] = b[j];
        j++;
        k++;
    }
    
    return resarr;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    scn.close();
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}
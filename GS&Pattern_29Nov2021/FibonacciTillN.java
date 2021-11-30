import java.util.*;
  
  public class FibonacciTillN{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      int n = scn.nextInt();
      scn.close();
      
      int pt = 0;
      int ct = 1;
      
      for(int i = 0; i < n; i++){
          int nt = pt + ct;
          
          System.out.println(pt);
          
          int temp = ct;
          ct = nt;pt = temp;
      }
   }
  }
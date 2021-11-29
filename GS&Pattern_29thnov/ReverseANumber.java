import java.util.*;
   
   public class ReverseANumber{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     scn.close();
     int div = 10;
     while(n > 0){
         int dig = n % div;
         n = n / div;
         System.out.println(dig);
     }
    }
   }
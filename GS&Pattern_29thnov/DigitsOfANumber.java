import java.util.*;
   
   public class DigitsOfANumber{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     scn.close();
     int cn = n;
     int m = 1;
     while(cn > 9){
         cn /= 10;
         m *= 10;
     }
     cn = n;
     while(cn > 0){
         int dig = cn/m;
         cn = cn % m;
         m = m / 10;
         if(m > 0 && cn == 0){
             System.out.println(dig);
            //  System.out.println(0);
             for(int i = 1; i < m*10; i = i*10){
                 System.out.println(0);
             }
         }else{
             System.out.println(dig);
         }
     }
    }
   }
import java.util.*;

public class PrimesInRange{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        for(int i = n1; i <= n2; i++){
            int count = 0;
            for(int j = 2; j*j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
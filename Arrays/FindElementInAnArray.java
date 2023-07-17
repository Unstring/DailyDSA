package Arrays;

import java.util.Scanner;

public class FindElementInAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int number = scn.nextInt();
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
            }
        }
        System.out.println(index);
    }
}

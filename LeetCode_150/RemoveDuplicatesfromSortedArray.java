package LeetCode_150;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * RemoveDuplicatesfromSortedArray
 */
public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i = 0;
    
        for (final int num : nums)
          if (i < 1 || num > nums[i - 1])
            nums[i++] = num;
    
        return i;
      }

    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements for the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        RemoveDuplicatesfromSortedArray solution = new RemoveDuplicatesfromSortedArray();
        int k = solution.removeDuplicates(arr);
        
        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }
        System.out.print("Result Array: ");
        System.out.println(Arrays.toString(res));
    }
}
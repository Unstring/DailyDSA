package LeetCode_150;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
      }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array : ");
        int m = Integer.parseInt(reader.readLine());
        int[] nums = new int[m];
        System.out.println("Enter " + m + " elements for the array:");
        for (int i = 0; i < m; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Enter value you want to remove from the array:");
        int val = Integer.parseInt(reader.readLine());

        RemoveElement solution = new RemoveElement();
        int k = solution.removeElement(nums, val);

        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[i];
        }
        System.out.print("Result Array: ");
        System.out.println(Arrays.toString(res));
    }
}

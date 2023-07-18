package LeetCode_150;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the first array (nums1): ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("Enter the size of the second array (nums2): ");
        int n = Integer.parseInt(reader.readLine());
        int[] nums1 = new int[m + n];
        System.out.println("Enter " + m + " elements for the first array:");
        for (int i = 0; i < m; i++) {
            nums1[i] = Integer.parseInt(reader.readLine());
        }

        int[] nums2 = new int[n];
        System.out.println("Enter " + n + " elements for the second array:");
        for (int i = 0; i < n; i++) {
            nums2[i] = Integer.parseInt(reader.readLine());
        }

        MergeSortedArray solution = new MergeSortedArray();
        solution.merge(nums1, m, nums2, n);

        System.out.print("Merged Sorted Array: ");
        System.out.println(Arrays.toString(nums1));
    }
}

import java.util.Arrays;

public class A_88 {

        public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            // Start from the end of nums1 and nums2
            int i = m - 1; // Last element in nums1's real part
            int j = n - 1; // Last element in nums2
            int k = m + n - 1; // Last position in nums1

            // Merge in reverse order
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }

            // If nums2 has remaining elements
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
            return nums1;

            // No need to copy remaining nums1 elements, as they are already in place
        }

        public static void main(String[] args) {
           int[] num1 = {1,2,3,0,0,0};
           int[] nums2 = {2,3,4};
            System.out.println(Arrays.toString(merge(num1,3,nums2,3)));
        }
    }

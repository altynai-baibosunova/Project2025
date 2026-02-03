import java.util.Arrays;

public class A_704_BinarySearch {

    public static int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4,1};
        System.out.println(Arrays.toString(new int[]{search(nums, 4)}));
    }
}

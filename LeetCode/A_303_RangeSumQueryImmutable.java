import java.util.Arrays;

public class A_303_RangeSumQueryImmutable {
    public static class  NumArray {
    int[] prefix;
        public NumArray(int[] nums) {
            int n = nums.length;
            prefix = new int[n];
            if(n == 0) return;
            prefix[0] = nums[0];
            for(int i=1; i<n; i++){
                prefix[i] = prefix[i-1] + nums[i];
            }
        }
        public int sumRange(int left, int right) {
            if(left == 0){
                return prefix[right];
            }else{
                return prefix[right] -prefix[left-1];
            }
            }
        }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);

        System.out.println("sumRange(0,2) = " + obj.sumRange(0, 2)); // 1
    }
}

public class A_35 {
    public static int searchIndex(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left+(right-left/2);

            if (nums[mid]==target) {
                return  mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;

    }

    public static void main(String[] args) {
        int[] nums={11,22,33,44};
        System.out.println(searchIndex(nums, 13));
    }
}

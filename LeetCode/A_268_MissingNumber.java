public class A_268_MissingNumber {

        public int missingNumber(int[] nums) {
            int sizeofNums = nums.length;
            int expected = sizeofNums * (sizeofNums+1)/2;
            int actual = 0;

            for(int num : nums){
                actual += num;
            }
            return expected-actual;
        }

    public static void main(String[] args) {
        A_268_MissingNumber obj = new A_268_MissingNumber();
        int[] nums = {0,4,3,2};
        int result = obj.missingNumber(nums);
        System.out.println(result);
    }
}

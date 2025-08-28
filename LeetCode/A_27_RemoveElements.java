public class A_27_RemoveElements {
        public int removeElement(int[] nums, int val) {
            int k = 0;

            for (int i = 0; i < nums.length; i++) {  //[3, 2, 2, 3] val=3
                if(nums[i] != val){                 // if nums = 3
                     nums[k] = nums[i];
                     k++;

                }

            }
            return  k;

        }

    public static void main(String[] args) {
        A_27_RemoveElements obj = new A_27_RemoveElements();
        int[] nums = {2,3,3,2};
        int res = obj.removeElement(nums,3);
        System.out.println(res);

    }
}

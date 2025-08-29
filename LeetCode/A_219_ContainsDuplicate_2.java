public class A_219_ContainsDuplicate_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
                                           //nums=[1,    2,  3,   1]
        for(int i=0; i<nums.length; i++){ //      [0:1, 1:2, 2:3, 3:1]
            for(int j=i+1; j<nums.length; j++){ //   [1:2, 1:2, 1:3, 1:1]
                                                   //  0    1    2    3
                if(nums[i]==nums[j]){
                    if(j-i <=k){
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,8};
        A_219_ContainsDuplicate_2 obj = new A_219_ContainsDuplicate_2();
        boolean result = obj.containsNearbyDuplicate(nums, 3);
        System.out.println(result);
    }
}

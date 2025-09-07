import java.util.Arrays;
import java.util.HashMap;

public class A_1_SumofNum {

        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int differentNum = target - nums[i];
                if(map.containsKey(differentNum)){ //7
                    return new int[] {map.get(differentNum),i};
                }else {
                    map.put(nums[i],i);
                }

            }
            throw new IllegalArgumentException("No sum numbers");
        }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        A_1_SumofNum obj = new A_1_SumofNum();
        int[] res = obj.twoSum(nums, 9);
        System.out.println(Arrays.toString(res));
    }
}

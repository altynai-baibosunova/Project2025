import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A_01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] Ar = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int difference = target - i;
            if(map.containsKey(difference)){
               return new int[] {map.get(difference),i};
            }else {
                map.put(nums[i], i);
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        A_01_TwoSum obj = new A_01_TwoSum();
        int[] res = obj.twoSum(nums, 9);
        System.out.println(Arrays.toString(res));
    }
}

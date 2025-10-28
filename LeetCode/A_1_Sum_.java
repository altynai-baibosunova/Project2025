import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A_1_Sum_ {
    public static int[] twoSum(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{};
    }

    public static int[] twoSumHashTable(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference)){
               return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);

        }
     return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSumHashTable(nums, 9)));
    }

}
//[2,7,11,15]

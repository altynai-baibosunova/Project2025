import java.util.HashMap;
import java.util.Map;

public class A_1_Sum_ {
    public int[] twoSum(int[] nums, int target) {
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

    public int[] twoSumHashTable(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(map.containsKey(difference)){
               return new int[]{nums[i], map.get(difference)};
            }
            map.put(nums[i], i);

        }
     return new int[]{};
    }

}
//[2,7,11,15]

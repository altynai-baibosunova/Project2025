package week17;

import java.util.HashMap;

public class Sum {

        public int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> map = new HashMap<>();


            for (int i = 0; i < nums.length; i++) { // 2 , 7, 2, 11
                int differense = target - nums[i];   //9-2
                if (map.containsKey(differense)) { //7
                    return new int[]{map.get(differense), i};
                } else {
                    map.put(nums[i], i);
                }
            }
                  throw new IllegalArgumentException("No Sum");
        }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_905_SortArrayByPartily {
    public static int[] sortArrayByParity(int[] nums) {
        if(nums.length == 0 || nums==null) return new int[]{0};

        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num%2==0){
                list.add(num);
            }
        }
        for(int num: nums){
            if(num%2 != 0){
                list.add(num);
            }
        }
        int[] result = new int[list.size()];
        int index = 0;
        for(int n: list){
            result[index++] = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
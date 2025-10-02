import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_283_MoveZero {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j] != 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
      //  moveZeroes(nums);
        moveZero(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZero(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }
            while (list.size() < nums.length) {
                    list.add(0);

                }
            for (int j = 0; j < nums.length; j++) {
                   nums[j] = list.get(j);
                }
            }

        }

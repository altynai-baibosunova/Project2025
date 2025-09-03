import java.util.ArrayList;
import java.util.List;

public class MoveZeros {
    public void moveZeroes(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num != 0){
                list.add(num);
            }
        }
        while (list.size()< nums.length){
            list.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
    }


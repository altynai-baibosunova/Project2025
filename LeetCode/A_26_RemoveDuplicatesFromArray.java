import java.util.HashSet;
import java.util.Set;

public class A_26_RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int k=0;
        for (int num: nums) {
            if(!seen.contains(num)){
                seen.add(num);
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}

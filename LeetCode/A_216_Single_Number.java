import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A_216_Single_Number {
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(A_216_Single_Number.singleNumber(nums));
    }
}

import java.util.HashSet;
import java.util.Set;

public class A_26_RemoveDupl {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }else{

            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(remov(nums));
    }
















    public static int removeDup(int[] nums) {
        int index=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1] ){
                nums[index++] = nums[i];
            }

        }
        return index;
    }
    public static int remov(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int index =0;
        for(int i : nums){
            if(!seen.contains(i)){
                seen.add(i);
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}

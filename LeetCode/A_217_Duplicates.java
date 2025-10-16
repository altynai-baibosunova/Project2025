import java.util.HashSet;
import java.util.Set;

public class A_217_Duplicates {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();
        for(int num: nums){
            if(!seen.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

import java.util.HashSet;

public class HashsetMethod {
    public int missingNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) set.add(num);

        int min = 0;
        while(set.contains(min)){
            min++;

        }
        return min;

}

    public static void main(String[] args) {
        HashsetMethod obj = new HashsetMethod();
        int[] nums = {1,3,0,4};
        int result = obj.missingNumber(nums);
        System.out.println(result);

    }
}

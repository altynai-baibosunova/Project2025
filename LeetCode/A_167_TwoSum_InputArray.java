import java.util.Arrays;

public class A_167_TwoSum_InputArray {
    public static int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right= numbers.length-1;

        while (numbers[left]+numbers[right] != target){
            if(numbers[left]+numbers[right] < target) left++;
            else right--;
        }
        return new int[]{left+1,right+1};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers,9)));
    }
}

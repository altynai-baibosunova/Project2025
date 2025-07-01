import java.util.ArrayList;
import java.util.Arrays;

public class A_2161_ArrayWithPivot {
    public int[] pivotArray(int[] nums, int pivot) {

        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> bigger = new ArrayList<>();

        for (int num : nums){
            if(num < pivot){
                less.add(num);
            }else if(num == pivot) {
                equal.add(num);
            }else{
                 bigger.add(num);
                }
            }

        int[] result = new int[nums.length];
        int index = 0;

        for(int num : less){
            result[index++] = num;
        }
        for(int num : equal){
            result[index++] = num;
        }
        for(int num : bigger){
            result[index++] = num;
        }
        return result;


    }

    public static void main(String[] args) {
        A_2161_ArrayWithPivot obj = new A_2161_ArrayWithPivot();
        int nums[] = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        int[] result = obj.pivotArray(nums, pivot);

        System.out.println(Arrays.toString(result));
    }
}

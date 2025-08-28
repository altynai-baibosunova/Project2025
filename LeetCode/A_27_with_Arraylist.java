import java.util.ArrayList;
import java.util.List;

public class A_27_with_Arraylist {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num != val){
                list.add(num);
            }
        }
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }

    public static void main(String[] args) {
        A_27_RemoveElements obj = new A_27_RemoveElements();
        int[] nums = {2,3,3,2};
        int result = obj.removeElement(nums,3);
        System.out.println(result);
    }

}

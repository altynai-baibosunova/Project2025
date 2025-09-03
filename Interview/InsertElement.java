public class InsertElement {
    public int removeElement(int[] nums, int val) {

        int insertElem = 0;
        for (int num: nums) {
            if(num != val){
                nums[insertElem] = num;
                insertElem++;
            }

        }
        return insertElem;
    }

    public static void main(String[] args) {
        InsertElement obj = new InsertElement();
        int[] nums = {3,2,2,3};
        int result = obj.removeElement(nums, 3);
        System.out.println(result);
    }
}

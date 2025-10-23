public class A_169_MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int cand = 0;
        for (int num:
             nums) {
            if(count == 0){
                cand = num;
            }if(num == 0){
                count++;
            }else{
                count--;
            }
        }
        return cand;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(majorityElement(nums));
    }
}

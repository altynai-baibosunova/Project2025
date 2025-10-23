public class A_169_MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cand = -1;
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
}

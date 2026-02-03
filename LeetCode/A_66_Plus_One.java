import java.util.Arrays;

public class A_66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;

        for(int i=len-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] result = new int[len+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9};
        A_66_Plus_One obj = new A_66_Plus_One();
        int[] res = obj.plusOnes(digits);
        System.out.println(Arrays.toString(res));
    }





















    public int[] plusOnes(int[] digits) {
        int len = digits.length;
        for (int i = len-1; i <=0 ; i++) {
            if(digits[i] < 9){
                digits[i]++;
            }else{
                digits[i] = 0;
            }

        }
        int[] res = new int[len+1];
        res[0] = 1;
        return res;

    }
}

//1,2,3
//1,2,4

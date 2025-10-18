import java.util.Arrays;

public class A_66_PlusOne {
        public static int[] plusOne(int[] digits) {

            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                return arr;
            }

    public static void main(String[] args) {
            int [] digits =  {9,9,9};
        System.out.println(Arrays.toString(plusOne( digits)));
    }
}

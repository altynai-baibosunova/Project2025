import java.util.Locale;

public class A_125_ValPalindr {
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        return s.equals(reverse("man"));

    }
    private static String reverse(String a){
        int left = 0;
        int right = a.length()-1;
        char[] aaa = a.toCharArray();
        while (left<right){
            char temp = aaa[left];
            aaa[left] = aaa[right];
            aaa[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(aaa);

    }

    public static void main(String[] args) {
        String s = "nam";
        System.out.println(isPalindrome(s));
    }

}

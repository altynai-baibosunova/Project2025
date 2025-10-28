import java.util.Locale;

public class A_125_ValPalindr {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        return s.equals(reverse("man"));

    }
    private String reverse(String a){
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

}

public class A_125_ValidPalindrome {
    public static boolean isPalindrome(String s) {
 return helper(s, 0, s.length()-1);
    }
    private static boolean helper(String s, int left, int right){
        if(left>=right) {
            return true;
        }
        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
            return false;
        }
        return helper(s,left+1,right-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}

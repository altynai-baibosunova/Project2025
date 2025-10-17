public class A_125_ValidPal {
    class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase().replaceAll("[^a-z0-9]","");
            return helper(s,0,s.length()-1);
        }
        private boolean helper(String s, int left, int right){
            String palindrom = s;
            char[] letters = s.toCharArray();
            while(left<right){
                char swap = letters[left];
                letters[left] = letters[right];
                letters[right] = swap;
                left++;
                right--;
            }
            s = String.valueOf(letters);
            return s.equals(palindrom);
        }
    }

    public static void main(String[] args) {

    }

}

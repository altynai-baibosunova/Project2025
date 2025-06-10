// public class ValidPalindrome_125 {
//    public static boolean isPalindrome(String s) {
//        StringBuilder name = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            char letter = s.charAt(i);
//
//            if (Character.isLetterOrDigit(letter)) {
//                name.append(Character.toLowerCase(letter));
//            }
//        }
//
//      // if(name.length()== 0 || name.length() == 1) return true;
//
//        int left = 0;
//        int right = name.length()-1;
//        while (left < right) {    //0<3
//            if (name.charAt(left) != name.charAt(right)) {
//                return false;
//            }
//
//            left++;
//            right--;
//
//        }
//        return true;
//    }
//
//
//
//     public static void main(String[] args) {
//         System.out.println(isPalindrome("level"));
//
//
//
//
//
//
//
//
//     }
//}

// StringBuilder filtered = new StringBuilder();
//
//        // Step 1: Clean the input (keep only alphanumeric, convert to lowercase)
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (Character.isLetterOrDigit(c)) {
//                filtered.append(Character.toLowerCase(c));
//            }
//        }
//
//        // Step 2: Check palindrome using two pointers
//        int left = 0, right = filtered.length() - 1;
//        while (left < right) { //  0<3
//            if (filtered.charAt(left) != filtered.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//
//        return true;
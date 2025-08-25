public class A_Palindrome_09 {

        public static boolean isPalindrome(int x) {

            String original = Integer.toString(x);
            String reversed = "";
            Boolean palindrome = true;

            for(int i=original.length()-1; i>=0; i--){
                reversed += original.charAt(i);
            }
            if(!reversed.equals(original)){
                palindrome = false;
            }
            return palindrome;
        }

        public static void main(String[] args) {
            int x = 121;
            Boolean result = A_Palindrome_09.isPalindrome(x);
            System.out.println(result);

        }

        }


public class A_9_Palind{
    public boolean isPalindrome(int x) {

        String word = Integer.toString(x);
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);

            }
        return word.equals(reversed);
        }








//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and
// from right to left.



    public static boolean isPalindr(int x) {
        String original = String.valueOf(x);
        String reverse = new StringBuilder(original).reverse().toString();

        return original.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPalindr(123));
    }
        }

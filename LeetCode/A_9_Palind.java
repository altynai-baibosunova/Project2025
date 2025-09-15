public class A_9_Palind{
    public boolean isPalindrome(int x) {

        String word = Integer.toString(x);
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);

            }
        return word.equals(reversed);
        }

        }

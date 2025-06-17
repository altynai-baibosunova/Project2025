import java.util.Scanner;

    class Solution {
        public String reverseString(char[] s) {
            String reverse = "";
            int len = s.length;

            for (int i = len - 1; i >= 0; i--) {
                reverse = reverse + s[i];
            }
            return reverse;
        }

        public static void main(String[] arg) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to reverse: ");
            String input = scanner.nextLine();         // Get user input
            char[] charArray = input.toCharArray();    // Convert to char[]

            Solution obj = new Solution();
            String reversed = obj.reverseString(charArray);  // Pass char[] as argument

            System.out.println("Reversed string: " + reversed);
        }
    }


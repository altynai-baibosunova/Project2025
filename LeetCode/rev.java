import java.util.Scanner;

public class rev {
    public String reverseString(char[] s) {
        String reversed = "";
        int lenOFs = s.length;

        for (int i = lenOFs-1; i >=0 ; i--) {
            reversed = reversed+s[i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String input = scanner.nextLine();

        char[] eachLetter = input.toCharArray();

        rev obj = new rev();
        String result = obj.reverseString(eachLetter);
        System.out.println(result);

    }
}

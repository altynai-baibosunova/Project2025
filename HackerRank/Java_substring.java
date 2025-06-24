import java.util.Scanner;

public class Java_substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int startWord = scanner.nextInt();
        int endWord = scanner.nextInt();

        String newSubstringWord = word.substring(startWord,endWord);
        System.out.println(newSubstringWord);
    }
}
//Helloworld
//3 7

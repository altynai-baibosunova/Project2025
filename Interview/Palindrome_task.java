public class Palindrome_task {
    public static boolean palindr(String word){
        //reverse
        //compare

        String palinrome = "";
        char[] w = word.toCharArray();

        for (int i = word.length()-1; i >=0 ; i--) {
            palinrome += word.charAt(i);

        }
        return word.equals(palinrome);
    }

    public static void main(String[] args) {
        System.out.println(palindr("rar"));
    }
}

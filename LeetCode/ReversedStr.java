public class ReversedStr {

    public static void main(String[] args) {

        String word = "ants";
        String reverse = "";

        int len = word.length();

        for (int i = len-1; i >= 0; i--) {
             reverse=reverse+word.charAt(i);

        }
        System.out.println(reverse);
    }
    }


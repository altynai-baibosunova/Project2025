public class countString {
    public static void main(String[] args) {
        String word = "Peach";
        char[] singleLetter = new char[]{'P','e','a','c','h'};

        for(int i=0; i<singleLetter.length; i++){
            System.out.println(singleLetter[i]);
        }
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }
}

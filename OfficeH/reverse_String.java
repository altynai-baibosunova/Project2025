public class reverse_String {
    public static String reverse(String word){

        char[] letter = word.toCharArray();
        int left = 0;
        int rigth = letter.length-1;

        while (left<rigth){
            char temp = letter[left];
            letter[left] = letter[rigth];
            letter[rigth] = temp;
            left++;
            rigth--;
        }
        return new String(letter);

    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }
}

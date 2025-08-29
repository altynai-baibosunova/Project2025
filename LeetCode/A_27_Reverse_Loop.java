public class A_27_Reverse_Loop {
    public static String revers(String word){
        String r = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            r += word.charAt(i);

        }
        return r;
    }

    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(revers(word));
    }
}

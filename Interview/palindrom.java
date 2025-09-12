public class palindrom {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        String original = String.valueOf(x);
        String reverse = "";

        for (int i = original.length()-1; i >= 0 ; i--) {
            reverse += original.charAt(i);
        }
        return original.equals(reverse);
    }

    public static void main(String[] args) {
        palindrom obj = new palindrom();
        boolean result = obj.isPalindrome(121);
        System.out.println(result);
    }
}

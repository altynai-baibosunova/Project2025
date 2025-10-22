public class A_344_ReverseString {
    public static char[] reverse(char[] s){
        int left = 0;
        int right = s.length-1;
        while (left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
return s;
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l'};
        System.out.println(reverse(s));
    }
}

public class AzretClass_ReverseString {
    public static String reverseString(char[] s){
        char[] t = new StringBuilder().append(s).reverse().toString().toCharArray();
        System.arraycopy(t,0,s,0,s.length);
        return null;
    }

    public static String reverseStringOther(char[] original){
        int a = 0;
        int b = original.length-1;
        while(a < b){
            char temp = original[a];
            original[a] = original[b];
            original[b]=temp;
            a++;
            b--;
        }
        return null;

    }
}

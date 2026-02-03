public class A_191_NumberOf1Bits {
    public static int humW(int n){
        int count=0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(humW(11));
    }
}

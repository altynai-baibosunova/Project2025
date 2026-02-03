import java.util.HashSet;
import java.util.Set;
//
public class A_3_LongestSubstring {
//    public static int lengthOfLongestSubstring(String s) {
//        int maxL = 0;
//        for (int start = 0; start < s.length(); start++) {
//            Set<Character> seen = new HashSet<>();
//            for (int end = start; end < s.length(); end++) {
//                char letter = s.charAt(end);
//                if(seen.contains(letter)){
//                    break;
//                }
//                seen.add(letter);
//                int currentL = end-start+1;
//                maxL = Math.max(maxL, currentL);
//            }
//
//        }
//        return maxL;
//    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringOptimaze("abcabcbb"));
    }











//String: "abcabcbb"
    //* Step 1: [a]bcabcbb          - length 1, seen={a}
    //     * Step 2: [ab]cabcbb          - length 2, seen={a,b}
    //     * Step 3: [abc]abcbb          - length 3, seen={a,b,c} ← max so far!
    //     * Step 4: abc[a]bcbb          - found 'a', remove from left
    //     *         a[bca]bcbb          - length 3, seen={b,c,a}
    //     * Step 5: a[bcab]cbb          - found 'b', remove from left
    //     *         ab[cab]cbb          - length 3, seen={c,a,b}
    //     * Step 6: abc[abc]bb          - found 'c', remove from left
    //     *         abca[bc]bb          - length 2, seen={a,b,c}
    //     * Step 7: abcab[cb]b          - length 2, seen={c,b}
    //     * Step 8: abcabc[b]b          - found 'b', shrink window
    //     *         abcabcb[b]          - length 1, seen={b}


    public static int lengthOfLongestSubstringOptimaze(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;

        int maxLength = 0;
        int n = s.length();
        while(right<n){
            if(!window.contains(s.charAt(right))){

                window.add(s.charAt(right));
                System.out.println(window);
                System.out.println("Added: "+s.charAt(right));
                right++;

                maxLength = Math.max(maxLength, right-left);
               // System.out.println("printing after Math.max: "+maxLength);
              //  System.out.println("  → Extended window to [" + left + ", " + (right) + "]");
            }else{
                window.remove(s.charAt(left));
                left++;
                System.out.println("After remove: "+s.charAt(left));
            }
        }
        System.out.println("Final result: "+maxLength);
        return maxLength;



    }
}

import java.util.HashSet;
import java.util.Set;

public class A_3_LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxL = 0;
        for (int start = 0; start < s.length(); start++) {
            Set<Character> seen = new HashSet<>();
            for (int end = start; end < s.length(); end++) {
                char letter = s.charAt(end);
                if(seen.contains(letter)){
                    break;
                }
                seen.add(letter);
                int currentL = end-start+1;
                maxL = Math.max(maxL, currentL);
            }

        }
        return maxL;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("gvfbb"));
    }
}

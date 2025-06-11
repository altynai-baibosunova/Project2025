import com.sun.source.tree.BreakTree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A_242_Anagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            char[] sa = s.toCharArray();
            char[] ta = t.toCharArray();

            Arrays.sort(sa);
            Arrays.sort(ta);

            return Arrays.equals(sa, ta);
        }

    }
}

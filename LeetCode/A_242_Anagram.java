import com.sun.source.tree.BreakTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A_242_Anagram {
        public boolean isAnagram(String s, String t) {
            char[] sa = s.toCharArray();
            char[] ta = t.toCharArray();

            Arrays.sort(sa);
            Arrays.sort(ta);

            return Arrays.equals(sa, ta);
        }

    public static void main(String[] args) {
            A_242_Anagram obj = new A_242_Anagram();
            String s = "Mama";
            String t = "Papa";
           boolean result = obj.isAnagram(s,t);

        System.out.println(result);
    }
    }


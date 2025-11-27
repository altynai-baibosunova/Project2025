import com.sun.source.tree.BreakTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A_242_Anagram {
        public static boolean isAnagram(String s, String t) {
            char[] sa = s.toCharArray();
            char[] ta = t.toCharArray();

            Arrays.sort(sa);
            Arrays.sort(ta);

            return Arrays.equals(sa, ta);
        }

    public static void main(String[] args) {

            String s = "Mama";
            String t = "Papa";


        System.out.println(isAnagramACSII(s,t));
    }


    public static boolean isAnagr(String s, String t) {
            char[] ss = s.toCharArray();
            Arrays.sort(ss);
            char[] tt = t.toCharArray();
            Arrays.sort(tt);

           if(ss.length == tt.length){
               return true;
           }
           return false;
    }


    public static boolean isA(String s, String t) {
            if(s.length() != t.length()) return false;

            int[] freq = new int[26];
            for(int i=0; i<s.length(); i++){
                freq[s.charAt(i) - 'a']++;
                freq[t.charAt(i) - 'a']--;

            }

            for(int n: freq) {
                if (n != 0) return false;
            }
            return true;
    }

    public static boolean isAnagramACSII(String s, String t) {
            int[] count = new int[26];

            for(int i=0; i<s.length(); i++){
                char sa = s.charAt(i);
                count[sa-'a']++;
            }
        for(int i=0; i<t.length(); i++){
            char ta = t.charAt(i);
            count[ta-'a']--;
        }
        for (int i : count){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
    }


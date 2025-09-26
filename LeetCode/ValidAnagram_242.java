public class ValidAnagram_242 {
        public static boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            return isAnagram(s,t);
        }

    }


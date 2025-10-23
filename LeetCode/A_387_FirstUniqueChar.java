import java.util.HashMap;
import java.util.Map;

public class A_387_FirstUniqueChar {

        public static int firstUniqChar(String s) {
            Map<Character, Integer> count = new HashMap<>();
            for (char c : s.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : count.entrySet()) {
                if (entry.getValue() == 1) {
                    return s.indexOf(entry.getKey());
                }
            }
            return -1;
        }


    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}

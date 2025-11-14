import java.util.HashSet;
import java.util.Set;

public class a {
    public static int lengthOflongestSubstringBetter(String word){

        int maxLength = 0;
        for(int start=0; start<word.length(); start++){
            Set<Character> seen = new HashSet<>();
            for(int end=start; end<word.length(); end++){
                char letter = word.charAt(end);

                if(seen.contains(letter)){
                    break;

                }
                System.out.println(letter+" letter");
                seen.add(letter);
                System.out.println(seen+" seen");
                int currentLength = end - start + 1;
                System.out.println(currentLength+" current length");
                maxLength = Math.max(maxLength, currentLength);
                System.out.println(maxLength+" maxLength");
            }
        }
return maxLength;
    }

    public static void main(String[] args) {
        System.out.print(lengthOflongestSubstringBetter("aabhju"));

    }

}
//      Given a string, find the length of the longest substring
//     without repeating characters.
//
//     A SUBSTRING is a contiguous sequence of characters within a string.
//
// Input: "abcabcbb"
//      Output: 3
//     Explanation: The longest substring is "abc", length 3

//pwwkew
//100 char

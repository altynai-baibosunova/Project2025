import javax.crypto.spec.PSource;

public class Reverse {
    public static String rev(String word){
        char[] singleLetter = word.toCharArray();
        int left = 0;
        int right = singleLetter.length-1;

        while(left<right){
            char temp = singleLetter[left];
            singleLetter[left] = singleLetter[right];
            singleLetter[right] = temp;
            left++;
            right--;
        }
        return new String(singleLetter);

    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        String reversed = obj.rev("Hello");
        System.out.println(reversed);


     }


    }


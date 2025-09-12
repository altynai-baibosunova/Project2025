public class reverseINT {

        public int reverseInt(int s) {

            String sToString = String.valueOf(s);
            int left=0;
            int right=sToString.length()-1;
            char[] chars = sToString.toCharArray();


            while(left<right){
                char temp = chars[left];
                chars [left] = chars[right];
                chars[right] = temp;
                left++;
                right++;
            }
            return Integer.parseInt(new String(chars));

        }
    }



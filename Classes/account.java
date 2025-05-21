import java.util.ArrayList;

public class account {
    class Geeks {
        // Function to insert element
        public static void insert(ArrayList<Character> clist, char c) {
            // your code Input: i g i e i e i k i s f e

            clist.add(c);

        }

        // Function to count frequency of element
        public static void freq(ArrayList<Character> clist, char c) {
            // your code
         int count=0;
         for(char ch:clist){
             if(ch==c){
                 count++;
             }
            }
            System.out.println(count);
        }
    }

}

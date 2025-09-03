import java.io.*;
import java.util.*;

    public class Java_token {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.


            String[] tokens = s.trim().split("[^A_Za-z]+");

            if(s.trim().isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(tokens.length);
            }
            for(String token : tokens){
                System.out.println(token);
            }
        }
    }

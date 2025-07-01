import java.io.*;
import java.util.*;

    public class Java_String{

        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            /* Enter your code here. Print output to STDOUT. */

            System.out.println(A.length()+B.length());

            System.out.println(A.compareTo(B)>0 ? "Yes":"No");

            String ACapital = A.substring(0,1)+A.toUpperCase()+A.substring(1);
            String BCapital = B.substring(0,1)+B.toUpperCase()+B.substring(1);
            System.out.println(ACapital+" "+BCapital);
        }
    }




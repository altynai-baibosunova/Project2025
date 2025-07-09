import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();
        int num = scanner.nextInt();


        while(num>0){
            nums.add(scanner.nextInt());
            num--;
        }
        int numofQ = scanner.nextInt();
        while(numofQ>0){
            numofQ--;
            if("Insert".equalsIgnoreCase(scanner.next())){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                nums.add(index, value);
            }else if("Delete".equalsIgnoreCase(scanner.next())){
                int index = scanner.nextInt();
                nums.remove(index);
            }

        }
        scanner.close();
            for(int value:nums){
                System.out.print(value+" ");

            }
        }




    }